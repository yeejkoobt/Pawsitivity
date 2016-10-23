package com.catastrophic.pawsitivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        ImageView prayCat = (ImageView) findViewById(R.id.prayCat);
        Animation prayCatFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        prayCat.setAnimation(prayCatFadeIn);

        ImageView buttCat = (ImageView) findViewById(R.id.buttCat);
        Animation buttCatFadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        buttCat.setAnimation(buttCatFadeIn);

    }

    /**
     *  called when the user clicks the Login button
     */
    public void handleLoginClicked(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    /**
     * called when the user clicks the Register button
     */
    public void handleRegisterClicked(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    /**
     * called when the user clicks the Instant Encouragement button
     */
    public void handleInstantClicked(View view) {
        Intent intent = new Intent(this, EncourageCatActivity.class);
        startActivity(intent);
    }

}
