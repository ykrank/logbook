/**
 * 
 */
package logbook.data.nio;

import java.util.ArrayList;
import java.util.List;

import logbook.dto.BattleExDto.Phase;
import logbook.dto.EnemyShipDto;

import com.google.gson.annotations.Expose;

/**
 * @author ykrank
 *
 */
public class EnemyShipNioBean {
    @Expose
    public int shipid;
    @Expose
    public String name;
    @Expose
    public int lv;
    @Expose
    public int stype;
    @Expose
    public int nowhp;

    public static List<EnemyShipNioBean> tobeans(List<EnemyShipDto> oldEnemys, Phase phase) {
        List<EnemyShipNioBean> ships = new ArrayList<EnemyShipNioBean>();
        for (int i = 0; i < oldEnemys.size(); i++) {
            EnemyShipDto oldEnemy = oldEnemys.get(i);
            EnemyShipNioBean ship = new EnemyShipNioBean();
            ship.shipid = oldEnemy.getShipId();
            ship.name = oldEnemy.getName();
            ship.lv = oldEnemy.getLv();
            ship.stype = oldEnemy.getStype();
            ship.nowhp = phase.getNowEnemyHp()[i];
            ships.add(ship);
        }
        return ships;
    }
}
