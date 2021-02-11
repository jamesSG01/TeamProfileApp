package com.example.teamprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DonProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_don_profile);
        ((TextView)findViewById(R.id.name_textView)).setText("Donovan Hill");
        ((TextView)findViewById(R.id.dh_program_of_study)).setText("B.Sc (Computer Science)");
        ((TextView)findViewById(R.id.dh_fun_facts)).setText("I love the word \"Flammenwerfer\"\nFlammenwerfers werf flammens!");
        ((TextView)findViewById(R.id.dh_hobbies)).setText("Antique Radio Restoration\nAmateur Radio");
        ((TextView)findViewById(R.id.dh_other_information)).setText("I'm getting old\nGet off my Lawn");
    }
}