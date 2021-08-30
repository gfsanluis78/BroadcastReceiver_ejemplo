package com.farias.broadcastreceiver_ejemplo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MensajeRecibido extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Ud ha recibido un mensaje",Toast.LENGTH_LONG).show();
    }
}
