package com.catastrophic.pawsitivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class EncourageCatActivity extends AppCompatActivity {

    private Integer[] blue = {R.drawable.cat_blue_plain, R.drawable.cat_blue_batman, R.drawable.cat_blue_chef, R.drawable.cat_blue_ghost, R.drawable.cat_blue_hairypotter,
            R.drawable.cat_blue_mummy, R.drawable.cat_blue_pineapple, R.drawable.cat_blue_pumpkin, R.drawable.cat_blue_witch};

    private Integer[] brown = {R.drawable.cat_brown_plain, R.drawable.cat_brown_batman, R.drawable.cat_brown_chef, R.drawable.cat_brown_ghost, R.drawable.cat_brown_hairypotter,
            R.drawable.cat_brown_mummy, R.drawable.cat_brown_pineapple, R.drawable.cat_brown_pumpkin, R.drawable.cat_brown_witch};

    private Integer[] gray = {R.drawable.cat_gray_plain, R.drawable.cat_gray_batman, R.drawable.cat_gray_chef, R.drawable.cat_gray_ghost, R.drawable.cat_gray_hairypotter,
            R.drawable.cat_gray_mummy, R.drawable.cat_gray_pineapple, R.drawable.cat_gray_pumpkin, R.drawable.cat_gray_witch};

    private Integer[] green = {R.drawable.cat_green_plain, R.drawable.cat_green_batman, R.drawable.cat_green_chef, R.drawable.cat_green_ghost, R.drawable.cat_green_hairypotter,
            R.drawable.cat_green_mummy, R.drawable.cat_green_pineapple, R.drawable.cat_green_pumpkin, R.drawable.cat_green_witch};

    private Integer[] orange = {R.drawable.cat_orange_plain, R.drawable.cat_orange_batman, R.drawable.cat_orange_chef, R.drawable.cat_orange_ghost, R.drawable.cat_orange_hairypotter,
            R.drawable.cat_orange_mummy, R.drawable.cat_orange_pineapple, R.drawable.cat_orange_pumpkin, R.drawable.cat_orange_witch};
    private Integer[] pink = {R.drawable.cat_pink_plain, R.drawable.cat_pink_batman, R.drawable.cat_pink_chef, R.drawable.cat_pink_ghost, R.drawable.cat_pink_hairypotter,
            R.drawable.cat_pink_mummy, R.drawable.cat_pink_pineapple, R.drawable.cat_pink_pumpkin, R.drawable.cat_pink_witch};
    private Integer[] white = {R.drawable.cat_white_plain, R.drawable.cat_white_batman, R.drawable.cat_white_chef, R.drawable.cat_white_ghost, R.drawable.cat_white_hairypotter,
            R.drawable.cat_white_mummy, R.drawable.cat_white_pineapple, R.drawable.cat_white_pumpkin, R.drawable.cat_white_witch};
    private Integer[] yellow = {R.drawable.cat_yellow_plain, R.drawable.cat_yellow_batman, R.drawable.cat_yellow_chef, R.drawable.cat_yellow_ghost, R.drawable.cat_yellow_hairypotter,
            R.drawable.cat_yellow_mummy, R.drawable.cat_yellow_pineapple, R.drawable.cat_yellow_pumpkin, R.drawable.cat_yellow_witch};

    private ImageView encourageCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encourage_cat);
        Intent intent = getIntent();
        String color = intent.getStringExtra("color");
        int index = intent.getIntExtra("index", 1);
        encourageCat = (ImageView) findViewById(R.id.encourageCat);
        if (color.equals("")) {
            color = "white";
            index = 3;
        }

        if (color.equals("blue")) {
            encourageCat.setImageResource(blue[index]);
        } else if (color.equals("brown")) {
            encourageCat.setImageResource(brown[index]);
        } else if (color.equals("gray")) {
            encourageCat.setImageResource(gray[index]);
        } else if (color.equals("green")) {
            encourageCat.setImageResource(green[index]);
        } else if (color.equals("orange")) {
            encourageCat.setImageResource(orange[index]);
        } else if (color.equals("pink")) {
            encourageCat.setImageResource(pink[index]);
        } else if (color.equals("white")) {
            encourageCat.setImageResource(white[index]);
        } else {
            encourageCat.setImageResource(yellow[index]);
        }
    }
}

