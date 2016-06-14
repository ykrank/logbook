package logbook.data.nio;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import logbook.dto.ItemDto;

public class ItemNioInfo {
    /**
     * 装备独立ID
     */
    @SerializedName("id")
    @Expose
    public int id;
    /**
     * 装备类型ID
     */
    @SerializedName("slotitemId")
    @Expose
    public int slotitemId;
    /**
     * [0]: 大分類（砲、魚雷、艦載機、...）
     * [1]: 図鑑の背景にある英語表記分類
     * [2]: 装備可能艦種別分類
     * [3]: 图标分类
     */
    @SerializedName("type")
    @Expose
    public int[] type = new int[4];
    /**
     * 名称
     */
    @SerializedName("name")
    @Expose
    public String name;
    /**
     * 类型名称
     */
    @SerializedName("type_name")
    @Expose
    public String typename;

    public static Map<Integer, ItemNioInfo> toItemNioMap(Map<Integer, ItemDto> items) {
        if (items == null) {
            return null;
        }
        Map<Integer, ItemNioInfo> itemMap = new HashMap<>();
        for (Entry<Integer, ItemDto> item : items.entrySet()) {
            ItemDto iDto = item.getValue();
            ItemNioInfo itemNio = new ItemNioInfo();
            itemNio.id = iDto.getId();
            itemNio.slotitemId = iDto.getSlotitemId();
            itemNio.type = iDto.getType();
            itemNio.name = iDto.getName();
            itemNio.typename = iDto.getTypeName();
            itemMap.put(item.getKey(), itemNio);
        }
        return itemMap;
    }
}
