package com.example.foodhub;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.MyViewHolder>{
    Context context;
    ArrayList<FeaturedModel> data;

    public FeaturedAdapter(Context context, ArrayList<FeaturedModel> data){
        this.context = context;
        this.data = data;

    }


    @NonNull
    @Override
    public FeaturedAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View recyclerItems = inflater.inflate(R.layout.featured_cell,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(recyclerItems);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {

        holder.foodname.setText(data.get(position).getName());
        holder.foodtype.setText(data.get(position).getType());
        holder.foodrate.setText(data.get(position).getRate());
        holder.time.setText(data.get(position).getTime());
        holder.foodimage.setImageResource(data.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i=new Intent(context, FoodDetails.class);
                i.putExtra("foodname", data.get(position).getName());
                i.putExtra("foodrate",data.get(position).getRate());
                i.putExtra("foodimage",data.get(position).getImage());


                context.startActivity(i);

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.size();
    }



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView foodname;
        public TextView foodtype;
        public ImageView foodimage;
        public TextView foodrate;
        public TextView time;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            this.foodname = itemView.findViewById(R.id.foodName);
            this.foodtype = itemView.findViewById(R.id.foodType);
            this.foodimage = itemView.findViewById(R.id.foodImage);
            this.foodrate = itemView.findViewById(R.id.foodRate);
            this.time = itemView.findViewById(R.id.foodTime);



        }
    }
}
