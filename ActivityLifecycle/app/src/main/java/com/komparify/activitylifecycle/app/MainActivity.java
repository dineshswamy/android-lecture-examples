package com.komparify.activitylifecycle.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putString("android","Beautiful");

        Log.w("App state","Saving state...");
        Log.w("App state","onSaveInstanceState");

    }

    @Override
    public void onRestoreInstanceState(Bundle restoreInstanceState){
        super.onRestoreInstanceState(restoreInstanceState);
        Log.w("App state","onRestoreInstanceState");
        Log.w("App state",restoreInstanceState.getString("android"));
        Log.w("App state","Restoring state...");
    }


    @Override
    public void onStart()
    {
        super.onStart();

        Log.w("App state","onStart");
    }

    @Override
    public void onStop()
    {
        super.onStop();
        Log.w("App State","onStop");
    }

    @Override
    public void onPause()
    {
        super.onPause();
        Log.w("App State","onPause");
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        Log.w("App State","onDestroy");
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
}
