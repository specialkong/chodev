<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%-- <jsp:forward page="/egovSampleList.do"/> --%>


<script>

	function replaceAll(str, searchStr, replaceStr) {
	    return str.split(searchStr).join(replaceStr);
	}

	function format(text, data) {
		
		for(var i=0;i<data.length;i++) {
			var regExp = new RegExp("\\{"+i+"\\}", "g");
			text = text.replace(regExp, data[i]);
			//text = replaceAll(text, pattern, data[i]);
		}
		return text;
	}


	var text = "this is {0} a {1} b {1}";
	var text2 = format(text, ["aaa", "bbb"]);
	console.log(text2);

	

</script>