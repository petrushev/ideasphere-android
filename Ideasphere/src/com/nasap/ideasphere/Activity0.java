package com.nasap.ideasphere;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.os.Build;

public class Activity0 extends Activity {

	
	
	
	private ListView listviewnull;

	 private String lv_arr[]={"Problems & Solutions [TAP]"};
	 
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.fragment_activity0);
	        
	       
	      
	        listviewnull=(ListView)findViewById(R.id.listViewSecond);

	        // By using setAdpater method in listview we an add string array in list.

	        listviewnull.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));


	        listviewnull.setOnItemClickListener(new OnItemClickListener() {
	      public void onItemClick(AdapterView<?> parent, View view,
	          int position, long id) {
	          final TextView mTextView = (TextView)view;
	          switch (position) {
	            case 0:
	             Intent newActivity0 = new Intent(Activity0.this,Problem0.class);     
	             startActivity(newActivity0);
	            break;
	            default:
	              // Nothing do!
	          }

	      }
	    });










	    }

//Problems & Solutions [TAP]
}
