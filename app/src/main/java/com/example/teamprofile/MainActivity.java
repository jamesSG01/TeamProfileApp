package com.example.teamprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Isaiah_profile(View v){
        startActivity(new Intent(MainActivity.this, IsaiahProfile.class));
    }

    public void Don_profile(View v){
        startActivity(new Intent(MainActivity.this, DonProfile.class));
    }
    public void James_profile(View v) {
        startActivity(new Intent(MainActivity.this, JamesProfile.class));
    }
}