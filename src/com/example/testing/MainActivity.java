package com.example.testing;

import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//find the button that we placed into the layout
		Button ourButton = (Button)findViewById(R.id.button1);
		
		//set a click listener
		ourButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//when the button is clicked it will write text to the screen
				//toast is the class that you use to write text to the screen
				//it takes 3 parameters
				//1. the context of the call
				//2. the text you want to show
				//3. How long you want to show it
				Toast.makeText(MainActivity.this, "You pushed the button", Toast.LENGTH_SHORT).show();
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
