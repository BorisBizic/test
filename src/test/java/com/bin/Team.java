
package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.test.TeamLeader;

public class Team {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("TeamLeader")
    @Expose
    private TeamLeader teamLeader;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TeamLeader getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

}
