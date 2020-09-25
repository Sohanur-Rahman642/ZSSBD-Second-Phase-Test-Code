package com.example.zs.service.repository;

import com.example.zs.service.model.User;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginService {


    @POST("/user")
    @FormUrlEncoded
    Call<User> loginUser(@Field("email") String email,
                         @Field("password") String password);





}
