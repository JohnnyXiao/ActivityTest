package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch(requestCode){
		case 1:{
			if (resultCode == RESULT_OK){
				String returnData = data.getStringExtra("data_return");
				Log.d("FirstActivity", returnData);
			}
			break;
		}
		default:
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("FirstActivity", this.toString());      //���5-1�δ�������
		requestWindowFeature(Window.FEATURE_NO_TITLE);  //�˷�������������ʾ�������ݣ�ע��������һ��Ҫ��setContentView()֮ǰִ��
		setContentView(R.layout.first_layout);    //��layout��������activity��
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {                    //������ť������
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������				
				//makeText�������ڴ���һ��toastʵ������Ȼ��ִ�ж����show()������
				Toast.makeText(FirstActivity.this, "Button1�������", Toast.LENGTH_LONG).show(); 
//                1.��ʾ����intent����ȷָ�������Ļ
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent); 
				
//             2.��ʽ����intent��ͬʱ����action��categoryֵ��intent�Ż�ִ��				
/*				Intent intent = new Intent("com.example.activitytest.ACTION_START");
				intent.addCategory("com.example.activitytest.MY_CATEGORY");
				startActivity(intent); */
				
//				3.����ִ��ϵͳ���ö�����intent(Ҳ������ʽintent)
//				ע��new Intentʱ������Ǵ�ƥ���action���˴������ Intent.ACTION_VIEW�� ����һ�� Android ϵͳ���õĶ������䳣��ֵΪ android.intent.action.VIEW,���кܶ�
//				ϵͳ���õĶ�������Intent.ACTION_DAIL(���ò������),Intent.ACTION_CALL(����ָ���ĵ绰����),Intent.ACTION_MAIN(��ʶActivityΪһ������Ŀ�ʼ)�ȵ�
/*				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));   //Uri.parse()�������ڽ�һ���ַ���������һ��Uri���� 
				startActivity(intent);  */
				
//				4.����intent�ڲ�ͬactivity֮�䴫������
//				4-1�ӵ�ǰActivity�������ݸ���һ��Activity
//				String data = "Hello SecondActivity";
/*				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("Extra_data",data);
				startActivity(intent)*/; 
//				4-2����������Activity��ȡ���ػ���������
/*				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				String data = "Hello SecondActivity";
				intent.putExtra("Extra_data",data);
				startActivityForResult(intent, 1);                 //����SecondActivity��Ӧ��������Ϊ1(������Ψһ��ע����)  */
//				������������startActivityForResult()�����û�ģ��ڱ������Ļ����ʱ��ص���һ�����onActivityResult()��������÷��ص�����,��Ҫ��дonActivityResult()����
				
//				5.���Ի�ĸ�������ģʽ
//				5-1 standardģʽ
/*				Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
				startActivity(intent);*/
				
			}
		});
	}
	
// onCreateOptionsMenu()���ڴ����˵��onOptionsItemSelected()��������ָ���˵��и�����ʱ�Ķ���
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