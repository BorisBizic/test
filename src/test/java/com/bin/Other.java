
package com.bin;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Other {

    @SerializedName("FamilySaintDay")
    @Expose
    private String familySaintDay;
    @SerializedName("FamilySaintDayDate")
    @Expose
    private String familySaintDayDate;
    @SerializedName("Allergies")
    @Expose
    private Object allergies;
    @SerializedName("TshirtSize")
    @Expose
    private String tshirtSize;
    @SerializedName("Diet")
    @Expose
    private Object diet;
    @SerializedName("Glasses")
    @Expose
    private Boolean glasses;
    @SerializedName("Disability")
    @Expose
    private Object disability;

    public String getFamilySaintDay() {
        return familySaintDay;
    }

    public void setFamilySaintDay(String familySaintDay) {
        this.familySaintDay = familySaintDay;
    }

    public String getFamilySaintDayDate() {
        return familySaintDayDate;
    }

    public void setFamilySaintDayDate(String familySaintDayDate) {
        this.familySaintDayDate = familySaintDayDate;
    }

    public Object getAllergies() {
        return allergies;
    }

    public void setAllergies(Object allergies) {
        this.allergies = allergies;
    }

    public String getTshirtSize() {
        return tshirtSize;
    }

    public void setTshirtSize(String tshirtSize) {
        this.tshirtSize = tshirtSize;
    }

    public Object getDiet() {
        return diet;
    }

    public void setDiet(Object diet) {
        this.diet = diet;
    }

    public Boolean getGlasses() {
        return glasses;
    }

    public void setGlasses(Boolean glasses) {
        this.glasses = glasses;
    }

    public Object getDisability() {
        return disability;
    }

    public void setDisability(Object disability) {
        this.disability = disability;
    }

}
