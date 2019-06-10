package com.example.autocomplete;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	Button btn;
	EditText nm;
	EditText roll;
	EditText mob;
	AutoCompleteTextView cl;
	AutoCompleteTextView ci;
	private static final String[] clas=new String[]{"3CE-1","3CE-2","3CE-3","3CE-4"};
	private static final String[] city=new String[]{"Bathinda","Barnala","Jaipur","Jodhpur","Ropar","Rohtak"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm=(EditText)findViewById(R.id.editText1);
        roll=(EditText)findViewById(R.id.editText2);
        mob=(EditText)findViewById(R.id.editText3);
        btn=(Button)findViewById(R.id.button1);
        AutoCompleteTextView at1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        AutoCompleteTextView at2=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView2);
        at1.setThreshold(1);
        at2.setThreshold(1);
        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,clas);
        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,city);
        at1.setAdapter(adapter1);
        at2.setAdapter(adapter2);
       
        btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				/*if(nm.getText()==null || roll.getText()==null || mob.getText()==null || cl.getText()==null || ci.getText()==null)
				{
					Toast.makeText(MainActivity.this,"Data Insufficient",Toast.LENGTH_LONG).show();
					
				}
				else{*/
					Toast.makeText(MainActivity.this,"Thanks for Registeration!",Toast.LENGTH_LONG).show();
				
			}
		});  
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
