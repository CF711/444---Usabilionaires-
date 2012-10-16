package com.example.busstop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class FavoritesActivity extends Activity {
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_favorites, menu);
        return true;
    }
    
    public void testFav(View view){
    	Intent intent = new Intent(this, ReuseTripActivity.class);
    	String message = "Gleason Circle, 11:42AM 11:50AM";
    	intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
    	startActivity(intent);
    }
}
