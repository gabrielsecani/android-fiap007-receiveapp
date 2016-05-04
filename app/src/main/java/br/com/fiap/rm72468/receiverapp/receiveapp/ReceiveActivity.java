package br.com.fiap.rm72468.receiverapp.receiveapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);
    }

    public void btnEnviaBroadcastOnClick(View v) {
//        Intent i = new Intent();
//        i.setAction("android.app.action.ACTION_PASSWORD_SUCCEEDED");
//        sendBroadcast(i);

        Intent i = new Intent(this, MyService.class);
        startService(i);

        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stopService(i);

    }

    public void btnEnviaBroadcastStopOnClick(View v) {

        Intent i = new Intent(this, MyService.class);
        stopService(i);
    }
}