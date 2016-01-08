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
		requestWindowFeature(Window.FEATURE_NO_TITLE);  //此方法用于隐藏显示标题内容；注意这句代码一定要在 setContentView()之前执行
		setContentView(R.layout.first_layout);    //将layout关联到该activity中
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {   //创建按钮监听器
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
//				Toast.makeText(FristActivity.this, "Button1被点击了", Toast.LENGTH_LONG).show(); //makeText方法用于创建一个toast实例对象，然后执行对象的show()方法。
//             1.显示定义intent，明确指定触发的活动
//				Intent intent = new Intent(FristActivity.this,SecondActivity.class);
				
/*             2.隐式定义intent，同时满足action和category值的intent才会执行				
				Intent intent = new Intent("com.example.activitytest.ACTION_START");
				intent.addCategory("com.example.activitytest.MY_CATEGORY");*/
				
/*				3.定义执行系统内置动作的intent(也属于隐式intent)
				new Intent时传入的是待匹配的action，此处传入的 Intent.ACTION_VIEW， 这是一个 Android 系统内置的动作，其常量值为 android.intent.action.VIEW	  
				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));   //Uri.parse()方法用于将一个字符串解析成一个Uri对象   */
				
//				4.利用intent在不同activity之间传送数据
				String data = "Hello SecondActivity";
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("Extra_data",data);
				startActivity(intent); 
			
			}
		});
	}
	//onCreateOptionsMenu()用于创建菜单项，onOptionsItemSelected()方法用来指定菜单中各项被点击时的动作
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
