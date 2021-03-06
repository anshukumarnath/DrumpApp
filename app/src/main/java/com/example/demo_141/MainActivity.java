package com.example.demo_141;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    ImageButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    public void onBackPressed() {
        finish();
        System.exit(0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.imageButton1);
        b2= findViewById(R.id.imageButton2);
        b3= findViewById(R.id.imageButton3);
        b4= findViewById(R.id.imageButton4);
        b5= findViewById(R.id.imageButton5);
        b6= findViewById(R.id.imageButton6);
        b7= findViewById(R.id.imageButton7);
        b8= findViewById(R.id.imageButton8);
        b9= findViewById(R.id.imageButton9);
        b10= findViewById(R.id.imageButton10);
        b11= findViewById(R.id.imageButton11);
        b12= findViewById(R.id.imageButton12);
        m1=MediaPlayer.create(MainActivity.this,R.raw.one);
        m2=MediaPlayer.create(MainActivity.this,R.raw.two);
        m3=MediaPlayer.create(MainActivity.this,R.raw.three);
        m4=MediaPlayer.create(MainActivity.this,R.raw.four);
        m5=MediaPlayer.create(MainActivity.this,R.raw.fv);
        m6=MediaPlayer.create(MainActivity.this,R.raw.sixth);
        m7=MediaPlayer.create(MainActivity.this,R.raw.seventh);
        m8=MediaPlayer.create(MainActivity.this,R.raw.eighth);
        m9=MediaPlayer.create(MainActivity.this,R.raw.three);
        m10=MediaPlayer.create(MainActivity.this,R.raw.fv);
        m11=MediaPlayer.create(MainActivity.this,R.raw.two);
        m12=MediaPlayer.create(MainActivity.this,R.raw.one);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m6.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m8.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m9.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m10.start();
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m11.start();
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m12.start();
            }
        });
    }
}