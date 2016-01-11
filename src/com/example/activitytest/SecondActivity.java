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
		
//���´�����FirstActivity.java�е�4-1�ζ�Ӧ		
/*		Intent intent = getIntent();   //getIntent()�������ڻ�ȡ���õ�ǰactivity��Intent
		String data = intent.getStringExtra("Extra_data");   
		Log.d("SecondActivity", data);*/
		
//���´�����FirstActivity.java�е�4-2�ζ�Ӧ��ͨ�������ť���������ݸ��ϲ�activityͬʱ��������		
		Button button2 = (Button) findViewById(R.id.button_2);
		button2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				
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
