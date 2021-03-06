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
	
	function deleteGrade(){
		var rows = $('#dg').datagrid('getSelections');
		if(rows.length == 0) {
			$.messager.alert("系统提示:","请选择您要删除的数据");
			return ;
		}
		var ss = [];
		for(var i=0; i<rows.length; i++){
			ss.push(rows[i].id);
		}
		var ids = ss.join(",");
		$.messager.confirm("操作提示:","您确定要删除这"+rows.length+"条数据吗",function(data) {
			if(data) {
				$.post("delete.do",{delIds:ids},function(jsonobject) {
					if(jsonobject.success) {
						$.messager.confirm("系统提示","您已成功删除"+jsonobject.delNums+ "条数据");
						$("#dg").datagrid("reload"); //更新
					} else {
						$.messager.confirm("系统提示:" + jsonobject.errorMsg);
					}
				},"json");
			} else {
				alert("NO");
			}
		});
	}
	
	function newUser() {
		$('#dlg').dialog('open').dialog('center').dialog('setTitle',
				'添加班级');
		$('#fm').form('clear');
		url:'add.do';
		
	}
	
	function saveUser() {
		$('#fm').form('submit', {
			url : url,
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(result) {
				var result = eval('(' + result + ')');
				if (result.errorMsg) {
					$.messager.show({
						title : 'Error',
						msg : result.errorMsg
					});
				} else {
					$('#dlg').dialog('close'); // close the dialog
					$('#dg').datagrid('reload'); // reload the user data
				}
			}
		});
	}
	
	function editUser() {
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			$('#dlg').dialog('open').dialog('center').dialog('setTitle',
					'Edit User');
			$('#fm').form('load', row);
			url = 'edit.do?id=' + row.id;
			
		}
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
			<a href="javascript:newUser()" class="easyui-linkbutton" iconCls="icon-add" plain="true"></a>
			<a href="javascript:editUser()" class="easyui-linkbutton" iconCls="icon-edit" plain="true"></a>
			<a href="javascript:deleteGrade()" class="easyui-linkbutton" iconCls="icon-remove" plain="true"></a>
		</div>
		
		<div>
			&nbsp;班级名称:&nbsp; <input text="type" name="gradeName" id="gradeName" style="height:30px"/>&nbsp;<a href="javascript:searchGrade()" class="easyui-linkbutton" data-options="iconCls:'icon-search'" style="width:80px">Search</a>
		</div>
	</div>
	
	<div id="dlg" class="easyui-dialog" style="width: 400px"
		data-options="closed:true,modal:true,border:'thin',buttons:'#dlg-buttons'">
		<form id="fm" method="post" novalidate
			style="margin: 0; padding: 20px 50px">
			<div style="margin-bottom: 10px">
				<input name="gradeName" class="easyui-textbox" required="true"
					label="班级名称:" style="width: 100%">
			</div>
			<div style="margin-bottom: 10px">
				<input name="gradeDesc" class="easyui-textbox" required="true"
					label="名称描述:" style="width: 100%; height:100px">
			</div>
		</form>
	</div>
	
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton c6"
			iconCls="icon-ok" onclick="saveUser()" style="width: 90px">Save</a> 
	</div>
</body>
</html>