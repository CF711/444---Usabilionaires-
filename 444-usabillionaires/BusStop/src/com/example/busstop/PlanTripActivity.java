package com.example.busstop;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class PlanTripActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan_trip);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_plan_trip, menu);
        return true;
    }
}
