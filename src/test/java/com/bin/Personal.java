
package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Personal {

    @SerializedName("Info")
    @Expose
    private Info info;
    @SerializedName("Contact")
    @Expose
    private Contact contact;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
