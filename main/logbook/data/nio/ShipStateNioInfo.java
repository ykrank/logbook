/**
 * 
 */
package logbook.data.nio;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author AdminYkrank
 *
 */
public class ShipStateNioInfo {
    @SerializedName("ship_states")
    @Expose
    public List<ShipStateNioBean> shipStates;
}
