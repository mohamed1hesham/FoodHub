package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VerificationCodePage extends AppCompatActivity {
    Button verbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_code_page);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        ImageButton backbtn;
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        verbtn=findViewById(R.id.verbtn);
        final dialog loadingdialog = new dialog(VerificationCodePage.this);
        verbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // invoking startLoadingDialog method
                loadingdialog.startLoadingdialog();

                // using handler class to set time delay methods
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        // after 4 seconds
                        loadingdialog.dismissdialog();
                        Intent i = new Intent(VerificationCodePage.this, doneac.class);
                        // starting finished activity
                        startActivity(i);
                    }
                }, 2500); // 4 seconds
            }
        });

    }
}