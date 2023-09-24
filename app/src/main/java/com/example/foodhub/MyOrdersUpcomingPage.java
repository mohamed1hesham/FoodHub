package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MyOrdersUpcomingPage extends AppCompatActivity {
ImageButton tonext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders_upcoming_page);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        tonext=findViewById(R.id.tonext);
        ImageButton backbtn;
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        tonext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyOrdersUpcomingPage.this,MyOrdersHistory.class));
            }
        });
    }
}