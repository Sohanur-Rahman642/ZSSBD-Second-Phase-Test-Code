package com.example.zs.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User {

    @SerializedName("email")
    @Expose
    public String email;

    @SerializedName("password")
    @Expose
    public String password;

    @SerializedName("message")
    @Expose
    public String message;

    @SerializedName("dataArray")
    @Expose
    public dataArray[] dataArray;

    @SerializedName("contact")
    @Expose
    public String contact;


    @SerializedName("userid")
    @Expose
    public String userid;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMessage() {
        return message;
    }

    public dataArray[] getDataArray() {
        return dataArray;
    }

    public String getContact() {
        return contact;
    }



    public String getUserid() {
        return userid;
    }
}
