package com.komparify.alarmexample.app;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Calendar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setAlarm(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public static void setAlarm(Context context)
    {
        AlarmManager alarm_manager;

        PendingIntent pintent;

        Intent tracker_intent;


        long interval=1000*10; // 1 hour

        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(System.currentTimeMillis());



        tracker_intent=new Intent(context,AlarmExample.class);

        pintent = PendingIntent.getBroadcast(context,0, tracker_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        alarm_manager=(AlarmManager)context.getSystemService(context.ALARM_SERVICE);

        alarm_manager.setRepeating(AlarmManager.RTC_WAKEUP,cal.getTimeInMillis(), interval, pintent);

    }
}
