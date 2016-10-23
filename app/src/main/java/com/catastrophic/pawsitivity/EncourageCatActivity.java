package com.catastrophic.pawsitivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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

    private Integer[] yellowCatPoses = {R.drawable.yellow_cat_pose_1, R.drawable.yellow_cat_pose_2, R.drawable.yellow_cat_pose_3, R.drawable.yellow_cat_pose_4, R.drawable.yellow_cat_pose_5};
    private ImageView encourageCat;
    private int quoteNum;
    private int yellowCatPoseIndex;
    private String color;
    private TextView encouragement;
    private Random numberGenerator;
    private MediaPlayer mediaPlayer;
    private int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encourage_cat);
        /** Quotes **/

        final String[] quotes = new String[58];
        quotes[0] = "In times of stress, the best thing we can do for each other is to listen with our ears and our hearts and to be assured that our questions are just as important as our answers. ~Fred 'Mistor Rogers'";
        quotes[1] = "The greatest mistake you can make in life is to be continually fearing you will make one. ~Elbert Hubbard";
        quotes[2] = "For fast-acting relief, try slowing down. ~Lily Tomlin";
        quotes[3] = "Do not anticipate trouble or worry about what may never happen. Keep in the sunlight. ~Benjamin Franklin";
        quotes[4] = "When we long for life without difficulties, remind us that oaks grow strong in contrary winds and diamonds are made under pressure. ~Peter Marshall";
        quotes[5] = "There is more to life than increasing its speed. ~Mahatma Gandhi";
        quotes[6] = "Rest is not idleness, and to lie sometimes on the grass under the trees on a summer’s day, listening to the murmur of water, or watching the clouds float across the sky, is by no means a waste of time. ~John Lubbock";
        quotes[7] = "I promise you nothing is as chaotic as it seems. Nothing is worth your health. Nothing is worth poisoning yourself into stress, anxiety, and fear. ~Steve Maraboli";
        quotes[8] = "Some of us think holding on makes us strong; but sometimes it is letting go. ~Hermann Hesse";
        quotes[9] = "It's not stress that kills us; it is our reaction to it. ~Hans Selye";
        quotes[10] = "Don’t let your mind bully your body into believing it must carry the burden of its worries. ~Astrid Alauda";
        quotes[11] = "Nothing in the universe can stop you from letting go and starting over. ~Guy Finley";
        quotes[12] = "Smile, breathe, and go slowly. ~Thich Nhat Hanh";
        quotes[13] = "Nothing is permanent in this wicked world—not even our troubles. ~Charlie Chaplin";
        quotes[14] = "Anxiety is one little tree in your forest. Step back and look at the whole forest. ~Unknown";
        quotes[15] = "Let yourself be open and life will be easier. A spoon of salt in a glass of water makes the water undrinkable. A spoon of salt in a lake is almost unnoticed. ~Buddha";
        quotes[16] = "You cannot make yourself feel something you do not feel, but you can make yourself do right in spite of your feelings. ~Pearl S. Buck";
        quotes[17] = "We must be willing to let go of the life we’ve planned, so as to have the life that is waiting for us. ~Joseph Campbell";
        quotes[18] = "The greatest weapon against stress is our ability to choose one thought over another. ~William James";
        quotes[19] = "Be soft. Do not let the world make you hard. Do not let pain make you hate. Do not let the bitterness steal your sweetness. Take pride that even though the rest of the world may disagree, you still believe it to be a beautiful place. ~Kurt Vonnegut";
        quotes[20] = "When I let go of what I am, I become what I might be. When I let go of what I have, I receive what I need. ~Tao Te Ching";
        quotes[21] = "When everything seems to be going against you, remember that the airplane takes off against the wind, not with it. ~Henry Ford";
        quotes[22] = "When life knocks you down, try to land on your back. Because if you can look up, you can get up. Let your reason get you back up. ~Les Brown";
        quotes[23] = "Prosperity is a great teacher; adversity is a greater. Possession pampers the mind; privation trains and strengthens it. ~William Hazlitt";
        quotes[24] = "Life is like photography. You need the negatives to develop. ~Unknown";
        quotes[25] = "Challenges are what make life interesting and overcoming them is what makes life meaningful. ~Joshua J. Marine";
        quotes[26] = "Always remember you are braver than you believe, stronger than you seem, smarter than you think and twice as beautiful as you’ve ever imagined. ~Dr. Seuss";
        quotes[27] = "Just because Fate doesn’t deal you the right cards, it doesn’t mean you should give up. It just means you have to play the cards you get to their maximum potential. ~Les Brown";
        quotes[28] = "One who gains strength by overcoming obstacles possesses the only strength which can overcome adversity. ~Albert Schweitzer";
        quotes[29] = "If you don’t like something change it; if you can’t change it, change the way you think about it. ~Mary Engelbreit";
        quotes[30] = "You have to get hurt. That’s how you learn. The strongest people out there – the ones who laugh the hardest with a genuine smile, those are the people who have fought the toughest battles. Because they’ve decided they’re not going to let anything hold them down, they’re showing the world who’s the boss. ~Unknown";
        quotes[31] = "When nobody else celebrates you, learn to celebrate yourself. When nobody else compliments you, then compliment yourself. It’s not up to other people to keep you encouraged. It’s up to you. Encouragement should come from the inside. ~Joel Osteen";
        quotes[32] = "Tough times never last, but tough people do. ~Robert H. Schuller";
        quotes[33] = "Sometimes you find yourself in the middle of nowhere, and sometimes in the middle of nowhere, you find yourself. ~Stacy Westfall";
        quotes[34] = "Turn your face to the sun and the shadows fall behind you. ~Maori Proverb";
        quotes[35] = "When stress is at the highest, just know it can only go down. ~Tom Rataj";
        quotes[36] = "Yesterday is gone. Tomorrow has not yet come. We have only today. Let us begin. ~Mother Teresa";
        quotes[37] = "Better to do something imperfectly than to do nothing flawlessly. ~Robert Schuller";
        quotes[38] = "Being happy doesn't mean that everything is perfect. It means that you've decided to look beyond the imperfections. ~Unknown";
        quotes[39] = "Yesterday is not ours to recover, but tomorrow is ours to win or lose. ~Lyndon B. Johnson";
        quotes[40] = "Positive thinking will let you do everything better than negative thinking will. ~Zig Ziglar";
        quotes[41] = "Positive thinking is more than just a tagline. It changes the way we behave. And I firmly believe that when I am positive, it not only makes me better, but it also makes those around me better. ~Harvey Mackay";
        quotes[41] = "Believe that life is worth living and your belief will help create the fact. ~William James";
        quotes[43] = "If you have a positive attitude and constantly strive to give your best effort, eventually you will overcome your immediate problems and find you are ready for greater challenges. ~Pat Riley";
        quotes[44] = "Many of life's failures are people who did not realize how close they were to success when they gave up. ~Thomas A. Edison";
        quotes[45] = "Start by doing what's necessary; then do what's possible; and suddenly you are doing the impossible. ~Francis of Assisi";
        quotes[46] = "The only way to do great work is to love what you do. If you haven't found it yet, keep looking. Don't settle. As with all matters of the heart, you'll know when you find it. ~Steve Jobs";
        quotes[47] = "The most important thing is to enjoy your life--to be happy--it's all that matters. ~Audrey Hepburn";
        quotes[48] = "If opportunity doesn’t knock, build a door. ~Milton Berle";
        quotes[49] = "Success consists of going from failure to failure without lossof enthusiasm. ~Winston Churchill";
        quotes[50] = "Happiness is an attitude. We either make ourselves miserable, or happy and strong. The amount of work is the same. ~Francesca Reigler";
        quotes[51] = "We are all here for some special reason. Stop being a prisoner of your past. Become the architect of your future. ~Robin Sharma";
        quotes[52] = "Take chances, make mistakes. That’s how you grow. Pain nourishes your courage. You have to fail in order to practice being brave. ~Mary Tyler Moore";
        quotes[53] = "You are never too old to set another goal or dream a new dream. ~C.S Lewis";
        quotes[54] = "Don’t Let Yesterday Take Up Too Much Of Today. ~Will Rogers";
        quotes[55] = "There are two ways of exerting one’s strength: one is pushing down, the other is pulling up. ~Booker T. Washington";
        quotes[56] = "Life is a gift, and it offers us the privilege, opportunity, and responsibility to give something back by becoming more. ~Tony Robbins";

        mediaPlayer = MediaPlayer.create(this, R.raw.meow);
        mediaPlayer.setVolume(100,100);
        mediaPlayer.setLooping(false);
        numberGenerator = new Random();
        encouragement = (TextView) findViewById(R.id.encouragement);
        Intent intent = getIntent();
        color = intent.getStringExtra("color");
        index = intent.getIntExtra("index", 1);
        encourageCat = (ImageView) findViewById(R.id.encourageCat);
        encourageCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(color.equals("yellow") && index == 7) {
                    yellowCatPoseIndex = numberGenerator.nextInt(5);
                    encourageCat.setImageResource(yellowCatPoses[yellowCatPoseIndex]);
                }
                quoteNum = numberGenerator.nextInt(56);
                mediaPlayer.start();
                encouragement.setText(quotes[quoteNum]);

            }
        });
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

