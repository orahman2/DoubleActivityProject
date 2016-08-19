package com.example.android.doubleactivityproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        TextView messageView = (TextView)findViewById(R.id.message);
        messageView.setText(messageText);

//        setContentView(R.layout.activity_receive_message);
//        TextView textView = (TextView) findViewById(R.id.message);
//        String message = getIntent().getStringExtra(EXTRA_MESSAGE);
//        System.out.println(message);
//        textView.setText(message);
    }
}