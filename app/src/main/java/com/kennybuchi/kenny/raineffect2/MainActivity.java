package com.kennybuchi.kenny.raineffect2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer RainMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RainMP = MediaPlayer.create(this, R.raw.yo_d);

        Button playYoD = (Button) this.findViewById(R.id.yo_d);

        playYoD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.yo_d);
                RainMP.start();
            }
        });

        Button playCantStop = (Button) this.findViewById(R.id.i_cant_stop);

        playCantStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.i_cant_stop);
                RainMP.start();
            }
        });

        Button playLadies = (Button) this.findViewById(R.id.my_ladies);

        playLadies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.my_ladies);
                RainMP.start();
            }
        });

        Button playMakeNoise = (Button) this.findViewById(R.id.make_some_noise);

        playMakeNoise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.make_some_noise);
                RainMP.start();
            }
        });

        Button playComeOnGirl = (Button) this.findViewById(R.id.come_on_girl);

        playComeOnGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.come_on_girl);
                RainMP.start();
            }
        });

        Button playWeather = (Button) this.findViewById(R.id.beautiful_weather);

        playWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.beautiful_weather);
                RainMP.start();
            }
        });

        Button playSmile = (Button) this.findViewById(R.id.needa_ur_smile);

        playSmile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.need_ur_smile);
                RainMP.start();
            }
        });

        Button playVerse1 = (Button) this.findViewById(R.id.verse_one);

        playVerse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.verse_one);
                RainMP.start();
            }
        });

        Button playVerse2 = (Button) this.findViewById(R.id.verse_two);

        playVerse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.verse_two);
                RainMP.start();
            }
        });

        Button playGang = (Button) this.findViewById(R.id.gang);

        playGang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (RainMP.isPlaying()) {
                    RainMP.stop();
                }
                RainMP.reset();
                RainMP = MediaPlayer.create(MainActivity.this, R.raw.gang);
                RainMP.start();
            }
        });


        Button StopSound = (Button) this.findViewById(R.id.stop);

        StopSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RainMP.stop();
            }
        });


    }

    @Override
    protected void onStop() {
        RainMP.stop();
        super.onStop();
        // The Application has been closed!
    }
}
