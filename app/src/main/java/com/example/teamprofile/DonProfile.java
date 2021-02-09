package com.example.teamprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DonProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_profile);
        ((TextView)findViewById(R.id.is_name)).setText("Donovan Hill");
        ((TextView)findViewById(R.id.is_program_of_study)).setText("B.Sc (Computer Science)");
        ((TextView)findViewById(R.id.is_ff)).setText("I love the word \"Flammenwerfer\"");
        ((TextView)findViewById(R.id.isaiah_h)).setText("Many");
        ((TextView)findViewById(R.id.is_o_i)).setText("Other");
    }
}