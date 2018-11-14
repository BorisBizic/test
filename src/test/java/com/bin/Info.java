
package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("DateOfBirth")
    @Expose
    private Object dateOfBirth;
    @SerializedName("PersonalId")
    @Expose
    private Object personalId;
    @SerializedName("Age")
    @Expose
    private Object age;
    @SerializedName("IdCard")
    @Expose
    private Object idCard;
    @SerializedName("HtecId")
    @Expose
    private String htecId;
    @SerializedName("Passport")
    @Expose
    private Object passport;

    public Object getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Object dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Object getPersonalId() {
        return personalId;
    }

    public void setPersonalId(Object personalId) {
        this.personalId = personalId;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getIdCard() {
        return idCard;
    }

    public void setIdCard(Object idCard) {
        this.idCard = idCard;
    }

    public String getHtecId() {
        return htecId;
    }

    public void setHtecId(String htecId) {
        this.htecId = htecId;
    }

    public Object getPassport() {
        return passport;
    }

    public void setPassport(Object passport) {
        this.passport = passport;
    }

}
