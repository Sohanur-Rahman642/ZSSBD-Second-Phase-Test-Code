package com.example.zs.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class dataArray {

    @SerializedName("contact")
    @Expose
    public String contact;

    @SerializedName("firstname")
    @Expose
    public String firstname;

    @SerializedName("surname")
    @Expose
    public String surname;

    @SerializedName("companyname")
    @Expose
    public String companyname;

    @SerializedName("userid")
    @Expose
    public String userid;

    public String getContact() {
        return contact;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getUserid() {
        return userid;
    }
}
