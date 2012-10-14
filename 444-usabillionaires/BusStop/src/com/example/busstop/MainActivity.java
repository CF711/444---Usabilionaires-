package com.example.busstop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void planTrip(View view){
    	Intent intent = new Intent(this, PlanTripActivity.class);
    	startActivity(intent);
    }
    
    public void browse(View view){
    	Intent intent = new Intent(this, BrowseActivity.class);
    	startActivity(intent);
    }
    
    public void viewFavHist(View view){
    	Intent intent = new Intent(this, FavHistoryActivity.class);
    	startActivity(intent);
    }
    
    
}
