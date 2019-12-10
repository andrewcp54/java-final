package com.javafinal.shm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button c_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_btn = findViewById(R.id.chatbutton);

        c_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chat_launcher();
            }
        });
    }

    private void chat_launcher(){
        Intent myIntent = new Intent(MainActivity.this, chat.class);
        startActivity(myIntent);
    }
}

