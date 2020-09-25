package com.example.zs.service.repository;

public class ApiUtils {

    public static final String BASE_URL = "http://192.168.20.110/demo/";

    public static final String BASE_URL2 = "https://dhaka-static.zssbd.com/";

    public static LoginService getLoginService() {
        return LoginClient.getClient(BASE_URL).create(LoginService.class);

    }


    public static EventService getEventService() {
        return EventClient.getClient(BASE_URL2).create(EventService.class);

    }
}
