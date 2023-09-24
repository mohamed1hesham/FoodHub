package com.example.foodhub;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder>{
    Context context;
    ArrayList <CategoryModel> data;
    public CategoryAdapter(Context context, ArrayList<CategoryModel> data){
        this.context = context;
        this.data = data;

    }
    @NonNull
    @Override
    public CategoryAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View recyclerItems = inflater.inflate(R.layout.recycler_category,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(recyclerItems);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.MyViewHolder holder, int position) {

        holder.catNameTxt.setText(data.get(position).getCatName());
        holder.catImageView.setImageResource(data.get(position).getCatImage());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView catNameTxt;

        public ImageView catImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.catNameTxt = itemView.findViewById(R.id.catName);

            this.catImageView = itemView.findViewById(R.id.catimg);


        }
    }
}
