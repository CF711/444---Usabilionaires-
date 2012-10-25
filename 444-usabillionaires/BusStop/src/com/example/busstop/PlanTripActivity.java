package com.example.busstop;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class PlanTripActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trip);
        
        //ListView listView = (ListView) findViewById(R.id.listView1);
        //String[] values = new String[] { "Colony, 2:42PM 2:45PM", "Colony, 4:42PM 4:45PM", "perkins, 3:42PM 3:45PM", "Park Point S, 2:42PM 2:45PM",
          //"Gleason Circle, 11:42AM 11:45AM", "Gleason Circle, 2:42PM 2:45PM" };

        // First paramenter - Context
        // Second parameter - Layout for the row
        // Third parameter - ID of the TextView to which the data is written
        // Forth - the Array of data
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
          //android.R.layout.simple_list_item_1, android.R.id.text1, values);

        // Assign adapter to ListView
        //listView.setAdapter(adapter);
        
        
        
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_plan_trip, menu);
        return true;
    }
    
    public void selectDestination(View view){
    	Toast.makeText(this, "Added Route", Toast.LENGTH_SHORT).show();
    	LinearLayout routes = (LinearLayout)findViewById(R.id.scroll_layout);
    	Button b = (Button)view;
    	String message = b.getText().toString();
    	TextView textView = new TextView(this);
        textView.setTextSize(20);
        textView.setText(message);
        routes.addView(textView);
    }
    
    public void finishTrip(View view){

    }
}
