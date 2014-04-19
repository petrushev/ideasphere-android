package com.nasap.ideasphere;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Build;

public class Activity2 extends Activity {
	
	
	
	

	
	
	private ListView listviewnull;

	 private String lv_arr[]={"Problems & Solutions [TAP]"};
	 
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.fragment_activity2);
	        
	        
	      
	        listviewnull=(ListView)findViewById(R.id.listViewNow);

	        // By using setAdpater method in listview we an add string array in list.

	        listviewnull.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));


	        listviewnull.setOnItemClickListener(new OnItemClickListener() {
	      public void onItemClick(AdapterView<?> parent, View view,
	          int position, long id) {
	          final TextView mTextView = (TextView)view;
	          switch (position) {
	            case 0:
	             Intent newActivity0 = new Intent(Activity2.this,Problem2.class);     
	             startActivity(newActivity0);
	            break;
	            default:
	              // Nothing do!
	          }

	      }
	    });
	
	
	
	
	
	
	
	
	
	
	    }
	
	
	
	
}