package com.example.animation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button btn1,btn2,btn3,btn4,btn5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn1 = (Button)findViewById(R.id.button1);
		btn2 = (Button)findViewById(R.id.button2);
		btn3 = (Button)findViewById(R.id.button3);
		btn4 = (Button)findViewById(R.id.button4);
		btn5 = (Button)findViewById(R.id.button5);
		
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		
	} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.button1:
			startActivity(new Intent(this, Activity1.class));
			break;
		case R.id.button2:
			startActivity(new Intent(this, Activity2.class));
			break;
		case R.id.button3:
			startActivity(new Intent(this, Activity3.class));
			break;
		case R.id.button4:
			startActivity(new Intent(this, Activity4.class));
			break;
		case R.id.button5:
			startActivity(new Intent(this, Activity5.class));
			break;

		default:
			break;
		}
	}

}
