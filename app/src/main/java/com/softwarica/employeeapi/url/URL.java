package com.softwarica.employeeapi.url;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class URL {

    public static final String base_url = "http://dummy.restapiexample.com/api/v1/";

    public static Retrofit CreateInstance(){
        Retrofit retrofit = new Retrofit.Builder()

                .baseUrl(URL.base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}
