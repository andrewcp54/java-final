package com.javafinal.shm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button c_btn;
    private EditText et;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c_btn = findViewById(R.id.chatbutton);
        et = findViewById(R.id.editTest);

        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                s = et.getText().toString();
                if (s.equals("GL")) {
                    et.setText("Good luck");
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

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

