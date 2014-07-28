package com.example.viewchange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class View1 extends Activity implements OnClickListener {

	Button goHome, goView2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view1);

		goHome = (Button) findViewById(R.id.view1GoHome);
		goView2 = (Button) findViewById(R.id.view1GoView2);

		goHome.setOnClickListener(this);
		goView2.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.view1GoHome:
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);
			break;
		case R.id.view1GoView2:
			Intent i2 = new Intent(this, View2.class);
			startActivity(i2);
			break;
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
