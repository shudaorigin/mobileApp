package com.example.edusys;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NotificationDemo extends Activity {

	Button m_Button1;
	TextView m_txtView;

	NotificationManager m_NotificationManager;
	Notification m_Notification;

	Intent m_Intent;
	PendingIntent m_PendingIntent;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification_demo);

		m_NotificationManager = (NotificationManager) this
				.getSystemService(NOTIFICATION_SERVICE);
		m_Button1 = (Button) this.findViewById(R.id.button1);

		// 点击通知时转移内容
		m_Intent = new Intent(NotificationDemo.this, DesActivity.class);
		m_Intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);  

		m_PendingIntent = PendingIntent.getActivity(NotificationDemo.this, 0,
				m_Intent, 0);

		m_Notification = new Notification();
		m_Notification.when = System.currentTimeMillis(); // 设置来通知时的时间  
//		m_Notification.sound = Uri.parse("android.resource://com.sun.alex/raw/dida"); // 自定义声音  
		m_Notification.flags = Notification.FLAG_NO_CLEAR; // 点击清除按钮时就会清除消息通知,但是点击通知栏的通知时不会消失  
//		m_Notification.flags = Notification.FLAG_ONGOING_EVENT; // 点击清除按钮不会清除消息通知,可以用来表示在正在运行  
		m_Notification.flags |= Notification.FLAG_AUTO_CANCEL; // 点击清除按钮或点击通知后会自动消失  
//		m_Notification.flags |= Notification.FLAG_INSISTENT; // 一直进行，比如音乐一直播放，知道用户响应  
//		m_Notification.defaults = Notification.DEFAULT_SOUND; // 调用系统自带声音  
//		m_Notification.defaults = Notification.DEFAULT_VIBRATE;// 设置默认震动  
//		m_Notification.defaults = Notification.DEFAULT_ALL; // 设置铃声震动  
//		m_Notification.defaults = Notification.DEFAULT_ALL; // 把所有的属性设置成默认  
		
		
//		m_Notification.flags = Notification.FLAG_ONGOING_EVENT; // 将此通知放到通知栏的"Ongoing"即"正在运行"组中 
//		m_Notification.number = 91;
//		m_Notification.flags = Notification.FLAG_NO_CLEAR; // 表明在点击了通知栏中的"清除通知"后，此通知不清除，经常与FLAG_ONGOING_EVENT一起使用 
//		m_Notification.flags |= Notification.FLAG_SHOW_LIGHTS; 
//		m_Notification.defaults = Notification.DEFAULT_LIGHTS; 
////		m_Notification.ledARGB = Color.BLUE; 
//		m_Notification.ledOnMS = 5000; 

		m_Button1.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// 设置通知在状态栏显示的图标
				m_Notification.icon = R.drawable.ic_launcher;

	            // 当我们点击通知时显示的内容
				m_Notification.tickerText = "Button1 通知内容.....";

				// 通知时发出的默认声音
			//	m_Notification.defaults = Notification.DEFAULT_SOUND;

				// 设置通知显示的参数
//				m_Notification.setLatestEventInfo(NotificationDemo.this,
//						"Button1", "Button1通知", m_PendingIntent);

				// 这个可以理解为开始执行这个通知
				m_NotificationManager.notify(0, m_Notification);

			}
		});

	}
}
