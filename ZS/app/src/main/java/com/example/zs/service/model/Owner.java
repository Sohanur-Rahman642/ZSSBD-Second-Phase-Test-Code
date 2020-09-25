package com.example.zs.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {

    @SerializedName("fullname")
    @Expose
    public String fullname;

    @SerializedName("username")
    @Expose
    public String username;

    @SerializedName("primary_team")
    @Expose
    public String primary_team;

    @SerializedName("avatar")
    @Expose
    public String avatar;

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPrimary_team() {
        return primary_team;
    }

    public String getAvatar() {
        return avatar;
    }
}
