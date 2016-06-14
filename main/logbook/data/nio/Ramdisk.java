package logbook.data.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.Map;

import javax.json.JsonObject;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import logbook.dto.BattleExDto;
import logbook.dto.MapCellDto;
import logbook.dto.ShipDto;
import logbook.internal.AkashiTimer.ShipState;
import logbook.internal.LoggerHolder;

public class Ramdisk {
    private static final LoggerHolder LOG = new LoggerHolder(Ramdisk.class);
    private static final Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

    private final String path;
    private int max_size = 1024 * 1024;

    /**
     * 内存映射文件默认大小 1M(1024*1024)
     * @param path 内存映射文件路径
     */
    public Ramdisk(String path) {
        this.path = path;
    }

    /**
     * 
     * @param path 内存映射文件路径
     * @param max_size 文件大小
     */
    public Ramdisk(String path, int max_size) {
        this.path = path;
        this.max_size = max_size;
    }

    /**
     * 将字节流写入映射内存
     * @param buffer
     * @return 是否成功
     */
    public boolean write(byte[] buffer) {
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(this.path, "rw");
            FileChannel fc = raf.getChannel();
            MappedByteBuffer mbb = fc.map(MapMode.READ_WRITE, 0, this.max_size);

            int flag = mbb.get(0); //读写标置第一个字节为 0
            while (flag != 0) { //不是可写标示 0，则重复循环，等待
                flag = mbb.get(0);
                Thread.sleep(1000);
            }
            mbb.clear();
            mbb.put(0, (byte) 1); //正在写数据，读写标志第一个字节为 1
            mbb.position(1);
            mbb.putInt(buffer.length); //存储有效数据长度
            mbb.put(buffer);
            mbb.put(0, (byte) 0); //写操作完成，置读写数据标志第一个字节为 0
            System.out.println("mbbPosition:" + mbb.position());
            return true;
        } catch (Exception e) {
            return false;
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 从内存映射文件读取字节流
     * @return 字节流，读取错误时为Null
     */
    public byte[] read() {
        byte[] buffer = null;
        RandomAccessFile raf = null;
        try {
            raf = new RandomAccessFile(this.path, "r");
            FileChannel fc = raf.getChannel();
            MappedByteBuffer mbb = fc.map(MapMode.READ_ONLY, 0, this.max_size);

            int flag = mbb.get(0); //读写标置第一个字节
            while (flag == 1) { //是正在写标示 1，则重复循环，等待
                Thread.sleep(1000);
                flag = mbb.get(0);
            }

            mbb.clear();
            mbb.position(1);
            int len = mbb.getInt();
            buffer = new byte[len];
            mbb.get(buffer);
            System.out.println("mbbPosition:" + mbb.position());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (raf != null) {
                try {
                    raf.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        return buffer;
    }

    public static void writeShipInfo(Map<Integer, ShipDto> shipMap, JsonObject apidata) throws Exception {
        try {
            Ramdisk shipRm = new Ramdisk("z:\\kancolle_ship.mm");
            //                Ramdisk itemRm = new Ramdisk("z:\\kancolle_item.mm");
            ShipNioInfo shipsInfo = ShipNioInfo.toNioShipsInfo(shipMap, apidata);
            //                Map<Integer, ItemNioInfo> itemsInfoMap = ItemNioInfo.toItemNioMap(itemMap);
            shipRm.write(gson.toJson(shipsInfo).getBytes("utf-8"));
            //                itemRm.write(gson.toJson(itemsInfoMap).getBytes("utf-8"));
        } catch (Exception e) {
            LOG.get().warn("写入舰船信息时出错", e);
            throw new Exception(e);
        }
    }

    public static void writeBattleInfo(BattleExDto battle) throws Exception {
        try {
            Ramdisk rm = new Ramdisk("z:\\kancolle_doBattle.mm");
            BattleNioInfo battleResultInfo = BattleNioInfo.toBattleNioInfo(battle);
            rm.write(gson.toJson(battleResultInfo).getBytes("utf-8"));
            //            rm.write(new Gson().toJson(battle).getBytes("utf-8"));
        } catch (Exception e) {
            LOG.get().warn("写入战斗信息时出错", e);
            throw new Exception(e);
        }
    }

    public static void writeNextMapCellInfo(MapCellDto mapCellDto) throws Exception {
        try {
            Ramdisk rm = new Ramdisk("z:\\kancolle_nextMapCell.mm");
            MapCellNioBean mInfo = MapCellNioBean.toMapCellNioBean(mapCellDto);
            rm.write(gson.toJson(mInfo).getBytes("utf-8"));
        } catch (Exception e) {
            LOG.get().warn("写入下一点信息时出错", e);
            throw new Exception(e);
        }
    }

    public static void writeShipState(Map<Integer, ShipState> stateMap) {
        try {
            Ramdisk rm = new Ramdisk("z:\\kancolle_shipState.mm");
            ShipStateNioInfo stateNioInfo = new ShipStateNioInfo();
            stateNioInfo.shipStates = ShipStateNioBean.toBeans(stateMap);
            rm.write(gson.toJson(stateNioInfo).getBytes("utf-8"));
        } catch (Exception e) {
            LOG.get().warn("写入舰船修理信息时出错", e);
        }
    }
}
