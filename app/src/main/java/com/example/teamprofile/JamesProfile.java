package com.example.teamprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JamesProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_james_profile);
        ((TextView)findViewById(R.id.james_name)).setText("James Nguyen");
        ((TextView)findViewById(R.id.james_program_of_study)).setText("Computer Science");
        ((TextView)findViewById(R.id.james_ff)).setText("I have no idea what i am doing at this point");
        ((TextView)findViewById(R.id.james_hobbies)).setText(" Cats..chonky cats !!!! ");
        ((TextView)findViewById(R.id.james_other_information)).setText("My code works. and i have no idea how :) ");
    }
}