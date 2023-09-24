package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodDetails extends AppCompatActivity {
ImageView detailedimg;
int img;
String detail_rate,detail_txt;
TextView detaildedtxt,detaildedrate,detailedsee;
ImageButton addtocart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        detailedimg=findViewById(R.id.detailedimg);
        detaildedtxt=findViewById(R.id.detailedtxt);
        detaildedrate=findViewById(R.id.detailedrate);
        addtocart=findViewById(R.id.addtocart);
        detailedsee=findViewById(R.id.detailedsee);
        detailedsee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FoodDetails.this,ReviewFoodPage.class));
            }
        });

        ImageButton backbtn;
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Intent intent = getIntent();
        img = intent.getIntExtra("foodimage",R.drawable.detailedimg);
        detail_txt=intent.getStringExtra("foodname");
        detail_rate=intent.getStringExtra("foodrate");

        detailedimg.setImageResource(img);
        detaildedrate.setText(detail_rate);
        detaildedtxt.setText(detail_txt);



        addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(), "Added To Cart", Toast.LENGTH_SHORT);
                toast.show();

            }
        });
    }
}