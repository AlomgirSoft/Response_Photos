package com.example.response_photos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recycler);


       Response_Photos_DTO response_photos_dto= Response_Photos_Clinet.getRetrofit().create(Response_Photos_DTO.class);

        Call<List<ResponseItem>>response=response_photos_dto.GetAll_response();

        response.enqueue(new Callback<List<ResponseItem>>() {
            @Override
            public void onResponse(Call<List<ResponseItem>> call, Response<List<ResponseItem>> response) {
                if (response.isSuccessful()){
                    Log.i("TAG", "code: "+response.code());
                  List<ResponseItem>responseItemList=response.body();

                  Photos_Adapter adapter = new Photos_Adapter(MainActivity.this,responseItemList);
                  recyclerView.setAdapter(adapter);



                }
            }

            @Override
            public void onFailure(Call<List<ResponseItem>> call, Throwable t) {

            }
        });





    }
}