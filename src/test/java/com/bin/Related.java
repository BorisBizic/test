
package com.bin;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.test.Superior;
import com.test.TeamLeader_;

public class Related {

    @SerializedName("Mentor")
    @Expose
    private Mentor mentor;
    @SerializedName("Superior")
    @Expose
    private Superior superior;
    @SerializedName("TeamLeaders")
    @Expose
    private List<TeamLeader_> teamLeaders = null;

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Superior getSuperior() {
        return superior;
    }

    public void setSuperior(Superior superior) {
        this.superior = superior;
    }

    public List<TeamLeader_> getTeamLeaders() {
        return teamLeaders;
    }

    public void setTeamLeaders(List<TeamLeader_> teamLeaders) {
        this.teamLeaders = teamLeaders;
    }

}
