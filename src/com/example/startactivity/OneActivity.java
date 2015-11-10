package com.example.startactivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.widget.Toast;

public class OneActivity extends Activity {
	private static String KEY="key"; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one_activity_main);
		Bundle bundle=this.getIntent().getExtras();
		String msg=bundle.getString(KEY);
		Toast.makeText(OneActivity.this, msg, Toast.LENGTH_SHORT).show();


	}
	public static void startActivity(Context context,String str){
		Intent intext=new Intent(context,OneActivity.class);
		intext.putExtra(KEY, str);
		context.startActivity(intext);
	}
}
