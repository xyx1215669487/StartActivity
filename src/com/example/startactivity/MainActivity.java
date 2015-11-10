package com.example.startactivity;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button mBtn1;
	private Button mBtn2;
	private String MSG="MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mBtn1=(Button) findViewById(R.id.btn1);
		mBtn2=(Button) findViewById(R.id.btn2);
		mBtn1.setOnClickListener(this);
		mBtn2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			OneActivity.startActivity(MainActivity.this,MSG);
			break;
		case R.id.btn2:
			TwoActivity.startActivity(MainActivity.this, "界面2");
			break;
		}
	}
}
