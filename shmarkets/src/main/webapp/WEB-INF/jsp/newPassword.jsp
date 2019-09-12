<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">

<!-- SITE META -->
<title>Catalog | Responsive Marketplace Showcase Template</title>
<meta name="description" content="">
<meta name="author" content="">
<meta name="keywords" content="">

<!-- FAVICONS -->
<link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon" href="images/apple-touch-icon.png">
<link rel="apple-touch-icon" sizes="57x57"
	href="images/apple-touch-icon-57x57.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="images/apple-touch-icon-72x72.png">
<link rel="apple-touch-icon" sizes="76x76"
	href="images/apple-touch-icon-76x76.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="images/apple-touch-icon-114x114.png">
<link rel="apple-touch-icon" sizes="120x120"
	href="images/apple-touch-icon-120x120.png">
<link rel="apple-touch-icon" sizes="144x144"
	href="images/apple-touch-icon-144x144.png">
<link rel="apple-touch-icon" sizes="152x152"
	href="images/apple-touch-icon-152x152.png">

<!-- TEMPLATE STYLES -->
<link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="style.css">

<!-- CUSTOM STYLES -->
<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css">
<link rel="stylesheet" type="text/css" href="css/flexslider.css">
<link rel="stylesheet" type="text/css" href="css/animate.css">
<link rel="stylesheet" type="text/css" href="css/responsive.css">
<link rel="stylesheet" type="text/css" href="css/custom.css">

</head>
<body>

	<!-- START SITE -->
	<div id="wrapper">
		<section class="section single-wrap">
			<div class="container">
				<div class="page-title">
					<div class="row">
						<div class="col-sx-12 text-center">
							<h3>新密码</h3>
							<div class="bread">
								<ol class="breadcrumb">
									<li><a href="index">首页</a></li>
									<li class="active"><a href="toregister">注册</a></li>
									<li class="active"><a href="tologin">登录</a></li>
								</ol>
							</div>
						</div>
					</div>
				</div>

				<div class="content boxs">
					<div class="row">
						<div class="col-md-12 col-sm-12">
							<div class="page-content">
								<div class="row">
									<div class="col-md-4 col-sm-6">
										<div class="widget">
											<div class="widget-title">
												<h4></h4>
											</div>
											<!-- end widget-title -->
											<div class="login-form">
												<form method="post" action="tologin" role="newPassword">
													<div class="form-group">
														<label>新密码 </label> <span style="color: red" id="pwdError"></span>
														<span id="pwdComplexity"></span> <input type="password"
															name="upwd" required class="form-control" placeholder=""
															id="upwd" onchange="checkPassword()" onkeyup="checkPwd()" />
													</div>
													<div class="form-group">
														<label>确认密码 </label> <span style="color: red"
															id="passwordError"> </span><input type="password"
															name="password" required class="form-control"
															placeholder="" id="password" onchange="checkPassword()" />
													</div>
													<input type="button" name="confirm" class="btn btn-primary"
														value="确认" onclick="checkAndSend()">
												</form>
											</div>
											<!-- end login-form -->
										</div>
										<!-- end widget -->
									</div>
									<!-- end col -->
								</div>
								<!-- end row -->
							</div>
						</div>
						<!-- end col -->
					</div>
					<!-- end row -->
				</div>
				<!-- end content -->
				<br>
				<%@include file="common/advertisement.jsp"%>
			</div>
			<!-- end container -->
		</section>
		<%@include file="common/footer.jsp"%>
	</div>
	<!-- end wrapper -->
	<!-- END SITE -->

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/custom.js"></script>

	<script type="text/javascript">

	function checkAndSend() {
		if(checkPwd()&&checkPassword()){
			var upwd = $("#upwd").val();
			var url = "confirmNewPwd";
			var data = {"upwd":upwd};
			var cas = function(result){
				alert(result.code)
				if(result.code == 1){
					alert("密码修改成功");
					window.location.href="tologin";
				}else{
					alert(result.msg);
			    	window.location.reload();
				}
			};
			$.post(url,data,cas);
		}else{
			alert("请仔细填写密码");
		}
	}

	function checkPwd() {
		console.log("checkPwd");
		var upwd = $("#upwd").val();
		var pwdC = $("#pwdComplexity")
		var l = 0;
		$("#pwdError").text("");
		pwdC.text("");
		
		if (/[a-zA-Z]/.test(upwd)) {
			l++;
		}
		if (/[0-9]/.test(upwd)) {
			l++;
		}
		if (/[^0-9a-zA-Z]/.test(upwd)) {
			l++;
		}
		if (upwd.length < 6 || upwd.length > 15) {
			l = 0;
		}
		
		if(l == 0){
			$("#pwdError").text("密码必须大于等于6位小于等于15位");
			return false;
		}
		if(l == 1){
			pwdC.text("密码强度：低");
		}
		if(l == 2){
			pwdC.text("密码强度：中");
		}
		if(l == 3){
			pwdC.text("密码强度：高");
		}
		return true;
	}

	function checkPassword() {
		console.log("checkPassword");
		var upwd = $("#upwd").val();
		var password = $("#password").val();
		if (upwd == password || !checkPwd() || password.length < 6) {
			$("#passwordError").text("");
			return true;
		} else {
			$("#passwordError").text("两次密码不一致");
			return false;
		}
	}

	</script>

</body>
</html>