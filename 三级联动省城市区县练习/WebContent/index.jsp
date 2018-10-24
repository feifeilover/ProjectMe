<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

	$(function() {  //页面进来就加载
		$.get("getPro.do", {}, function(data) {
			var jsonstr = eval(data);
			for (var i = 0; i < jsonstr.length; i++) {
				var str = "<option value='"+jsonstr[i].pid+"'>" + jsonstr[i].pname + "</option>";
				$("#sel1").append(str);
			}
		});
		/* $("#sel1").empty(); */
		
		$("#sel1").change(function() {  //城市
			$.get("getCity.do",{pid:$(this).val()},function(data) {   //pid:$(this).val()当前所点击的下拉框的值
				var jsonstr = eval(data);
				$("#sel11").append("<option>--请选择城市--</option>");
				for(var i=0;i<jsonstr.length;i++) {
					var str = "<option value='"+jsonstr[i].cid+"'>"+ jsonstr[i].cname +"</option>";
					$("#sel11").append(str);
				}
			})
			$("#sel11").empty();
		})
		
		$("#sel11").change(function() {  //区县
			$.get("getcounty.do",{qid:$(this).val()},function(data) {
				var jsonstr = eval(data);
				$("#sel111").append("<option>--请选择区县 --</option>");
				for(var i=0;i<jsonstr.length;i++) {
					var str = "<option value='"+jsonstr[i].qid+"'>" +jsonstr[i].qname+ "</option>";
					$("#sel111").append(str);
				}
			})
			$("#sel111").empty();
		})
	}); 
	
	
	
</script>
</head>
<body>
	<select id="sel1">
		<option>--请选择省份--</option>
	</select>
	
	<select id="sel11">
		<option>--请选择城市--</option>
	</select>
	
	<select id="sel111">
		<option>--请选择区县--</option>
	</select>
</body>
</html>