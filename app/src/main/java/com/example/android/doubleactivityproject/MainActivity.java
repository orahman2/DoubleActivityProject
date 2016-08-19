package com.example.android.doubleactivityproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickMessage(View view){
        EditText editMessage = (EditText) findViewById(R.id.message);
        String messageToSend = editMessage.getText().toString();
        Intent intent1 = new Intent(this, ReceiveMessageActivity.class);
        intent1.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageToSend);
        startActivity(intent1);
//        System.out.println(messageToSend);
    }
}
