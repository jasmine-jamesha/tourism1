package com.example.tourism;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Abc extends Activity {
	String[] country = { "India", "USA", "China", "Japan", "Other",  };  
	Spinner spnr;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.page1);
		   Spinner spin = (Spinner) findViewById(R.id.spinner1);  
		   //spin.setOnItemSelectedListener(this);  
	          
	        //Creating the ArrayAdapter instance having the country list  
	        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);  
	        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);  
	        //Setting the ArrayAdapter data on the Spinner  
	        spin.setAdapter(aa);  
	    }  
	 public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {  
	        Toast.makeText(getApplicationContext(),country[position] ,Toast.LENGTH_LONG).show();  
	    }  
	  
	    
	    
}
