/**
 * 
 */
package logbook.data.nio;

/**
 * @author ykrank
 *
 */
import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import logbook.dto.ShipDto;

public class ShipNioBean {

    /**
     * 舰船独立ID
     */
    @SerializedName("id")
    @Expose
    public Integer id;
    /**
     * 舰船名字
     */
    @SerializedName("name")
    @Expose
    public String name;
    /**
     * 舰船类型ID
     */
    @SerializedName("shipid")
    @Expose
    public Integer shipid;
    /**
     * 图鉴ID
     */
    @SerializedName("sortno")
    @Expose
    public Integer sortno;
    /**
     * 角色ID
     */
    @SerializedName("charid")
    @Expose
    public Integer charid;
    /**
     * 等级
     */
    @SerializedName("lv")
    @Expose
    public Integer lv;
    /**
     * 舰种ID
     */
    @SerializedName("stype")
    @Expose
    public Integer stype;
    /**
     * 目前HP
     */
    @SerializedName("nowhp")
    @Expose
    public Integer nowhp;
    /**
     * 最大HP
     */
    @SerializedName("maxhp")
    @Expose
    public Integer maxhp;
    /**
     * 疲劳度
     */
    @SerializedName("cond")
    @Expose
    public Integer cond;
    /**
     * 已锁
     */
    @SerializedName("locked")
    @Expose
    public boolean locked;
    /**
     * 舰船剩余的弹
     */
    @SerializedName("bull")
    @Expose
    public int bull;
    /**
     * 舰船剩余的油
     */
    @SerializedName("fuel")
    @Expose
    public int fuel;
    /**
     * 舰船最大的弹
     */
    @SerializedName("maxbull")
    @Expose
    public int maxBull;
    /**
     * 舰船最大的油
     */
    @SerializedName("maxfuel")
    @Expose
    public int maxFuel;
    /**
     * 砲撃戦火力
     */
    @SerializedName("hougekipower")
    @Expose
    public int hougekipower;
    /**
     * 舰队中的位置(0-5)
     */
    @SerializedName("fleetpos")
    @Expose
    public int fleetpos;
    /** 入渠時間 */
    @SerializedName("docktime")
    @Expose
    public long docktime;

    public static List<ShipNioBean> toBeans(Iterable<ShipDto> oldShips) {
        List<ShipNioBean> ships = new ArrayList<ShipNioBean>();
        for (ShipDto oldShip : oldShips) {
            ships.add(toBean(oldShip));
        }
        return ships;
    }

    public static ShipNioBean toBean(ShipDto oldShip) {
        ShipNioBean ship = new ShipNioBean();
        ship.id = oldShip.getId();
        ship.shipid = oldShip.getShipId();
        ship.charid = oldShip.getCharId();
        ship.name = oldShip.getName();
        ship.sortno = oldShip.getSortno();
        ship.lv = oldShip.getLv();
        ship.stype = oldShip.getStype();
        ship.nowhp = oldShip.getNowhp();
        ship.maxhp = oldShip.getMaxhp();
        ship.cond = oldShip.getCond();
        ship.locked = oldShip.getLocked();
        ship.bull = oldShip.getBull();
        ship.fuel = oldShip.getFuel();
        ship.maxBull = oldShip.getBullMax();
        ship.maxFuel = oldShip.getFuelMax();
        ship.hougekipower = oldShip.getHougekiPower();
        ship.fleetpos = oldShip.getFleetpos();
        ship.docktime = oldShip.getDocktime();
        return ship;
    }
}