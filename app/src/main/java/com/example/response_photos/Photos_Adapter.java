package com.example.response_photos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class Photos_Adapter extends RecyclerView.Adapter<Photos_ViewHolder> {
    private Context context;
    private List<ResponseItem>responseItemList;

    public Photos_Adapter(Context context, List<ResponseItem> responseItemList) {
        this.context = context;
        this.responseItemList = responseItemList;
    }

    @NonNull
    @Override
    public Photos_ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.photos_item_list,parent,false);
        return new Photos_ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Photos_ViewHolder holder, int position) {
        String title,thambel;
        String imageView;
        ResponseItem responseItem = responseItemList.get(position);

        title =responseItem.getTitle();

        imageView =responseItem.getUrl();

        holder.title.setText("Title :"+title);


        Picasso.get()
                .load(imageView)
                .into(holder.imageView);





    }

    @Override
    public int getItemCount() {
        return responseItemList.size();
    }
}
