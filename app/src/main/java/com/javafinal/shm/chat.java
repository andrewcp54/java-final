package com.javafinal.shm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class chat extends AppCompatActivity {
    EditText sms, phone_number;
    Button send_sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        send_sms = findViewById(R.id.send_sms);
        sms = findViewById(R.id.sms_body);
        phone_number = findViewById(R.id.phone_num);

        send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                send_sms();
            }
        });
    }

    private void send_sms() {
        String sms_message = sms.getText().toString();
        String phone_field = phone_number.getText().toString();
        try {
            SmsManager sms_man = SmsManager.getDefault();
            sms_man.sendTextMessage(phone_field, null, sms_message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.",
                    Toast.LENGTH_LONG).show();
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "Failed to send SMS...",
                    Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }
}
