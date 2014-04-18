package com.qmaker.strategy;

import com.qmaker.strategy.employee.impl.MonitorEmpl;
import com.qmaker.strategy.employee.impl.NormalLongEmpl;
import com.qmaker.strategy.employee.impl.NormalShortEmpl;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity 
	implements OnClickListener{

	private Button btn_normal_short;
	private Button btn_normal_long;
	private Button btn_monitor;
	private TextView textView;
	
	private MonitorEmpl monitorEmpl;
	private NormalLongEmpl normalLongEmpl;
	private NormalShortEmpl normalShortEmpl;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		
		
		textView = (TextView) findViewById(R.id.tv_wages);
		btn_normal_short = (Button) findViewById(R.id.btn_normal_short);
		btn_normal_long = (Button) findViewById(R.id.btn_normal_long);
		btn_monitor = (Button) findViewById(R.id.btn_monitor);
		
		btn_normal_short.setOnClickListener(this);
		btn_normal_long.setOnClickListener(this);
		btn_monitor.setOnClickListener(this);
		
		
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		switch (v.getId()) {
		case R.id.btn_monitor:
			monitorEmpl = new MonitorEmpl();
			textView.setText(monitorEmpl.display());
			break;

		case R.id.btn_normal_long:
			normalLongEmpl = new NormalLongEmpl();
			textView.setText(normalLongEmpl.display());
			break;
			
		case R.id.btn_normal_short:
			normalShortEmpl = new NormalShortEmpl();
			textView.setText(normalShortEmpl.display());
			break;
		default:
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
