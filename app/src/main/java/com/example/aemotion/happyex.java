package com.example.aemotion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class happyex extends AppCompatActivity {

    int CheckON;
    ImageView layoutback;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happyex);

        final TextView mSwitcher = (TextView) findViewById(R.id.h_message); mSwitcher.setText("old text");

        final Animation in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(3000);

        final Animation out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(3000);

        mSwitcher.startAnimation(out);
        mSwitcher.setText("예시 표정을 따라 해 보세요!");
        mSwitcher.startAnimation(in);

        layoutback = findViewById(R.id.layoutback);


       CheckON = VO.getCheckON();



        if(CheckON == 1){
            layoutback.setImageResource(R.drawable.happy);

        }
        else if(CheckON == 2){

            layoutback.setImageResource(R.drawable.sad);

        }
        else if(CheckON == 3){

            layoutback.setImageResource(R.drawable.surprised);
                  }
        else{
            layoutback.setImageResource(R.drawable.mad);

        }
















        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(happyex.this, Camera.class);
                startActivity(intent);
            }
        }, 3800);
    }
}