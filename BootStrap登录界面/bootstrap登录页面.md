导入表头

```
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<!--兼容IE设置 -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		
		<!--引入bootstrap的css -->
		<link rel="stylesheet" href="css/bootstrap.min.css" />
		<!--引入自定义的css文件 -->
		<link rel="stylesheet" href="css/login1.css" />

		<!--兼容IE的js文件两个 -->
		<script src="js/html5shiv.min.js"></script>
		<script type="text/javascript" src="js/respond.min.js"></script>

		<!--引入js:这里需要注意的是写的顺序必须是:jquery->popper->bootstrap（因为bootstrap是依赖前两个的） -->
		<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
		<script type="text/javascript" src="js/popper.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.min.js"></script>
```



栅格和列偏移

```
<!--一行两列,一份两列，一份十列 -->
<div class="row">
	<div class="col-md-2 " style="background-color: red;">啦啦</div>
	<div class="col-md-8" style="background-color: greenyellow;">lala</div>
</div>
		
 <!-- 第一部分向右偏移3个-->
  <div class="row">
      <div class="offset-md-3 col-md-3" style="background-color: red;">啦啦</div>
      <div class="col-md-6" style="background-color: greenyellow;">lala</div>
   </div>

  <!-- 第二部分向右偏移3个-->
  <div class="row">
	  <div class="col-md-3" style="background-color: red;">啦啦</div>
	  <div class="offset-md-3 col-md-6" style="background-color: greenyellow;">lala</div>
  </div>
```



0 . `<main>`标签可以作为文档的主体部分. 

1 .使用main之前的代码

```
<header>Header</header>
<div id="content">Main Content</div>
<footer>Footer</footer>
```

2 .使用mian以后的代码

```
<header>Header</header>
<main id="content">Main Content</main>
<footer>Footer</footer>
```



3.css中的cover:

```
background-size:cover
把背景图像扩展至足够大，以使背景图像完全覆盖背景区域.
```

4 .css中调阴影的样式-》工具

```
https://www.cssmatic.com/box-shadow
```

