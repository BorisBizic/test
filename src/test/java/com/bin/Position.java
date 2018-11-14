
package com.bin;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.test.Position_;
import com.test.Team;
import com.test.UserRole;

public class Position {

    @SerializedName("Seniority")
    @Expose
    private Object seniority;
    @SerializedName("Teams")
    @Expose
    private List<Team> teams = null;
    @SerializedName("Positions")
    @Expose
    private List<Position_> positions = null;
    @SerializedName("UserRoles")
    @Expose
    private List<UserRole> userRoles = null;

    public Object getSeniority() {
        return seniority;
    }

    public void setSeniority(Object seniority) {
        this.seniority = seniority;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Position_> getPositions() {
        return positions;
    }

    public void setPositions(List<Position_> positions) {
        this.positions = positions;
    }

    public List<UserRole> getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles) {
        this.userRoles = userRoles;
    }

}
