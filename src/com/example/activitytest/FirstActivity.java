<<<<<<< HEAD
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
		Log.d("FirstActivity", this.toString());      //ÅäºÏ5-1¶Î´úÂëÔËÐÐ
		requestWindowFeature(Window.FEATURE_NO_TITLE);  //´Ë·½·¨ÓÃÓÚÒþ²ØÏÔÊ¾±êÌâÄÚÈÝ£»×¢ÒâÕâ¾ä´úÂëÒ»¶¨ÒªÔÚsetContentView()Ö®Ç°Ö´ÐÐ
		setContentView(R.layout.first_layout);    //½«layout¹ØÁªµ½¸ÃactivityÖÐ
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {                    //´´½¨°´Å¥¼àÌýÆ÷
			@Override
			public void onClick(View v) {
				// TODO ×Ô¶¯Éú³ÉµÄ·½·¨´æ¸ù				
				//makeText·½·¨ÓÃÓÚ´´½¨Ò»¸ötoastÊµÀý¶ÔÏó£¬È»ºóÖ´ÐÐ¶ÔÏóµÄshow()·½·¨¡£
				Toast.makeText(FirstActivity.this, "Button1±»µã»÷ÁË", Toast.LENGTH_LONG).show(); 
//                1.ÏÔÊ¾¶¨Òåintent£¬Ã÷È·Ö¸¶¨´¥·¢µÄ»î¶¯
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent); 
				
//             2.ÒþÊ½¶¨Òåintent£¬Í¬Ê±Âú×ãactionºÍcategoryÖµµÄintent²Å»áÖ´ÐÐ				
/*				Intent intent = new Intent("com.example.activitytest.ACTION_START");
				intent.addCategory("com.example.activitytest.MY_CATEGORY");
				startActivity(intent); */
				
//				3.¶¨ÒåÖ´ÐÐÏµÍ³ÄÚÖÃ¶¯×÷µÄintent(Ò²ÊôÓÚÒþÊ½intent)
//				×¢£ºnew IntentÊ±´«ÈëµÄÊÇ´ýÆ¥ÅäµÄaction£¬´Ë´¦´«ÈëµÄ Intent.ACTION_VIEW£¬ ÕâÊÇÒ»¸ö Android ÏµÍ³ÄÚÖÃµÄ¶¯×÷£¬Æä³£Á¿ÖµÎª android.intent.action.VIEW,»¹ÓÐºÜ¶à
//				ÏµÍ³ÄÚÖÃµÄ¶¯×÷£¬ÈçIntent.ACTION_DAIL(µ÷ÓÃ²¦ºÅÃæ°å),Intent.ACTION_CALL(ºô½ÐÖ¸¶¨µÄµç»°ºÅÂë),Intent.ACTION_MAIN(±êÊ¶ActivityÎªÒ»¸ö³ÌÐòµÄ¿ªÊ¼)µÈµÈ
/*				Intent intent = new Intent(Intent.ACTION_VIEW);
				intent.setData(Uri.parse("http://www.baidu.com"));   //Uri.parse()·½·¨ÓÃÓÚ½«Ò»¸ö×Ö·û´®½âÎö³ÉÒ»¸öUri¶ÔÏó 
				startActivity(intent);  */
				
//				4.ÀûÓÃintentÔÚ²»Í¬activityÖ®¼ä´«ËÍÊý¾Ý
//				4-1´Óµ±Ç°Activity´«ËÍÊý¾Ý¸øÏÂÒ»¸öActivity
//				String data = "Hello SecondActivity";
/*				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("Extra_data",data);
				startActivity(intent)*/; 
//				4-2´ÓÆäÆô¶¯µÄActivity»ñÈ¡·µ»Ø»ØÀ´µÄÊý¾Ý
/*				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				String data = "Hello SecondActivity";
				intent.putExtra("Extra_data",data);
				startActivityForResult(intent, 1);                 //Æô¶¯SecondActivity¶ÔÓ¦µÄÇëÇóÂëÎª1(ÇëÇóÂëÎ¨Ò»±ê×¢¼´¿É)  */
//				ÓÉÓÚÉÏÃæÊÇÓÃstartActivityForResult()À´ÆôÓÃ»î¶¯µÄ£¬ÔÚ±»Æô¶¯µÄ»î¶¯Ïú»ÙÊ±»á»Øµ÷ÉÏÒ»¸ö»î¶¯µÄonActivityResult()·½·¨À´»ñµÃ·µ»ØµÄÊý¾Ý,ÐèÒªÖØÐ´onActivityResult()·½·¨
				
//				5.²âÊÔ»î¶¯µÄ¸÷ÖÖÆô¶¯Ä£Ê½
//				5-1 standardÄ£Ê½
/*				Intent intent = new Intent(FirstActivity.this,FirstActivity.class);
				startActivity(intent);*/
				
			}
		});
	}
	
// onCreateOptionsMenu()ÓÃÓÚ´´½¨²Ëµ¥Ïî£¬onOptionsItemSelected()·½·¨ÓÃÀ´Ö¸¶¨²Ëµ¥ÖÐ¸÷Ïî±»µã»÷Ê±µÄ¶¯×÷
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
=======
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
		requestWindowFeature(Window.FEATURE_NO_TITLE);    //è®¾ç½®çª—å£ä¸æ˜¾ç¤ºä¸»é¢˜(title)
		setContentView(R.layout.first_layout);        //å°†å½“å‰activityä¸Žå¸ƒå±€æ–‡ä»¶å…³è”
		//åˆ›å»ºä¸€ä¸ªbuttonæŽ§ä»¶
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//é™æ€æ–¹æ³•makeTextæ–¹æ³•ç”¨äºŽåˆ›å»ºä¸€ä¸ªToastçš„å®žä¾‹å¯¹è±¡ï¼Œè¯¥æ–¹æ³•éœ€å¸¦3ä¸ªå‚æ•°ï¼Œç¬¬ä¸€ä¸ªæ˜¯Context(ä¸Šä¸‹æ–‡)ï¼Œç¬¬äºŒä¸ªæ˜¯toastè¦æ˜¾ç¤ºçš„å†…å®¹ï¼Œç¬¬ä¸‰ä¸ªå‚æ•°æ˜¯ Toastæ˜¾ç¤ºçš„æ—¶é•¿,æœ‰ä¸¤ä¸ªå†…ç½®å¸¸é‡å¯ä»¥é€‰æ‹© Toast.LENGTH_SHORT å’Œ Toast.LENGTH_LONG
//				Toast.makeText(FirstActivity.this, "You clicked button 1", Toast.LENGTH_SHORT).show();    
				
				Intent intent =  new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(intent);
			}
		});
	}
	 
	//åˆ›å»ºèœå•
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;                //trueè¡¨ç¤ºåˆ›å»ºçš„èœå•éœ€è¦è¢«æ˜¾ç¤º
	}
	
	//å®šä¹‰èœå•æ‰§è¡Œçš„æ“ä½œ
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
>>>>>>> 819ac7385c8705358c41174f52e5d33247fe2dcd
