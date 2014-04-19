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
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.os.Build;

public class ListActivity extends Activity {
	String [] underline; 
	
	
	private ListView listviewfirst;

	 private String lv_arr[]={"Mission - European Columbus", "Mission - Data Relay System", "Mission - ExoMars", "Mission - Curiosity", "Mission - ",
			 "Mission - ","Mission - ","Mission - "};
	 
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        requestWindowFeature(Window.FEATURE_NO_TITLE);
	        setContentView(R.layout.fragment_list);
	        
	       
	        Resources res=getResources();
	        underline=res.getStringArray(R.array.underline);
	        listviewfirst=(ListView)findViewById(R.id.listView0);

	        // By using setAdpater method in listview we an add string array in list.

	        listviewfirst.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1 , lv_arr));


	        listviewfirst.setOnItemClickListener(new OnItemClickListener() {
	      public void onItemClick(AdapterView<?> parent, View view,
	          int position, long id) {
	          final TextView mTextView = (TextView)view;
	          switch (position) {
	            case 0:
	             Intent newActivity0 = new Intent(ListActivity.this,Activity0.class);     
	             startActivity(newActivity0);
	            break;
	            case 1:
	             Intent newActivity1 = new Intent(ListActivity.this,Activity1.class);     
	             startActivity(newActivity1);
	            break;
	            case 2:
	             Intent newActivity2 = new Intent(ListActivity.this,Activity2.class);     
	             startActivity(newActivity2);
	            break;
	            case 3:
	             Intent newActivity3 = new Intent(ListActivity.this,Activity3.class);     
	             startActivity(newActivity3);
	            break;
	            default:
	              // Nothing do!
	          }

	      }
	    });
	        
	        
	        
	
	
	
	
	
	
	
	
	
	    }
}