package com.example.startactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class TwoActivity extends Activity {

	TextView mTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two_activity_main);
		mTextView=(TextView) findViewById(R.id.text);
		Intent intent=getIntent();
		mTextView.setText(intent.getStringExtra("Text"));
	}
	public static void startActivity(Context context,String text){
		Intent intext=new Intent(context,TwoActivity.class);
		intext.putExtra("Text", text);
		context.startActivity(intext);
	}
}
