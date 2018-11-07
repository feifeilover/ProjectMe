<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试登录</title>
<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#ck").click(function(){
			  $("#img").attr("src","ValidateCodeServle?id="+Math.random())
		});
		
		$("#img").click(function(){
			  $(this).attr("src","ValidateCodeServle?id="+Math.random())
		});
	});
</script>

</head>
<body>
	<img alt="验证码" src="ValidateCodeServle"   id="img">
 	<a href="JavaScript:void(0);"  id="ck">看不清楚，换一个</a>
</body>
</html>