package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Child {

    @SerializedName("Id")
    @Expose
    private Integer id;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Gender")
    @Expose
    private String gender;
    @SerializedName("DateOfBirth")
    @Expose
    private String dateOfBirth;
    @SerializedName("Relation")
    @Expose
    private String relation;
    @SerializedName("PersonalId")
    @Expose
    private String personalId;
    @SerializedName("ContactNumber")
    @Expose
    private Object contactNumber;
    @SerializedName("IsEmergencyContact")
    @Expose
    private Boolean isEmergencyContact;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public Object getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Object contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Boolean getIsEmergencyContact() {
        return isEmergencyContact;
    }

    public void setIsEmergencyContact(Boolean isEmergencyContact) {
        this.isEmergencyContact = isEmergencyContact;
    }

}
