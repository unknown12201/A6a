package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button)findViewById(R.id.button);

        btn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent noti= new Intent();
                PendingIntent pi = PendingIntent.getActivity(MainActivity.this,0,noti,0);
                Notification nots= new Notification.Builder(MainActivity.this)
                        .setTicker("hihihih")
                        .setContentTitle("Anna bond")
                        .setContentText("my name is smruti")
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentIntent(pi).getNotification();
                nots.flags=Notification.FLAG_AUTO_CANCEL;
                NotificationManager nm= (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                nm.notify(0,nots);
            }
        }));
    }
}

