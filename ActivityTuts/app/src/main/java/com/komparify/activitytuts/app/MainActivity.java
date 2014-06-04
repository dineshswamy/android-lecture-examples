package com.komparify.activitytuts.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements View.OnClickListener {

    TextView founding_company_name,founder_name;
    Button start_new_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        founder_name = (TextView)findViewById(R.id.founder_name);
        founding_company_name = (TextView)findViewById(R.id.founding_company_name);
        start_new_activity = (Button)findViewById(R.id.start_new_activity);

        start_new_activity.setOnClickListener(this);



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

    @Override
    public void onClick(View v) {

        if( founder_name.getVisibility() == View.VISIBLE )
                founder_name.setVisibility(View.GONE);
        else if (founder_name.getVisibility() == View.GONE )
                founder_name.setVisibility(View.VISIBLE);

        //founding_company_name.setVisibility(View.VISIBLE);

    }
}
