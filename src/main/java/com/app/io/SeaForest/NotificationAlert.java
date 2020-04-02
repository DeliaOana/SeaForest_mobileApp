package com.app.io.SeaForest;

/*import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.hardware.camera2.CaptureRequest;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class NotificationAlert extends ActionBarActivity {


    public static int uniqueID = 19149;
    static NotificationCompat.Builder notification;
    //private static int uniqueID = 19149;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notification = new NotificationCompat.Builder(this);
        notification.setAutoCancel(true);


        //public static CaptureRequest.Builder notificationAlert;


        //Build the notification
        notification.setSmallIcon(R.mipmap.ic_launcher1);
        notification.setTicker("This is the ticker");
        notification.setWhen(System.currentTimeMillis());
        notification.setContentTitle("Here is the title");
        notification.setContentText("I am the body text of your notification");

        Intent intent = new Intent(this, MQTTActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        notification.setContentIntent(pendingIntent);

        //Builds notification and issues it
        //NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
       // nm.notify(uniqueID, notification.build());
    }





}
*/