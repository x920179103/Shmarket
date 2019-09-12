<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="js/jquery.min.js"></script>
<script src="js/jquery.cookie.js"></script>

<header class="header">
	<div class="container-menu">
		<nav class="navbar navbar-default yamm">
			<div class="container">
				<div class="navbar-table">
					<div class="navbar-cell">
						<div class="navbar-header">
							<a class="navbar-brand" href="index.html"><i
								class="fa fa-hashtag"></i>目录</a>
							<div class="open-menu">
								<button type="button" class="navbar-toggle collapsed"
									data-toggle="collapse"
									data-target="#bs-example-navbar-collapse-2">
									<span class="sr-only">Toggle navigation</span> <span
										class="fa fa-bars"></span>
								</button>
							</div>
						</div>
						<!-- end navbar-header -->
					</div>
					<!-- end navbar-cell -->
					<div class="navbar-cell stretch">
						<div class="collapse navbar-collapse"
							id="bs-example-navbar-collapse-2">
							<div class="navbar-cell">
								<ul class="nav navbar-nav navbar-center">
									<li><a class="active" href="index.html" title="">首页</a></li>
									<li class="dropdown megamenu yamm-half hovermenu"><a
										href="#" data-toggle="dropdown" class="dropdown-toggle">我要买东西<b
											class="fa fa-angle-down"></b></a>
										<ul class="dropdown-menu">
											<li>
												<div class="yamm-content">
													<div class="row">
														<div class="col-md-4 col-sm-6">
															<div class="box">
																<ul>
																	<li><h5>大分类1</h5></li>
																	<li><a href="shop-four.html">小分类1</a></li>
																	<li><a href="shop-three.html">小分类2</a></li>
																	<li><a href="shop-two.html">小分类3</a></li>
																</ul>
															</div>
															<!-- end box -->
														</div>
														<!-- end col -->
														<div class="col-md-4 col-sm-6">
															<div class="box">
																<ul>
																	<li><h5>大分类2</h5></li>
																	<li><a href="shop-four.html">小分类1</a></li>
																	<li><a href="shop-three.html">小分类2</a></li>
																	<li><a href="shop-two.html">小分类3</a></li>
																</ul>
															</div>
															<!-- end box -->
														</div>
														<!-- end col -->
														<div class="col-md-4 col-sm-6">
															<div class="box">
																<ul>
																	<li><h5>大分类3</h5></li>
																	<li><a href="shop-four.html">小分类1</a></li>
																	<li><a href="shop-three.html">小分类2</a></li>
																	<li><a href="shop-two.html">小分类3</a></li>
																</ul>
															</div>
															<!-- end box -->
														</div>
														<!-- end col -->
													</div>
												</div> <!-- end ttmenu-content -->
											</li>
										</ul></li>
									<!-- end mega menu -->
									<li class="dropdown megamenu yamm-half hovermenu"><a
										href="#" data-toggle="dropdown" class="dropdown-toggle">我要卖东西<b
											class="fa fa-angle-down"></b></a>
										<ul class="dropdown-menu">
											<li>
												<div class="yamm-content">
													<div class="row">
														<div class="col-md-4 col-sm-6">
															<div class="box">
																<ul>
																	<li><h5>大分类1</h5></li>
																	<li><a href="shop-four.html">小分类1</a></li>
																	<li><a href="shop-three.html">小分类2</a></li>
																	<li><a href="shop-two.html">小分类3</a></li>
																</ul>
															</div>
															<!-- end box -->
														</div>
														<!-- end col -->
														<div class="col-md-4 col-sm-6">
															<div class="box">
																<ul>
																	<li><h5>大分类2</h5></li>
																	<li><a href="shop-four.html">小分类1</a></li>
																	<li><a href="shop-three.html">小分类2</a></li>
																	<li><a href="shop-two.html">小分类3</a></li>
																</ul>
															</div>
															<!-- end box -->
														</div>
														<!-- end col -->
														<div class="col-md-4 col-sm-6">
															<div class="box">
																<ul>
																	<li><h5>大分类3</h5></li>
																	<li><a href="shop-four.html">小分类1</a></li>
																	<li><a href="shop-three.html">小分类2</a></li>
																	<li><a href="shop-two.html">小分类3</a></li>
																</ul>
															</div>
															<!-- end box -->
														</div>
														<!-- end col -->
													</div>
												</div> <!-- end ttmenu-content -->
											</li>
										</ul></li>
									<!-- end mega menu -->
									<li><a href="forum.html" title="">新手指南</a></li>
									<li><a href="contact.html" title="">联系我们</a></li>
								</ul>
								<ul class="nav navbar-nav navbar-right">
									<li class="dropdown membermenu hovermenu"><a href="#"
										class="dropdown-toggle" data-toggle="dropdown" role="button"
										aria-haspopup="true" aria-expanded="false"><img
											src="upload/member.png" alt="" class="img-circle"> <span
											class="caret"></span></a>
										<ul class="dropdown-menu" id="zhanghao">
											<li class="dropdown-header">未登录</li>
											<li><a href="tologin">登录</a></li>
											<li><a href="toregister">注册</a></li>
											<li><hr></li>
											<li class="dropdown-header" id="zhanghaoName">我的账号</li>
											<li><a href="#">收货地址</a></li>
											<li><a href="#">修改密码</a></li>
											<li><a href="#">购物车</a></li>
											<li><a href="#">上架商品</a></li>
											<li><a href="#">交易记录</a></li>
											<li><a href="#">一键换肤</a></li>
											<li><a href="#">我的其他账号</a></li>
											<li><a href="login" onclick="exit()">退出登录</a></li>
										</ul></li>
								</ul>
							</div>
							<!-- end navbar-cell -->
						</div>
						<!-- /.navbar-collapse -->
					</div>
					<!-- end navbar cell -->
				</div>
				<!-- end navbar-table -->
			</div>
			<!-- end container fluid -->
		</nav>
		<!-- end navbar -->
	</div>
	<!-- end container -->
</header>
<script type="text/javascript">
var userName = "${sessionScope.userName}";
var loginAndRegister = "";
console.log(userName);
if(userName == null || userName == ""){
	loginAndRegister = 
		"<li class='dropdown-header'>未登录</li>" +
		"<li><a href='tologin'>登录</a></li>" + 
		"<li><a href='toregister'>注册</a></li>";
}else{
	loginAndRegister = 
		"<li class='dropdown-header' id='zhanghaoName'>欢迎，" + 
		userName + 
		"</li>" +
		"<li><a href='#'>收货地址</a></li>" + 
		"<li><a href='toedit'>修改个人信息</a></li>" + 
		"<li><a href='toforget2'>修改密码</a></li>" + 
		"<li><a href='#'>购物车</a></li>" + 
		"<li><a href='#'>上架商品</a></li>" + 
		"<li><a href='#'>交易记录</a></li>" + 
		"<li><a href='tologin' id='userLoginOut'>退出登录</a></li>";
}
$("#zhanghao").html(loginAndRegister);

//注销事件
$("#userLoginOut").click(function() {
    var url = "userLoginOut";
    var param = {"name":userName};
    var callback = function(result){
    	alert(userName + "已下线");
    	window.location.reload();
    };
	$.post(url,param,callback);
})

</script>