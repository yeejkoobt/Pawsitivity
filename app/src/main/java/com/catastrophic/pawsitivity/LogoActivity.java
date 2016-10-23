package com.catastrophic.pawsitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LogoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);
        doAnimation();
    }

    private void doAnimation() {
        ImageView imageView = (ImageView) findViewById(R.id.pawsitivityLogo);
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        fadeIn.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent(LogoActivity.this, CatWalkActivity.class);
                startActivity(intent);
//                Intent svc=new Intent(LogoActivity.this, BackgroundSoundService.class);
//                startService(svc);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {
            }
        });

        imageView.setAnimation(fadeIn);
    }

}
