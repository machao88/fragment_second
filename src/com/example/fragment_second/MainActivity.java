package com.example.fragment_second;


import android.R.layout;
import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		int width = getWindowManager().getDefaultDisplay().getWidth();
		int height = getWindowManager().getDefaultDisplay().getHeight();
		
		Fragment1 fragment1 = new Fragment1();
		Fragment2 fragment2 = new Fragment2();
		
		android.app.FragmentManager fm = getFragmentManager();
		android.app.FragmentTransaction ft = fm.beginTransaction();
		
		if(width > height) {
			ft.replace(android.R.id.content, fragment1);
		}
		else {
			ft.replace(android.R.id.content, fragment2);
		}
		ft.commit();
	}

}
