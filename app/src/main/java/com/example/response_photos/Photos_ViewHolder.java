package com.example.response_photos;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Photos_ViewHolder extends RecyclerView.ViewHolder {

    TextView title;
    ImageView imageView;
    public Photos_ViewHolder(@NonNull View itemView) {
        super(itemView);




        title = itemView.findViewById(R.id.title);
        imageView= itemView.findViewById(R.id.imageview);
    }
}
