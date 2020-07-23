package com.myapps.Seviye2;


import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.myapps.R;

public class Notification extends AppCompatActivity {
    private static final int CHANNEL_ID =1 ;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        button = findViewById(R.id.notifi);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ıntent = new Intent(getApplicationContext(),Notification.class);
                PendingIntent pendingIntent = PendingIntent.getActivity(getApplicationContext(),1,ıntent,0);

                NotificationManager manager= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                android.app.Notification.Builder builder = new android.app.Notification.Builder(getApplicationContext());
                builder.setContentTitle("BildirimTitle")
                        .setContentText("Bu bir bildirimdir")
                        .setSmallIcon(R.mipmap.ic_launcher_foreground)
                        .setAutoCancel(true)
                        .setSound(RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION))
                        .setVibrate(new long[] { 1000, 1000, 1000, 1000, 1000 })
                        .setLights(Color.RED, 3000, 1000)
                        .setTicker("Bildirim geldi")
                        .setContentIntent(pendingIntent);

                android.app.Notification notification = builder.getNotification();
                manager.notify(1,notification);
            }
        });
    }
}
