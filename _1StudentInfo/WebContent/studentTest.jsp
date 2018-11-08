<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生管理</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.7/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.7/themes/icon.css">
<script type="text/javascript" src="jquery-easyui-1.6.7/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.6.7/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.6.7/locale/easyui-lang-zh_CN.js"></script>

<script type="text/javascript">
	$(function() {
		var pager = $('#dg').datagrid().datagrid('getPager'); // get the pager of datagrid
		pager.pagination({
			checkOnSelect : 'true'
		});
	})
</script>
</head>
<body>
	<table id="dg" title="学生信息管理" fitColumns="true" style="height: 250px"
		fit="true"
		data-options="rownumbers:true,singleSelect:false,
		toolbar:'#tb',
		pagination:true,url:'student.do',method:'post'">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'sno',width:80">学生编号</th>
				<th data-options="field:'sname',width:100">学生姓名</th>
				<th data-options="field:'gender',width:100">性别</th>
				<th data-options="field:'class_home',width:100">所在班级</th>
				<th data-options="field:'birthday',width:100">生日</th>
				<th data-options="field:'address',width:100">家庭住址</th>
			</tr>
		</thead>
	</table>
</body>
</html>