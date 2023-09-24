package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class onboardingThree extends AppCompatActivity {
    ImageButton im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_three);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        im1=findViewById(R.id.next);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(onboardingThree.this,SignupPage.class);
                startActivity(i);
            }
        });
    }
}