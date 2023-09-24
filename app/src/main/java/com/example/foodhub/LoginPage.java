package com.example.foodhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
Button loginbtn;
TextView forgetpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        loginbtn=findViewById(R.id.loginbtn);
        forgetpass=findViewById(R.id.forgetpass);
        ImageButton backbtn;
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        forgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginPage.this, ResetPasswordPage.class);
                // starting finished activity
                startActivity(i);
            }
        });
        final dialog loadingdialog = new dialog(LoginPage.this);
        loginbtn.setOnClickListener(new View.OnClickListener() {
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
                        Intent i = new Intent(LoginPage.this, doneac.class);
                        // starting finished activity
                        startActivity(i);
                    }
                }, 2500); // 4 seconds
            }
        });
    }
}