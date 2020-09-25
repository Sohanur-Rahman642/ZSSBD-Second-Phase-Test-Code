package com.example.zs.service.repository;

import com.example.zs.service.model.Event;
import com.example.zs.service.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface EventService {

    @GET("RecruitmentTest.json")
    Call<List<Event>> getEventList();
}
