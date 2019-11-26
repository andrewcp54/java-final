package com.javafinal.shm;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

public class splashload extends AppCompatActivity {
private TextView title, authors, continueMessage;
private ImageView image;
private int SLEEP_TIMER = 3;

    private void launchAnimations() {
        Animation my_transition = AnimationUtils.loadAnimation(this,R.anim.transitionsplash);
        title.startAnimation(my_transition);
        authors.startAnimation(my_transition);
        image.startAnimation(my_transition);
        continueMessage.startAnimation(my_transition);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashload);

        title = findViewById(R.id.appTitle);
        authors = findViewById(R.id.appCreators);
        continueMessage = findViewById(R.id.contMessage);
        image = findViewById(R.id.logo);
        launchAnimations();

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splashload);
        getSupportActionBar().hide();
        Logo logoLauncher = new Logo();
        logoLauncher.start();
    }

    private class Logo extends Thread {
        public void run() {
            try {
                sleep(1000 * SLEEP_TIMER);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent _intent = new Intent(splashload.this, MainActivity.class);
            startActivity(_intent);
            splashload.this.finish();
        }
    }


}
