package com.example.teamprofile;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.graphics.Matrix;
import android.widget.ImageView;

public class IsaiahProfile extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isaiah_profile);
        ((TextView)findViewById(R.id.is_name)).setText("Isaiah Sarkor");
    }

    public void rotate_pic(View view){
        ((ImageView)findViewById(R.id.isaiah_image)).setRotation(90);
    }
}
