package com.test;

import com.bingley.openfolder.OpenFolder;
import com.bingley.openfolder.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class MainAcitivity extends Activity {

	View vOpenView;
	View vBackgroudView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintest);
		
		vOpenView = getLayoutInflater().inflate(R.layout.main_openview, null);
		vBackgroudView = getWindow().getDecorView();
	}

	public void openFolderUp(View view) {
		new OpenFolder(this).openFolderView(view, vBackgroudView, vOpenView, 100, 0);
	}

	public void openFolderDown(View view) {
		new OpenFolder(this).openFolderView(view, vBackgroudView, vOpenView, 100, 1);
	}
}
