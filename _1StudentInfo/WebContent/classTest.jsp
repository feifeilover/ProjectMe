<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>班级管理</title>
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
	
	function searchGrade() {
		$('#dg').datagrid('load',{
			gradeName:$('#gradeName').val()
		});
	}
	
</script>



</head>
<body>

	<table id="dg" title="班级信息管理"
	fitColumns="true"
		style="height: 250px"
		fit="true"
		data-options="rownumbers:true,singleSelect:false,
		toolbar:'#tb',
		pagination:true,url:'grade.do',method:'post'">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'id',width:80">班级编号</th>
				<th data-options="field:'gradeName',width:100">班级名称</th>
				<th data-options="field:'gradeDesc',width:100">班级描述</th>
			</tr>		
		</thead>
	</table>
	
	<div id="tb" style="padding:2px 5px;">
		<div>
			<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true"></a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"></a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true"></a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true"></a>
			<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true"></a>
		</div>
		
		<div>
		&nbsp;班级名称:&nbsp; <input text="type" name="gradeName" id="gradeName" style="height:30px"/>&nbsp;<a href="javascript:searchGrade()" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px">Search</a>
		</div>
	</div>
	
	
	
</body>
</html>