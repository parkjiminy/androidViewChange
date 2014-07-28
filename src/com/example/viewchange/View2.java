package com.example.viewchange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class View2 extends Activity implements OnClickListener {

	Button goHome, goView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.view2);

		goHome = (Button) findViewById(R.id.view2GoHome);
		goView1 = (Button) findViewById(R.id.view2GoView1);

		goHome.setOnClickListener(this);
		goView1.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.view2GoHome:
			Intent i = new Intent(this, MainActivity.class);
			startActivity(i);
			break;
		case R.id.view2GoView1:
			Intent i2 = new Intent(this, View1.class);
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
