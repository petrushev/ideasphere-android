package com.nasap.ideasphere;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.os.Build;

public class Problem0 extends Activity {

	
	
	Button button1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_problem0);
		
		
		button1 = (Button)findViewById(R.id.button1);
		
		button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent url = new Intent(Intent.ACTION_VIEW,Uri.parse("http://ideasphere-petrushev.rhcloud.com/mission/15"));
				startActivity(url);
				
			}
		});
		
		
		
		
	}
	
	
	
}
