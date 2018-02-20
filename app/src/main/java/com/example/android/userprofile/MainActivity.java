package com.example.android.userprofile;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View root = findViewById(R.id.root_view);
        root.setBackgroundColor(Color.parseColor("#AAFFCC"));


        TextView name = findViewById(R.id.name);
        name.setText(String.valueOf("Greg"));
        name.setAllCaps(true);
        name.setTextSize(15);

        TextView birthday = findViewById(R.id.birthday);
        birthday.setText(String.valueOf("Sometime in the past"));
        birthday.setTextColor(Color.parseColor("#FF4081"));

        TextView country = findViewById(R.id.country);
        country.setText(String.valueOf("Poland"));
        country.setTypeface(null, Typeface.BOLD_ITALIC);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(250,250);

        ImageView userProfile = findViewById(R.id.profile_picture);
        userProfile.setImageResource(R.drawable.user_profile);
        userProfile.setLayoutParams(layoutParams);
    }
}
