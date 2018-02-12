package com.continuousnet.heartamination;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SplashActivity extends AppCompatActivity {

    ImageView largeCircle;
    ImageView mediumCircle;
    ImageView smallCircle;

    byte[] byteData = null;
    int bufferSize;
    AudioTrack audioTrack = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);
        
        largeCircle = (ImageView)findViewById(R.id.large_circle);
        mediumCircle = (ImageView)findViewById(R.id.medium_circle);
        smallCircle = (ImageView)findViewById(R.id.small_circle);

        ScaleAnimation animation = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation.setDuration(600);
        animation.setRepeatMode(Animation.REVERSE);
        animation.setRepeatCount(Animation.INFINITE);
        animation.setStartOffset(0);
        largeCircle.startAnimation(animation);

        ScaleAnimation animation2 = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation2.setDuration(600);
        animation.setRepeatMode(Animation.REVERSE);
        animation2.setRepeatCount(Animation.INFINITE);
        animation2.setStartOffset(0);
        mediumCircle.startAnimation(animation2);

        ScaleAnimation animation3 = new ScaleAnimation(1.0f, 1.1f, 1.0f, 1.1f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        animation3.setDuration(1000);
        animation.setRepeatMode(Animation.REVERSE);
        animation3.setRepeatCount(Animation.INFINITE);
        animation3.setStartOffset(0);
        smallCircle.startAnimation(animation3);

        MediaPlayer mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.heart);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

    }


}
