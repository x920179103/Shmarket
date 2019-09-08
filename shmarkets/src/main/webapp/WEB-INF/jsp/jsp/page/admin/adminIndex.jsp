<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>管理员首页</title>
<!--字体图标-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/icomoon.css"
	rel="stylesheet" />
<!--动画-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/animate.css"
	rel="stylesheet" />
<!--骨架样式-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/common.css"
	rel="stylesheet" />
<!--皮肤（缇娜）-->
<link
	href="${pageContext.request.contextPath}/static/javaex/pc/css/skin/tina.css"
	rel="stylesheet" />
<!--jquery，不可修改版本-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/lib/jquery-1.7.2.min.js"></script>
<!--全局动态修改-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/js/common.js"></script>
<!--核心组件-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/js/javaex.min.js"></script>
<!--表单验证-->
<script
	src="${pageContext.request.contextPath}/static/javaex/pc/js/javaex-formVerify.js"></script>


</head>

<!-- <script type="text/javascript">
	$(document).ready(function() {

		var levelss = $
		{
			admin.alevel
		}
		$("#level").bind("click", function() {
			$.ajax({

				type : "POST",

				url : "administration?levels=" + levelss,

				data : levelss,
				dataType : "json", //返回数据类型

			});
		});

	});
</script> -->
<body>
	<!--顶部导航-->
	<div class="admin-navbar">
		<div class="admin-container-fluid clear">
			<!--logo名称-->
			<div class="admin-logo">交易网后台管理</div>



			<!--右侧-->
			<ul class="admin-navbar-nav fr">
				<li><a href="javascript:;">欢迎您,${admin.ausename} ,管理员</a>
					<ul class="dropdown-menu" style="right: 10px;">
						<li><a href="login_out">退出当前账号</a></li>
					</ul></li>
			</ul>
		</div>
	</div>

	<!--主题内容-->
	<div class="admin-mian">
		<!--左侧菜单-->
		<div class="admin-aside admin-aside-fixed">
			<h1>
				<span class="admin-nav-name">总览</span>
			</h1>
			<div id="admin-toc" class="admin-toc">
				<div class="menu-box">
					<div id="menu" class="menu">
						<ul>
							<li class="menu-item hover">
							<li class="menu-item"><a href="javascript:;">管理员账户管理<i
									class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a onClick="return test02()" href="adminList" target="page"
										>管理员列表</a></li>
									<script>
										function test02(ev) {
											if(${admin.alevel}!=0){
												
												javaex.message({
													content : "权限错误，请联系主管！",
													type : "error"
												});
												
												return false;
												
											}
									
										
										} 
									</script>
									<li><a href="adminList" target="page">页面2</a></li>
									<li><a href="adminembage12" target="page">页面1</a></li>
									<li><a href="adminembage13" target="page">页面1</a></li>
								</ul></li>
							<li class="menu-item"><a href="javascript:;">用户管理<i
									class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="usersList" target="page">用户列表</a></li>
									<li><a href="usersTitleList" target="page">封禁列表</a></li>
									<li><a href="adminembage4" target="page">页面1</a></li>
								</ul></li>
							<li class="menu-item"><a href="javascript:;">审核管理<i
									class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="adminembage5" target="page">页面1</a></li>
									<li><a href="adminembage6" target="page">页面2</a></li>
								</ul></li>
							<li class="menu-item"><a href="javascript:;">投诉管理<i
									class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="adminembage5" target="page">页面1</a></li>
									<li><a href="adminembage6" target="page">页面2</a></li>
								</ul></li>
							<li class="menu-item"><a href="javascript:;">订单管理<i
									class="icon-keyboard_arrow_left"></i></a>
								<ul>
									<li><a href="adminembage5" target="page">页面1</a></li>
									<li><a href="adminembage6" target="page">页面2</a></li>
								</ul></li>
						</ul>
					</div>
				</div>
			</div>
		</div>

		<!--iframe载入内容-->
		<div class="admin-markdown">
			<iframe id="page" name="page" src="adminembage01"></iframe>
		</div>
	</div>
</body>
<script>
	javaex.menu({
		id : "menu",
		isAutoSelected : true,
		key : "",
	});

	$(function() {
		// 设置左侧菜单高度
		setMenuHeight();
	});

	/**
	 * 设置左侧菜单高度
	 */
	function setMenuHeight() {
		var height = document.documentElement.clientHeight
				- $("#admin-toc").offset().top;
		height = height - 10;
		$("#admin-toc").css("height", height + "px");
	}

	// 控制页面载入
	function page(url) {
		$("#page").attr("src", url);
	}
</script>

</html>