package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class SecondActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
		
//以下代码与FirstActivity.java中的4-1段对应		
/*		Intent intent = getIntent();   //getIntent()方法用于获取启用当前activity的Intent
		String data = intent.getStringExtra("Extra_data");   
		Log.d("SecondActivity", data);*/
		
//以下代码与FirstActivity.java中的4-2段对应，通过点击按钮来返回数据给上层activity同时销毁自身		
		Button button2 = (Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				
/*				Intent intent = new Intent();
				intent.putExtra("data_return", "Hello FirstActivity!!");
				setResult(RESULT_OK, intent);
				finish();*/
				
				Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
				startActivity(intent);
			}
		});
	}
	@Override
	public void onBackPressed(){
		Intent intent = new Intent();
		intent.putExtra("data_return","Hello FirstActivity!!!");
		setResult(RESULT_OK, intent);
	}
}
