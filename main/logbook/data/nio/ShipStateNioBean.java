/**
 * 
 */
package logbook.data.nio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;

import logbook.internal.AkashiTimer.ShipState;

/**
 * @author AdminYkrank
 *
 */
public class ShipStateNioBean {
    /** 舰船详情 */
    @Expose
    public ShipNioBean ship;
    /** 全部回复的时间点 */
    @Expose
    public Date finish;

    public static List<ShipStateNioBean> toBeans(Map<Integer, ShipState> stateMap) {
        List<ShipStateNioBean> beans = new ArrayList<>();
        for (ShipState shipState : stateMap.values()) {
            beans.add(toBean(shipState));
        }
        return beans;
    }

    public static ShipStateNioBean toBean(ShipState shipState) {
        ShipStateNioBean nioBean = new ShipStateNioBean();
        nioBean.ship = ShipNioBean.toBean(shipState.getShip());
        nioBean.finish = shipState.getFinish();
        return nioBean;
    }
}
