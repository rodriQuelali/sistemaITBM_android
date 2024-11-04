package com.example.sistemaitbm_reg.configHttp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {
    private static String URL = "https://apirestitpm.itpm.edu.bo/apis/index.php/";
    private static Retrofit retrofit;
    public static Retrofit getcarrera(){
        retrofit= new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }
}
