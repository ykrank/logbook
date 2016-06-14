package logbook.data.nio;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import logbook.dto.MapCellDto;

public class MapCellNioBean {
    /**
     * 地图详情
     * <ol>
     *  <li>海域ID</li>
     *  <li>海域中的地图ID</li>
     *  <li>地图中的点ID</li>
     * </ol>
     */
    @SerializedName("map")
    @Expose
    public int[] map = new int[3];
    /** 敵ID */
    @SerializedName("enemyId")
    @Expose
    public int enemyId;
    /** 点的颜色 */
    @SerializedName("color_id")
    @Expose
    public int colorNo;
    /** 是否BOSS点 */
    @SerializedName("is_boss")
    @Expose
    public boolean isBoss;
    /** 是否起点 */
    @SerializedName("is_start")
    @Expose
    public boolean start;
    @SerializedName("event_id")
    @Expose
    public int eventId = -1;
    @SerializedName("event_kind")
    @Expose
    public int eventKind;

    public static MapCellNioBean toMapCellNioBean(MapCellDto mapCellDto) {
        if (mapCellDto == null) {
            return null;
        }
        MapCellNioBean mInfo = new MapCellNioBean();
        mInfo.map = mapCellDto.getMap();
        mInfo.enemyId = mapCellDto.getEnemyId();
        mInfo.colorNo = mapCellDto.getColorNo();
        mInfo.isBoss = mapCellDto.isBoss();
        mInfo.start = mapCellDto.isStart();
        mInfo.eventId = mapCellDto.getEventId();
        mInfo.eventKind = mapCellDto.getEventKind();
        return mInfo;
    }

    /**
     * 获取类型
     * @return
     */
    public String getNextKind() {
        if (this.eventId == -1) {
            if (this.isBoss) {
                return "ボス";
            }
            return null;
        }

        switch (this.eventId) {
        case 2:
            return "資源獲得";
        case 3:
            return "渦潮";
        case 4:
            return "戦闘";
        case 5:
            return "ボス";
        case 6:
            switch (this.eventKind) {
            case 1:
                return "敵影を見ず";
            case 2:
                return "能動分岐";
            }
            return "気のせい";
        case 7:
            if (this.eventKind == 0) {
                return "航空偵察";
            }
            return "航空戦";
        case 8:
            return "船団護衛成功";
        }

        return null;
    }
}
