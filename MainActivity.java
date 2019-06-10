package com.example.addition;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
	Button sum;
	EditText num1,num2,answer;
	ToggleButton toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

	sum=(Button)findViewById(R.id.add);
	num1=(EditText)findViewById(R.id.no1);
	num2=(EditText)findViewById(R.id.no2);
	answer=(EditText)findViewById(R.id.ans);
	toggle=(ToggleButton)findViewById(R.id.tb);
	
	sum.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int a=Integer.parseInt(num1.getText().toString());

			int b=Integer.parseInt(num2.getText().toString());
             int c= a+b;
			answer.setText(""+ String.valueOf(c));
		}
	});
	toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
	{
		

		@Override
		public void onCheckedChanged(CompoundButton cb, boolean isChecked) {
			// TODO Auto-generated method stub
			{
				if (isChecked){
					answer.setVisibility(View.VISIBLE);}
				else{
					answer.setVisibility(View.INVISIBLE);
				}
			}
		}
	}
			);
	}


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
