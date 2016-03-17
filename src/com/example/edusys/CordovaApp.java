package com.example.edusys;

import org.apache.cordova.CordovaActivity;
import org.apache.cordova.engine.SystemWebViewEngine;

import android.os.Bundle;
import android.webkit.WebView;

public class CordovaApp extends CordovaActivity {
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		loadUrl(launchUrl);
	}



//myCordovaWebView.setWebViewClient(new WebViewClient() {
//public boolean shouldOverrideUrlLoading(WebView view, String url) {
//          view.loadUrl(url);
//          return true;
//           }}); 
//myCordovaWebView.loadUrl("http://google.com");


}
