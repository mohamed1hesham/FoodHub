package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class Resturantpage extends AppCompatActivity {
CardView c1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resturantpage);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        c1=findViewById(R.id.cardresturant);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Resturantpage.this,ResturantProfilePage.class));
            }
        });
    }
}