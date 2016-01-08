package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);  //�˷�������������ʾ�������ݣ�ע��������һ��Ҫ�� setContentView()֮ǰִ��
		setContentView(R.layout.first_layout);    //��layout��������activity��
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {   //������ť������
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
//				Toast.makeText(FristActivity.this, "Button1�������", Toast.LENGTH_LONG).show(); //makeText�������ڴ���һ��toastʵ������Ȼ��ִ�ж����show()������
//             1.��ʾ����intent����ȷָ�������Ļ
//				Intent intent = new Intent(FristActivity.this,SecondActivity.class);
				
/*             2.��ʽ����intent��ͬʱ����action��categoryֵ��intent�Ż�ִ��				
				Intent intent = new Intent("com.example.activitytest.ACTION_START");
				intent.addCategory("com.example.activitytest.MY_CATEGORY");*/
				
/*				3.����ִ��ϵͳ���ö�����intent(Ҳ������ʽintent)
				new Intentʱ������Ǵ�ƥ���action���˴������ Intent.ACTION_VIEW�� ����һ�� Android ϵͳ���õĶ������䳣��ֵΪ android.intent.action.VIEW	  
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));   //Uri.parse()�������ڽ�һ���ַ���������һ��Uri����   */
				
//				4.����intent�ڲ�ͬactivity֮�䴫������
				String data = "Hello SecondActivity";
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("Extra_data",data);
				startActivity(intent); 
			
			}
		});
	}
	//onCreateOptionsMenu()���ڴ����˵��onOptionsItemSelected()��������ָ���˵��и�����ʱ�Ķ���
/*	public boolean onCreateOptionsMemu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
	return true;
	}*/
	
	
}
