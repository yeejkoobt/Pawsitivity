package com.catastrophic.pawsitivity;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by LILYLI on 10/22/2016.
 */

public class CatWalkActivity extends AppCompatActivity {
    private ImageView imageView;
    private AnimationDrawable catWalkAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_walk);

//        imageView = (ImageView) findViewById(R.id.animation);
//        if(imageView == null) throw new AssertionError();
//
//        imageView.setVisibility(View.INVISIBLE);
//        imageView.setBackgroundResource(R.drawable.dog_slave_animation);
//
//        catWalkAnimation = (AnimationDrawable) imageView.getBackground();
//        catWalkAnimation.setOneShot(true);
//        catWalkAnimation.start();
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        float xDistance = 50;
        while(xDistance <= width) {
            imageView = (ImageView) findViewById(R.id.animation);
            imageView.animate()
                    .translationX(xDistance)
                    .setDuration(10);
            xDistance += xDistance;
        }
//        imageView = (ImageView) findViewById(R.id.animation);
//        imageView.animate()
//            .translationX(100)
//            .setDuration(1000);
    }


}
