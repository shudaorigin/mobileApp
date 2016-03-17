/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
 function alertDismissed() {
	// do something
}

function al() {
	navigator.notification.alert('消息内容!', // message
	null, // callback
	'提示', // title
	'确定' // buttonName
	);
}

function toggleCon(e) {
	console.log("Called",e.type);
//	if(e.type == "offline") {
//		$("#searchBtn").off("touchstart").attr("disabled","disabled");
//		navigator.notification.alert("Sorry, you are offline.", function() {}, "Offline!");
//	} else {
//		$("#searchBtn").removeAttr("disabled");
//		navigator.notification.alert("Woot, you are back online.", function() {}, "Online!");
//		setupButtonHandler();
//	}
}

//返回键
function eventBackButton(){
//confirm("再点击一次退出!");
//window.plugins.ToastPlugin.show_short('再点击一次退出!');
//document.removeEventListener("backbutton", eventBackButton, false); //注销返回键
//    //3秒后重新注册
//    var intervalID = window.setInterval(
//        function() {
//           window.clearInterval(intervalID);
//           document.addEventListener("backbutton", eventBackButton, false); //返回键
//        },
//        3000
//   );
	navigator.notification.alert('返回键 消息内容!', // message
			null, // callback
			'提示', // title
			'确定' // buttonName
			);
}
//菜单键
function eventMenuButton(){
	navigator.notification.alert(' 菜单键 消息内容!', // message
			null, // callback
			'提示', // title
			'确定' // buttonName
			);
//    window.plugins.ToastPlugin.show_short('点击了 菜单 按钮!');
}
//搜索键
function eventSearchButton(){
	navigator.notification.alert('搜索键 消息内容!', // message
			null, // callback
			'提示', // title
			'确定' // buttonName
			);
//    window.plugins.ToastPlugin.show_short('点击了 搜索 按钮!');
}

function checkConnection() {
//    var networkState = navigator.connection.type;
//
//    var states = {};
//    states[Connection.UNKNOWN]  = 'Unknown connection';
//    states[Connection.ETHERNET] = 'Ethernet connection';
//    states[Connection.WIFI]     = 'WiFi connection';
//    states[Connection.CELL_2G]  = 'Cell 2G connection';
//    states[Connection.CELL_3G]  = 'Cell 3G connection';
//    states[Connection.CELL_4G]  = 'Cell 4G connection';
//    states[Connection.CELL]     = 'Cell generic connection';
//    states[Connection.NONE]     = 'No network connection';
//
//    alert('Connection type: ' + states[networkState]);
	AppPlugin.appFun(function cu(){
		alert("成功");
	},function fa(){
	   alert("失败");
	},[1,2,3,4])
}



var app = {
    // Application Constructor
    initialize: function() {
        this.bindEvents();
    },
    // Bind Event Listeners
    //
    // Bind any events that are required on startup. Common events are:
    // 'load', 'deviceready', 'offline', and 'online'.
    bindEvents: function() {
        document.addEventListener('deviceready', this.onDeviceReady, false);
        
        document.addEventListener("backbutton", eventBackButton, false); //返回键
        document.addEventListener("menubutton", eventMenuButton, false); //菜单键
        document.addEventListener("searchbutton", eventSearchButton, false); //搜索键
        
    },
    // deviceready Event Handler
    //
    // The scope of 'this' is the event. In order to call the 'receivedEvent'
    // function, we must explicitly call 'app.receivedEvent(...);'
    onDeviceReady: function() {
        app.receivedEvent('deviceready');
        $("button").click(function(){
        	//al();
        	checkConnection();
        });
    },
    // Update DOM on a Received Event
    receivedEvent: function(id) {
        var parentElement = document.getElementById(id);
        var listeningElement = parentElement.querySelector('.listening');
        var receivedElement = parentElement.querySelector('.received');

        listeningElement.setAttribute('style', 'display:none;');
        receivedElement.setAttribute('style', 'display:block;');

//        console.log('Received Event: ' + id);
    }
};



app.initialize();