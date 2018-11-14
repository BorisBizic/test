
package com.bin;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Test {

    @SerializedName("Personal")
    @Expose
    private Personal personal;
    @SerializedName("Other")
    @Expose
    private Other other;
    @SerializedName("Children")
    @Expose
    private List<Child> children = null;
    @SerializedName("HtecEmail")
    @Expose
    private String htecEmail;
    @SerializedName("PastExperience")
    @Expose
    private Integer pastExperience;
    @SerializedName("HTECExperience")
    @Expose
    private Integer hTECExperience;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("Skype")
    @Expose
    private Object skype;
    @SerializedName("Branch")
    @Expose
    private Branch branch;
    @SerializedName("UsualWorkingTime")
    @Expose
    private String usualWorkingTime;
    @SerializedName("Position")
    @Expose
    private Position position;
    @SerializedName("Related")
    @Expose
    private Related related;
    @SerializedName("Projects")
    @Expose
    private List<Object> projects = null;
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
    private String parentName;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("LoginStatusId")
    @Expose
    private Integer loginStatusId;

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public String getHtecEmail() {
        return htecEmail;
    }

    public void setHtecEmail(String htecEmail) {
        this.htecEmail = htecEmail;
    }

    public Integer getPastExperience() {
        return pastExperience;
    }

    public void setPastExperience(Integer pastExperience) {
        this.pastExperience = pastExperience;
    }

    public Integer getHTECExperience() {
        return hTECExperience;
    }

    public void setHTECExperience(Integer hTECExperience) {
        this.hTECExperience = hTECExperience;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getSkype() {
        return skype;
    }

    public void setSkype(Object skype) {
        this.skype = skype;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public String getUsualWorkingTime() {
        return usualWorkingTime;
    }

    public void setUsualWorkingTime(String usualWorkingTime) {
        this.usualWorkingTime = usualWorkingTime;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Related getRelated() {
        return related;
    }

    public void setRelated(Related related) {
        this.related = related;
    }

    public List<Object> getProjects() {
        return projects;
    }

    public void setProjects(List<Object> projects) {
        this.projects = projects;
    }

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

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
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
