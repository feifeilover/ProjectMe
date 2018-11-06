<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>管理系统</title>
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.6.7/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.6.7/themes/icon.css">
	<script type="text/javascript" src="jquery-easyui-1.6.7/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.6.7/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.6.7/locale/easyui-lang-zh_CN.js"></script>
	<!-- 顶级目录的属性：text 、state 、children 。
	其中children 是设置子目录的，子目录包含text 、attributes 、url 其中url是attributes 属性节点 -->
	<script type="text/javascript">
		$(function() {
			var treeData = [{
				text:"菜单",
				children:[{
					text:"一级菜单1",
					attributes:{
						url:""
					}
				},{
					text:"一级菜单2",
					attributes:{
						url:""						
					}
				},{
					text:"一级菜单3",
					attributes:{
						url:""						
					}
				}]
			}];
			
			//实例化树结构
			$("#tree").tree({
				data:treeData,
				lines:true
			})
		});
		
	</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:70px;background:#B3DFDA;padding:10px">
		<img alt="您的路径错了" src="img/pg.png">
	</div>
	<div data-options="region:'west',split:true,title:'West'" style="width:150px;padding:10px;">
		<ul id="tree"></ul>
	</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px; text-align: center">版权所有@2018</div>
	<div data-options="region:'center',title:'Center'">
		<div class="easyui-tabs" fit="true"> 
			<div title="首页" style="padding:10px">
			</div>
		</div>
	</div>
	

</body>
</html>