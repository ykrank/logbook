package logbook.data.nio;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import logbook.dto.BattleExDto;

public class BattleNioInfo {
    /**
     * 队伍详情
     */
    @SerializedName("friends")
    @Expose
    public List<FriendsNioBean> friends = new ArrayList<>();
    /**
     * 敌人队伍详情
     */
    @SerializedName("enemys")
    @Expose
    public List<EnemyShipNioBean> enemys = new ArrayList<>();
    /**
     * 最近的战斗结果
     */
    @SerializedName("phase")
    @Expose
    public PhaseNioBean phase;
    /**
     * 地图详情
     */
    @SerializedName("mapinfo")
    @Expose
    public MapCellNioBean mapinfo;
    /** 地图名 */
    @Expose
    public String questName;
    /** 战斗评价*/
    @Expose
    public String rank;
    /** 敌人阵容名称 */
    @Expose
    public String enemyName;
    /** 是否掉船 */
    @Expose
    public boolean dropShip;
    /** 是否掉物品 */
    @Expose
    public boolean dropItem;
    /** 掉落船的类型 */
    @Expose
    public String dropType;
    /** 掉落船的名称 */
    @Expose
    public String dropName;
    /** 掉落船的ID */
    @Expose
    public int dropShipId;
    /** 掉落物品的名字 */
    @Expose
    public String dropItemName;
    /** 提督等级 */
    @Expose
    public int hqLv;
    /** 剩余船位 */
    @Expose
    public int shipSpace;
    /** 剩余装备位 */
    @Expose
    public int itemSpace;

    public static BattleNioInfo toBattleNioInfo(BattleExDto battle) {
        BattleNioInfo info = new BattleNioInfo();
        info.friends = FriendsNioBean.toBeans(battle.getFriends());
        info.enemys = EnemyShipNioBean.tobeans(battle.getEnemy(), battle.getLastPhase());
        info.phase = PhaseNioBean.toPhase(battle.getLastPhase());
        info.mapinfo = MapCellNioBean.toMapCellNioBean(battle.getMapCellDto());
        info.questName = battle.getQuestName();
        if (battle.getRank() != null) {
            info.rank = battle.getRank().name();
        }
        info.enemyName = battle.getEnemyName();
        info.dropShip = battle.isDropShip();
        info.dropItem = battle.isDropItem();
        info.dropType = battle.getDropType();
        info.dropName = battle.getDropName();
        info.dropShipId = battle.getDropShipId();
        info.dropItemName = battle.getDropItemName();
        info.hqLv = battle.getHqLv();
        info.shipSpace = battle.getShipSpace();
        info.itemSpace = battle.getItemSpace();
        return info;
    }
}
