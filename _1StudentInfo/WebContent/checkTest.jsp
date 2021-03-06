<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.7/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="jquery-easyui-1.6.7/themes/icon.css">
<script type="text/javascript" src="jquery-easyui-1.6.7/jquery.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.6.7/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="jquery-easyui-1.6.7/locale/easyui-lang-zh_CN.js"></script>

</head>
<body>
	<h2>CheckBox Selection on DataGrid</h2>
	<p>Click the checkbox on header to select or unselect all
		selections.</p>
	<div style="margin: 20px 0;"></div>

	<table id="dg" class="easyui-datagrid"
		title="CheckBox Selection on DataGrid"
		style="width: 700px; height: 250px"
		data-options="rownumbers:true,singleSelect:true,url:'datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'ck',checkbox:true"></th>
				<th data-options="field:'itemid',width:80">Item ID</th>
				<th data-options="field:'productid',width:100">Product</th>
				<th data-options="field:'listprice',width:80,align:'right'">List
					Price</th>
				<th data-options="field:'unitcost',width:80,align:'right'">Unit
					Cost</th>
				<th data-options="field:'attr1',width:220">Attribute</th>
				<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
		</thead>
	</table>
	<div style="margin: 10px 0;">
		<span>Selection Mode: </span> <select
			onchange="$('#dg').datagrid({singleSelect:(this.value==0)})">
			<option value="0">Single Row</option>
			<option value="1">Multiple Rows</option>
		</select><br /> SelectOnCheck: <input type="checkbox" checked
			onchange="$('#dg').datagrid({selectOnCheck:$(this).is(':checked')})"><br />
		CheckOnSelect: <input type="checkbox" checked
			onchange="$('#dg').datagrid({checkOnSelect:$(this).is(':checked')})">
	</div>

</body>
</html>