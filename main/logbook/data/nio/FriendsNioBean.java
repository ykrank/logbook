/**
 * 
 */
package logbook.data.nio;

import java.util.ArrayList;
import java.util.List;

import logbook.dto.DockDto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author ykrank
 *
 */
public class FriendsNioBean {
    /** ドックID */
    @SerializedName("id")
    @Expose
    public String id;

    /** 艦隊名 */
    @SerializedName("name")
    @Expose
    public String name;

    /** 艦娘*/
    @SerializedName("ships")
    @Expose
    public List<ShipNioBean> ships = new ArrayList<ShipNioBean>();

    /** 退避的舰娘 */
    @SerializedName("escaped")
    @Expose
    public boolean[] escaped = null;

    public static List<FriendsNioBean> toBeans(List<DockDto> docks) {
        List<FriendsNioBean> friends = new ArrayList<>();
        for (DockDto dock : docks) {
            friends.add(toBean(dock));
        }
        return friends;
    }

    public static FriendsNioBean toBean(DockDto dock) {
        FriendsNioBean friend = new FriendsNioBean();
        friend.id = dock.getId();
        friend.name = dock.getName();
        friend.ships = ShipNioBean.toBeans(dock.getShips());
        friend.escaped = dock.getEscaped();
        return friend;
    }
}
