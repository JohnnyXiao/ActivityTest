package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.text.style.SuperscriptSpan;
import android.view.Window;

public class ThirdActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.third_layout);
	}
}
