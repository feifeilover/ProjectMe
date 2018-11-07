<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页面</title>
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.6.7/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="jquery-easyui-1.6.7/themes/icon.css">
	<script type="text/javascript" src="jquery-easyui-1.6.7/jquery.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.6.7/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.6.7/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript">
		$(function() {  //jquery页面上来就加载
			var treeDate = [{
				text:"根",
				children:[{
					text:"班级管理",
					attributes:{
						url:'classTest.jsp'
					}
				},{
					text:"学生管理",
					attributes:{
						url:'studentTest.jsp'
					}
				}]
			}];
		
			$("#tree").tree({
				data:treeDate,
				lines:true,
				onClick:function(node) {
					if(node.attributes) {
						openTab(node.text,node.attributes.url);
					}
				}
			});
			
			//新增tabs
			function openTab(text,url) {
				if($("#tabs").tabs('exists',text)){
					$("#tabs").tabs('select',text);
				} else {
					var content = "<iframe frameborder=0 scrolling='yes' style='width:100%;height:100%;' src='" + url + "'></iframe>";
					$("#tabs").tabs(
						'add',{
							title:text,
							closable:true,
							content:content
						}		
					);
				}
			}
		});
	</script>
</head>
<body class="easyui-layout">
	<div data-options="region:'north',border:false" style="height:60px;background:#FFFFFF;padding:10px">
		<img alt="" src="images/t10.png">
	</div>
	<div data-options="region:'west',split:true,title:'West'" style="width:150px;padding:10px;">
		<ul id="tree"></ul>	
	</div>
	<div data-options="region:'east',split:true,collapsed:true,title:'East'" style="width:100px;padding:10px;">east region</div>
	<div data-options="region:'south',border:false" style="height:50px;background:#A9FACD;padding:10px;">south region</div>
	<div data-options="region:'center'">
		<div class="easyui-tabs" fit="true" id="tabs">
			<div title="首页" style="padding:10px">
			<p>这是一个首页.</p>
			</div>
			<div title="Title2"></div>
			<div title="Title3"></div>
		</div>
	</div>

</body>
</html>