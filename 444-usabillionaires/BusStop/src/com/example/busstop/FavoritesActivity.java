package com.example.busstop;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

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
}
