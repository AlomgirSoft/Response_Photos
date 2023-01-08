package com.example.response_photos;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Response_Photos_DTO {


    @GET("/photos")
  Call<List<ResponseItem>>GetAll_response();

}
