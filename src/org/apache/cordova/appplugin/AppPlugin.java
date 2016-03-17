package org.apache.cordova.appplugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import com.example.edusys.MainActivity;

import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class AppPlugin extends CordovaPlugin {

	private String infos;

	/**
	 * 注意 构造方法不能为
	 * AppPlugin(){}
	 * 可以不写或者 定义为如下
	 * 
	 */
	public AppPlugin() {
	
	}

	CallbackContext callbackContext;

	@Override
	public boolean execute(String action, org.json.JSONArray args, CallbackContext callbackContext)
			throws org.json.JSONException {
		
		this.callbackContext = callbackContext;
		Log.i("123", action);

		if (action.equals("appFun")) {
			// 获取JS传递的args的第一个参数
			infos = args.getString(0);
			this.function();
			
			callbackContext.success();
	        return true;
		}
		return false;

	}

	// 方法执行体
	private void function() {
		// cordova.getActivity() 获取当前activity的this
		Log.i("123", cordova.getActivity().toString());
//		Intent intent = new Intent(cordova.getActivity(), MainActivity.class);
//		intent.putExtra("infos", infos);
//		cordova.startActivityForResult((CordovaPlugin) this, intent, 200);

	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent intent) {

		super.onActivityResult(requestCode, resultCode, intent);
		// 传递返回值 给js方法
//		callbackContext.success(com.alibaba.fastjson.JSONArray.toJSONString(ResponseJSON.getInstance().getJsonObjects()));
//		if (ResponseJSON.getInstance().getJsonObjects() != null
//				&& ResponseJSON.getInstance().getJsonObjects().size() > 0) {
			Toast.makeText(cordova.getActivity(), "恭喜,上传完成", 1000).show();
//		}
	}
}
