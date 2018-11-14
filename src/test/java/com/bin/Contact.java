package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("PrivateEmail")
    @Expose
    private Object privateEmail;
    @SerializedName("PrivatePhone")
    @Expose
    private Object privatePhone;
    @SerializedName("EmergencyContact")
    @Expose
    private Object emergencyContact;
    @SerializedName("RegisteredAddress")
    @Expose
    private Object registeredAddress;
    @SerializedName("ResidentialAddress")
    @Expose
    private Object residentialAddress;

    public Object getPrivateEmail() {
        return privateEmail;
    }

    public void setPrivateEmail(Object privateEmail) {
        this.privateEmail = privateEmail;
    }

    public Object getPrivatePhone() {
        return privatePhone;
    }

    public void setPrivatePhone(Object privatePhone) {
        this.privatePhone = privatePhone;
    }

    public Object getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(Object emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Object getRegisteredAddress() {
        return registeredAddress;
    }

    public void setRegisteredAddress(Object registeredAddress) {
        this.registeredAddress = registeredAddress;
    }

    public Object getResidentialAddress() {
        return residentialAddress;
    }

    public void setResidentialAddress(Object residentialAddress) {
        this.residentialAddress = residentialAddress;
    }

}
