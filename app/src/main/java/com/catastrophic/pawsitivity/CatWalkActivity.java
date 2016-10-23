package com.catastrophic.pawsitivity;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by LILYLI on 10/22/2016.
 */

public class CatWalkActivity extends AppCompatActivity {
    private ImageView dog1;
    private ImageView dog2;
    private ImageView dog3;
    private AnimationDrawable catWalkAnimation;
    boolean isSkipButtonPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_walk);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        Button skipButton = (Button) findViewById(R.id.skipButton);
        skipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isSkipButtonPressed = true;
                Intent skipIntent = new Intent(CatWalkActivity.this, WelcomeActivity.class);
                startActivity(skipIntent);
            }
        });

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.panda_designer);
        mediaPlayer.setVolume(100,100);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
        dog2 = (ImageView) findViewById(R.id.dog2);
        ObjectAnimator dog2Animator = ObjectAnimator.ofFloat(dog2, "x", 0, width).setDuration(20000);
        dog2Animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                if(!isSkipButtonPressed) {
                    Intent intent = new Intent(CatWalkActivity.this, WelcomeActivity.class);
                    startActivity(intent);
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        dog2Animator.start();


    }


}
