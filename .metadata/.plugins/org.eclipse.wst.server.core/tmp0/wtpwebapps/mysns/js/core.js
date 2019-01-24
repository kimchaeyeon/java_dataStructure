var AJAX = {
		call: function (url, params, cbfunc){
			var callobj = {};
			callobj["url"] = url;
			callobj["type"] = "POST";
			callobj["data"] = params;
			callobj["cache"] = false;
			callobj["dataType"] = "text";
			callobj["success"] = cbfunc;
			callobj["error"] = function (xhr, status, error) {
				
			};
			jQuery.ajax(callobj);
		}

			
		}
