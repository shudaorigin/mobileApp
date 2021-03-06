package com.example.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.edusys.R;

public class UINavigationView2 extends LinearLayout {

	private Button btn_left;
	private Button btn_right;
	private TextView tv_title;

	public UINavigationView2(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public UINavigationView2(Context context, AttributeSet attrs) {
		super(context, attrs);

		
//		TypedArray a = context.obtainStyledAttributes(attrs,  R.styleable.RadioButton);
//         this.mValue = a.getString(R.styleable.RadioButton_value);
//         a.recycle();
  
		LayoutInflater layoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		layoutInflater.inflate(R.layout.selfui, null);
		
		btn_left = (Button) findViewById(R.id.btn_left);
		btn_right = (Button) findViewById(R.id.btn_right);
		tv_title = (Button) findViewById(R.id.tv_title);

	}

	public void setBtnLeftBacground(int resId) {

		if (btn_left != null) {
			btn_left.setBackgroundResource(resId);
		}
	}

	public void setBtnRightBacground(int resId) {
		if (btn_right != null) {
			btn_right.setBackgroundResource(resId);
		}

	}

	public void setTvTitle(int resId) {
		if (tv_title != null) {
			tv_title.setText(resId);
		}
	}

	public Button getBtn_left() {
		return btn_left;
	}

	public Button getBtn_right() {
		return btn_right;
	}

	public TextView getTv_title() {
		return tv_title;
	}

}