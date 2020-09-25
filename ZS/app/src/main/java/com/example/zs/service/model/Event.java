package com.example.zs.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("title")
    @Expose
    public String title;

    @SerializedName("start_event")
    @Expose
    public String start_event;

    @SerializedName("end_event")
    @Expose
    public String end_event;

    @SerializedName("owner")
    @Expose
    public Owner owner;

    @SerializedName("caption")
    @Expose
    public String caption;

    @SerializedName("video")
    @Expose
    public String video;

    @SerializedName("photo")
    @Expose
    public String photo;

    @SerializedName("uploaded")
    @Expose
    public String uploaded;


    public String getTitle() {
        return title;
    }

    public String getStart_event() {
        return start_event;
    }

    public String getEnd_event() {
        return end_event;
    }

    public Owner getOwner() {
        return owner;
    }

    public String getCaption() {
        return caption;
    }

    public String getVideo() {
        return video;
    }

    public String getPhoto() {
        return photo;
    }

    public String getUploaded() {
        return uploaded;
    }
}
