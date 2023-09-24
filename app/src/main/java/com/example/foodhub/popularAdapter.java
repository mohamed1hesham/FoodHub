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

public class popularAdapter extends RecyclerView.Adapter<popularAdapter.MyViewHolder>{
    Context context;
    ArrayList<popularModel> data;
    public popularAdapter(Context context, ArrayList<popularModel> data){
        this.context = context;
        this.data = data;

    }
    @NonNull
    @Override
    public popularAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View recyclerItems = inflater.inflate(R.layout.popularcell,parent,false);
        popularAdapter.MyViewHolder viewHolder = new popularAdapter.MyViewHolder(recyclerItems);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull popularAdapter.MyViewHolder holder, int position) {

        holder.popNameTxt.setText(data.get(position).getPopName());
        holder.popDescTxt.setText(data.get(position).getPopDesc());
        holder.popPriceTxt.setText(data.get(position).getPopPrice());

        holder.popImageView.setImageResource(data.get(position).getPopImage());


    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView popNameTxt,popDescTxt,popPriceTxt;

        public ImageView popImageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.popNameTxt = itemView.findViewById(R.id.popname);
            this.popDescTxt = itemView.findViewById(R.id.popdesc);
            this.popPriceTxt = itemView.findViewById(R.id.popprice);
            this.popImageView = itemView.findViewById(R.id.popimg);


        }
    }
}
