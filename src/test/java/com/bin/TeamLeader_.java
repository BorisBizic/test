
package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeamLeader_ {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("ParentName")
    @Expose
    private Object parentName;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("LoginStatusId")
    @Expose
    private Integer loginStatusId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Object getParentName() {
        return parentName;
    }

    public void setParentName(Object parentName) {
        this.parentName = parentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getLoginStatusId() {
        return loginStatusId;
    }

    public void setLoginStatusId(Integer loginStatusId) {
        this.loginStatusId = loginStatusId;
    }

}
