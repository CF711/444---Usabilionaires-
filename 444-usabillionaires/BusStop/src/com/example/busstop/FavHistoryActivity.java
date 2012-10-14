package com.example.busstop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class FavHistoryActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_history);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_fav_history, menu);
        return true;
    }
    
    public void favorites(View view){
    	Intent intent = new Intent(this, FavoritesActivity.class);
    	startActivity(intent);
    }
    
    public void history(View view){
    	Intent intent = new Intent(this, HistoryActivity.class);
    	startActivity(intent);
    }
}
