package com.example.busstop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class HistoryActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_history, menu);
        return true;
    }
    
    public void testHist01(View view){
    	Intent intent = new Intent(this, ReuseTripActivity.class);
    	String message = "Park Point S, 9:42AM 9:50AM";
    	intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
    
    public void testHist02(View view){
    	Intent intent = new Intent(this, ReuseTripActivity.class);
    	String message = "Gleason Circle, 3:42PM 3:50PM";
    	intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
}
