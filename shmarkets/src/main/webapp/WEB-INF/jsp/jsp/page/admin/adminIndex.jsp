<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>管理员首页</title>
<!--字体图标-->
<link href="${pageContext.request.contextPath}/static/javaex/pc/css/icomoon.css" rel="stylesheet" />
<!--动画-->
<link href="${pageContext.request.contextPath}/static/javaex/pc/css/animate.css" rel="stylesheet" />
<!--骨架样式-->
<link href="${pageContext.request.contextPath}/static/javaex/pc/css/common.css" rel="stylesheet" />
<!--皮肤（缇娜）-->
<link href="${pageContext.request.contextPath}/static/javaex/pc/css/skin/tina.css" rel="stylesheet" />
<!--jquery，不可修改版本-->
<script src="${pageContext.request.contextPath}/static/javaex/pc/lib/jquery-1.7.2.min.js"></script>
<!--全局动态修改-->
<script src="${pageContext.request.contextPath}/static/javaex/pc/js/common.js"></script>
<!--核心组件-->
<script src="${pageContext.request.contextPath}/static/javaex/pc/js/javaex.min.js"></script>
<!--表单验证-->
<script src="${pageContext.request.contextPath}/static/javaex/pc/js/javaex-formVerify.js"></script>
</head>

<body>
<!--顶部导航-->
	<div class="admin-navbar">
		<div class="admin-container-fluid clear">
			<!--logo名称-->
			<div class="admin-logo">交易网后台管理</div>
			
		
			
			<!--右侧-->
			<ul class="admin-navbar-nav fr">
				<li>
					<a href="javascript:;">欢迎您，管理员</a>
					<ul class="dropdown-menu" style="right: 10px;">
						<li><a href="login.html">退出当前账号</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>
	
	<!--主题内容-->
	<div class="admin-mian">
		<!--左侧菜单-->
		<div class="admin-aside admin-aside-fixed">
			<h1><span class="admin-nav-name">总览</span></h1>
			<div id="admin-toc" class="admin-toc">
				<div class="menu-box">
					<div id="menu" class="menu">
						<ul>
							<li class="menu-item hover">
								<a href="javascript:page('iframe-page.html');">管理中心</a>
							</li>
							<li class="menu-item">
								<a href="javascript:;">用户管理<i class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="javascript:page('/admin/user/avatar');">用户列表</a></li>
									<li><a href="javascript:page('/admin/user/password');">封禁用户</a></li>
									<li><a href="javascript:page('/admin/user/avatar');">申诉列表</a></li>
								</ul>
							</li>
							<li class="menu-item">
								<a href="javascript:;">审核管理<i class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="javascript:page('/admin/user/avatar');">上架审核</a></li>
									<li><a href="javascript:page('/admin/user/avatar');">审核失败</a></li>
								</ul>
							</li>
							<li class="menu-item">
								<a href="javascript:;">投诉管理<i class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="javascript:page('/admin/user/avatar');">已解决</a></li>
									<li><a href="javascript:page('/admin/user/password');">未解决</a></li>
								</ul>
							</li>
							<li class="menu-item">
								<a href="javascript:;">订单管理<i class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="javascript:page('/admin/user/avatar');">上架审核</a></li>
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		
		<!--iframe载入内容-->
		<div class="admin-markdown">
			<iframe id="page" src="iframe-page.html"></iframe>
		</div>
	</div>
</body>
<script>
	var hightUrl = "xxxx";
	javaex.menu({
		id : "menu",
		isAutoSelected : true,
		key : "",
		url : hightUrl
	});
	
	$(function() {
		// 设置左侧菜单高度
		setMenuHeight();
	});
	
	/**
	 * 设置左侧菜单高度
	 */
	function setMenuHeight() {
		var height = document.documentElement.clientHeight - $("#admin-toc").offset().top;
		height = height - 10;
		$("#admin-toc").css("height", height+"px");
	}
	
	// 控制页面载入
	function page(url) {
		$("#page").attr("src", url);
	}
</script>
</html>