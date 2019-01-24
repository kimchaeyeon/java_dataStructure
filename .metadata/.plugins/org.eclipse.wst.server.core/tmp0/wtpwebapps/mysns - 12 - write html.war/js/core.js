var AJAX = {
	call: function (url, params, cbfunc) {
		var callobj = {};
		
		callobj["url"] = url;
		callobj["type"] = "POST";
		callobj["data"] = params;
		callobj["cache"] = false;
		callobj["dataType"] = "text";
		callobj["success"] = cbfunc; 
		callobj["error"] = this.onError;

		jQuery.ajax(callobj);
	},

	formCall: function (url, params, cbfunc) {
		var callobj = {};
		
		callobj["url"] = url;
		callobj["type"] = "POST";
		callobj["data"] = params;
		callobj["processData"] = false;
		callobj["contentType"] = false;
		callobj["cache"] = false;
		callobj["dataType"] = "text";
		callobj["success"] = cbfunc; 
		callobj["error"] = this.onError;
		
		jQuery.ajax(callobj);
	},
	
	onError: function (xhr, status, error) {
		if (xhr.status == 0) {
		    alert("네트워크 접속이 원할하지 않습니다.");
		}
		else {
			var str = "code:" + xhr.status + "\n" + "message:" + xhr.responseText + "\n" + "error:" + error;
		    alert(str);
		}
	},
}
