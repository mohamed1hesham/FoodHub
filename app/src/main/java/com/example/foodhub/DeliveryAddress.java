package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DeliveryAddress extends AppCompatActivity {
ImageButton addnewadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_address);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        addnewadd=findViewById(R.id.addnewadd);
        addnewadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(DeliveryAddress.this,AddNewAddressPage.class));
            }
        });
    }
}