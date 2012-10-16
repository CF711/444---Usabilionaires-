package com.example.busstop;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class FavHistoryActivity extends TabActivity {
	
	TabHost tabHost;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_history);
        
        TabHost tabHost = getTabHost();
        
        TabSpec favSpec = tabHost.newTabSpec("Favorites");
        favSpec.setIndicator("Favorites", getResources().getDrawable(R.drawable.icon_favs_tab));
        Intent favintent = new Intent(this, FavoritesActivity.class);
        favSpec.setContent(favintent);
        
        TabSpec histSpec = tabHost.newTabSpec("History");
        histSpec.setIndicator("History", getResources().getDrawable(R.drawable.icon_hist_tab));
        Intent histintent = new Intent(this, HistoryActivity.class);
        histSpec.setContent(histintent);
        
        tabHost.addTab(favSpec);
        tabHost.addTab(histSpec);
        
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
