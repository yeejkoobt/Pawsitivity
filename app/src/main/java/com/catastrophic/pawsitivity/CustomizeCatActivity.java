package com.catastrophic.pawsitivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class CustomizeCatActivity extends AppCompatActivity {

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

    private LinearLayout imageGallery;
    private String color;

    private Button plain;
    private Button batman;
    private Button chef;
    private Button ghost;
    private Button hairypotter;
    private Button mummy;
    private Button pineapple;
    private Button pumpkin;
    private Button witch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_cat);

        imageGallery = (LinearLayout) findViewById(R.id.imageGallery);
        //imageGallery.removeAllViews();
        plain = (Button) findViewById(R.id.plain);
        batman = (Button) findViewById(R.id.batman);
        chef = (Button) findViewById(R.id.chef);
        ghost = (Button) findViewById(R.id.ghost);
        hairypotter = (Button) findViewById(R.id.hairypotter);
        mummy = (Button) findViewById(R.id.mummy);
        pineapple = (Button) findViewById(R.id.pineapple);
        pumpkin = (Button) findViewById(R.id.pumpkin);
        witch = (Button) findViewById(R.id.witch);
        for(int i = 0; i < 9; i++) {
            imageGallery.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println(v.getBackground().toString());
//                    String fileName = "cat_" + color + "_";
//                    if (v.getId() == plain.getId()) {
//                        fileName +=""
//                    }

                }
            }
            );
        }
        color = "blue";
        addImagesToTheGallery(blue);
    }

    private void addImagesToTheGallery(Integer[] images) {
        for (int i = 0;i < 9; i++) {
            Drawable drawable = getDrawable(images[i]);
            imageGallery.getChildAt(i).setBackground(drawable);
        }
    }

    public void blueButtonClicked(View view) {
        color = "blue";
        addImagesToTheGallery(blue);
    }

    public void brownButtonClicked(View view) {
        color = "brown";
        addImagesToTheGallery(brown);
    }

    public void grayButtonClicked(View view) {
        color = "gray";
        addImagesToTheGallery(gray);
    }

    public void greenButtonClicked(View view) {
        color = "green";
        addImagesToTheGallery(green);
    }

    public void orangeButtonClicked(View view) {
        color = "orange";
        addImagesToTheGallery(orange);
    }

    public void pinkButtonClicked(View view) {
        color = "pink";
        addImagesToTheGallery(pink);
    }

    public void whiteButtonClicked(View view) {
        color = "white";
        addImagesToTheGallery(white);
    }

    public void yellowButtonClicked(View view) {
        color = "yellow";
        addImagesToTheGallery(yellow);
    }

}
