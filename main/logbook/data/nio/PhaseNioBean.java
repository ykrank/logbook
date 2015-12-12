/**
 * 
 */
package logbook.data.nio;

import logbook.dto.BattleExDto.Phase;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * @author ykrank
 *
 */
public class PhaseNioBean {
    @SerializedName("kind")
    @Expose
    private String kind;

    /** ランク */
    @SerializedName("rank")
    @Expose
    private String rank;

    /** 夜戦 */
    @SerializedName("isnight")
    @Expose
    private boolean isNight;

    public static PhaseNioBean toPhase(Phase phase) {
        PhaseNioBean phaseNioBean = new PhaseNioBean();
        if (phase.getKind() != null) {
            phaseNioBean.kind = phase.getKind().name();
        }
        if (phase.getEstimatedRank() != null) {
            phaseNioBean.rank = phase.getEstimatedRank().name();
        }
        phaseNioBean.isNight = phase.isNight();
        return phaseNioBean;
    }
}
