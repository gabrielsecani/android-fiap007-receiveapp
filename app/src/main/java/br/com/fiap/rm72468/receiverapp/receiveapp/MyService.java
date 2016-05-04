package br.com.fiap.rm72468.receiverapp.receiveapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("ServiçoMensagem", "Serviço iniciado...");
    }

    @Override
    public void onDestroy() {
        Log.i("ServiçoMensagem", "Serviço encerrado...");
        super.onDestroy();
    }

}
