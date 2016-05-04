package br.com.fiap.rm72468.receiverapp.receiveapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        Vibrator vs = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vs.vibrate(100);

        Toast.makeText(context, "Logado.", Toast.LENGTH_SHORT).show();
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
