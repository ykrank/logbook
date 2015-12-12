/**
 * 
 */
package logbook.data.nio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.json.JsonObject;

import logbook.dto.ShipDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author ykrank
 *
 */
public class ShipNioInfo {
    /**
     * 所有船的资料
     */
    @SerializedName("ships")
    @Expose
    public List<ShipNioBean> ships = new ArrayList<ShipNioBean>();
    /**
     * 舰队
     */
    @SerializedName("api_deck_port_str")
    @Expose
    public String apiDeckPort;
    /**
     * 澡堂
     */
    @SerializedName("api_ndock_str")
    @Expose
    public String apiNdock;

    public static ShipNioInfo toNioShipsInfo(Map<Integer, ShipDto> shipMap, JsonObject apidata) {
        if ((shipMap == null) || (apidata == null)) {
            return null;
        }
        ShipNioInfo shipsInfo = new ShipNioInfo();
        shipsInfo.ships = ShipNioBean.toBeans(shipMap.values());
        shipsInfo.apiDeckPort = apidata.getJsonArray("api_deck_port").toString();
        shipsInfo.apiNdock = apidata.getJsonArray("api_ndock").toString();
        return shipsInfo;
    }
}
