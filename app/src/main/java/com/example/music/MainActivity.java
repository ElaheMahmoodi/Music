package com.example.music;

import static com.example.music.R.id.mainPic;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer m1,m2,m3,m4;
    private ImageView startPlayingMasalan, stopPlayingMasalan , pausePlayingMasalan;
    private ImageView startPlayingKhoshamiad, stopPlayingKhoshamiad , pausePlayingKhoshamiad;
    private ImageView startPlayingBoro, stopPlayingBoro , pausePlayingBoro;
    private ImageView startPlayingRadePa, stopPlayingRadePa , pausePlayingRadePa;
    private ImageView mainPic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startPlayingMasalan=(ImageView) findViewById(R.id.PlayMasalan);
        startPlayingBoro=(ImageView) findViewById(R.id.PlayBoro);
        startPlayingKhoshamiad=(ImageView) findViewById(R.id.PlayKhoshamMiad);
        startPlayingRadePa=(ImageView) findViewById(R.id.PlayRadPa);

        stopPlayingMasalan=(ImageView) findViewById(R.id.StopMasalan);
        stopPlayingBoro=(ImageView) findViewById(R.id.StopBoro);
        stopPlayingKhoshamiad=(ImageView) findViewById(R.id.StopKhoshamMiad);
        stopPlayingRadePa=(ImageView) findViewById(R.id.StopRadPa);

        pausePlayingMasalan=(ImageView) findViewById(R.id.PauseMasalan);
        pausePlayingBoro=(ImageView) findViewById(R.id.PauseBoro);
        pausePlayingKhoshamiad=(ImageView) findViewById(R.id.PauseKhoshamMiad);
        pausePlayingRadePa=(ImageView) findViewById(R.id.PauseRadPa);

        m1=MediaPlayer.create(MainActivity.this,R.raw.masalan);
        m2=MediaPlayer.create(MainActivity.this,R.raw.borosamteali);
        m3=MediaPlayer.create(MainActivity.this,R.raw.radepa);
        m4=MediaPlayer.create(MainActivity.this,R.raw.khoshammiad);


        mainPic=(ImageView)findViewById(R.id.mainPic);
        startPlayingMasalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    m1.start();
                    mainPic.setImageResource(R.drawable.masalan);

            }
        });
        startPlayingBoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m2.start();
                mainPic.setImageResource(R.drawable.borosamteali);

            }
        });
        startPlayingRadePa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m3.start();
                mainPic.setImageResource(R.drawable.radepa);

            }
        });
        startPlayingKhoshamiad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                m4.start();
                mainPic.setImageResource(R.drawable.khoshammiad);

            }
        });

        stopPlayingMasalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1.stop();
                mainPic.setImageResource(R.drawable.zanco);
                m1=MediaPlayer.create(MainActivity.this,R.raw.masalan);
            }
        });
        stopPlayingBoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2.stop();
                mainPic.setImageResource(R.drawable.zanco);
                m2=MediaPlayer.create(MainActivity.this,R.raw.borosamteali);
            }
        });
        stopPlayingRadePa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m3.stop();
                mainPic.setImageResource(R.drawable.zanco);
                m3=MediaPlayer.create(MainActivity.this,R.raw.radepa);
            }
        });
        stopPlayingKhoshamiad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m4.stop();
                mainPic.setImageResource(R.drawable.zanco);
                m4=MediaPlayer.create(MainActivity.this,R.raw.khoshammiad);
            }
        });
        pausePlayingMasalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m1.isPlaying())
                {
                    m1.pause();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Masalan is not play" , Toast.LENGTH_SHORT).show();
                }
            }
        });
        pausePlayingBoro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m2.isPlaying())
                {
                    m2.pause();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Boro samte Ali is not play" , Toast.LENGTH_SHORT).show();
                }
            }
        });
        pausePlayingRadePa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m3.isPlaying())
                {
                    m3.pause();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Rade pa is not play" , Toast.LENGTH_SHORT).show();
                }
            }
        });
        pausePlayingKhoshamiad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(m4.isPlaying())
                {
                    m4.pause();

                }
                else
                {
                    Toast.makeText(MainActivity.this,"Khosham miad is not play" , Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}