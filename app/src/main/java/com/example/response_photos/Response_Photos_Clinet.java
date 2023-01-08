package com.example.response_photos;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Response_Photos_Clinet {


    private static Retrofit retrofit = null;


    public static Retrofit getRetrofit(){

        if (retrofit==null){
            retrofit= new Retrofit.Builder()
                    .baseUrl(Conestain_Photos_GSON_URI.BASE_URI)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        }





        return retrofit;
    }





}
