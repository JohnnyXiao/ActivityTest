package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
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
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);    //设置窗口不显示主题(title)
		setContentView(R.layout.first_layout);        //将当前activity与布局文件关联
		//创建一个button控件
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//静态方法makeText方法用于创建一个Toast的实例对象，该方法需带3个参数，第一个是Context(上下文)，第二个是toast要显示的内容，第三个参数是 Toast显示的时长,有两个内置常量可以选择 Toast.LENGTH_SHORT 和 Toast.LENGTH_LONG
//				Toast.makeText(FirstActivity.this, "You clicked button 1", Toast.LENGTH_SHORT).show();    
				
				Intent intent =  new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent);
			}
		});
	}
	 
	//创建菜单
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;                //true表示创建的菜单需要被显示
	}
	
	//定义菜单执行的操作
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add item", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked Remove item", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
}
