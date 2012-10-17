package com.example.busstop;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;

public class BrowseActivity extends Activity implements OnItemSelectedListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_browse, menu);
        return true;
    }
    
    public void testBrowse(View view){
    	Intent intent = new Intent(this, ReuseTripActivity.class);
    	Button b = (Button)view;
    	String message = b.getText().toString();
    	intent.putExtra(MainActivity.EXTRA_MESSAGE, message);
    	startActivity(intent);
    }

    /*
     * (non-Javadoc)
     * @see android.widget.AdapterView.OnItemSelectedListener#onItemSelected(android.widget.AdapterView, android.view.View, int, long)
     *
     * This handles what list shows up when an item is selected.
     * 
     * TODO
     *
     */
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		
	}

	public void onNothingSelected(AdapterView<?> arg0) {
		
	}
}
