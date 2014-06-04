package com.komparify.alarmexample.app;

/**
 * Created by komparify on 2/6/14.
 */

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

public class AlarmExample extends BroadcastReceiver {

    Context context;
    @Override
    public void onReceive(Context context, Intent intent)
    {
        this.context = context;
        try
        {
            if(intent.getAction()!=null && intent.getAction().equalsIgnoreCase("android.intent.action.BOOT_COMPLETED"))
            {
                ///putNotification("Boot completed");
            }
            else if(intent.getAction()!=null && intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE"))
            {
                //utNotification("Connectivity change");
            }
            else
            {
                putNotification(context);
            }

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public void putNotification(Context context){

        //Toast.makeText(context,notification,Toast.LENGTH_SHORT).show();
        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
        Notification notification=new NotificationCompat.Builder(context)
                .setAutoCancel(true)
                .setContentTitle("Android talk")
                .setContentText("Android notification message").build();
        notificationManager.notify(0,notification);

    }


}
