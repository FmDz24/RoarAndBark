package com.example.medved_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton medImage, dogImage, tuchImage;
    private MediaPlayer medSound, dogSound, tuchSound;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        medImage = findViewById(R.id.med_obj);
        dogImage = findViewById(R.id.dog_obj);
        tuchImage = findViewById(R.id.imButTuch);
        medSound = MediaPlayer.create(this, R.raw.medaud);
        dogSound = MediaPlayer.create(this, R.raw.lay);
        tuchSound = MediaPlayer.create(this, R.raw.grom);

        medImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton(medSound);

            }
        });

        tuchImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton3(tuchSound);

            }

            private void soundPlayButton3(MediaPlayer tuchSound) {
                if (tuchSound.isPlaying()) {
                    tuchSound.pause();
                }
                tuchSound.seekTo(0);
                tuchSound.start();


            }
        });

        dogImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPlayButton2(dogSound);

            }
        });
    }

    public void soundPlayButton2(MediaPlayer dogSound) {
        if (medSound.isPlaying()) {
            medSound.pause();
        }
        dogSound.seekTo(0);
        dogSound.start();

    }

    public void soundPlayButton(MediaPlayer medSound) {
        if (dogSound.isPlaying()) {
            dogSound.pause();
        }
        medSound.seekTo(0);
        medSound.start();
    }

    public void About(View v) {
        Intent intent;
        intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}