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

		<%@include file="common/header.jsp"%>

		<section class="section single-wrap">
			<div class="container">
				<div class="page-title">
					<div class="row">
						<div class="col-sx-12 text-center">
							<h3>注册</h3>
							<div class="bread">
								<ol class="breadcrumb">
									<li><a href="index">首页</a></li>
									<li class="active"><a href="tologin">登录账号</a></li>
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

									<div class="col-md-8 col-sm-6">
										<div class="widget">
											<div class="widget-title">
												<h4>没有帐户？立即注册！</h4>
											</div>
											<!-- end widget-title -->

											<div class="login-form register-form">
												<form method="post" action="register" class="row">
													<div class="col-md-6">
														<div class="form-group">
															<label>用户名 </label> <span style="color: red"
																id="unameError"> </span> <input type="text" name="uname"
																id="uname" required class="form-control" placeholder=""
																onchange="checkName()" /> <span class="fa fa-user"></span>
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label>邮箱地址</label> <span style="color: red"
																id="uemailError"> </span><input type="text"
																name="uemail" required class="form-control"
																placeholder="" id="uemail" onchange="checkEmail()" /> <span
																class="fa fa-envelope"></span>
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label>密码 <span style="color: red" id="pwdError"></span>
																<span id="pwdComplexity"></span>
															</label> <input type="password" name="upwd" required
																class="form-control" placeholder="" id="upwd"
																onchange="checkPassword()" onkeyup="checkPwd()" /> <span
																class="fa fa-lock"></span>
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label>确认密码 </label> <span style="color: red"
																id="passwordError"> </span><input type="password"
																name="password" required class="form-control"
																placeholder="" id="password" onchange="checkPassword()" />
															<span class="fa fa-lock"></span>
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label>电话号码 </label> <span style="color: red"
																id="uphoneError"> </span><input type="text"
																name="uphone" required class="form-control"
																placeholder="" id="uphone" onchange="checkPhone()" /> <span
																class="fa fa-phone"></span>
														</div>
													</div>
													<div class="col-md-6">
														<div class="form-group">
															<label>性别 </label> <span style="color: red"
																id="usexError"> </span><input type="radio" name="usex"
																value="男" checked="checked"/>男 <input type="radio" name="usex" value="女" />女
														</div>
													</div>
													<div class="col-md-12">
														<button type="submit" name="go" class="btn btn-primary"
															onclick="return check()">立即注册</button>
													</div>
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

	<script src="js/jquery-2.1.4.min.js"></script>
	<script type="text/javascript">

		function checkPwd() {
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
				$("#pwdError").text("密码必须大于六位小于15位");
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
		
		function checkPhone() {
			var regPhone = /^1([38]\d|5[0-35-9]|7[3678])\d{8}$/;
			var uphone = $("#uphone").val();
			if (regPhone.test(uphone)) {
				$("#uphoneError").text("");
				return true;
			} else {
				$("#uphoneError").text("电话号码格式不正确");
				return false;
			}
		}

		function checkEmail() {
			var regEmail = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
			var uemail = $("#uemail").val();
			if (regEmail.test(uemail)) {
				$("#uemailError").text("");
				return true;
			} else {
				$("#uemailError").text("邮箱格式不正确");
				return false;
			}
		}

		function checkPassword() {
			var upwd = $("#upwd").val();
			var password = $("#password").val();
			if (upwd == password || !checkPwd() || password.length < 6) {
				console.log("checkPassword");
				$("#passwordError").text("");
				return true;
			} else {
				$("#passwordError").text("两次密码不一致");
				return false;
			}
		}
		
		var checkNameBoo = false;
		function checkName(){
			var uname = $("#uname").val();
			$.ajax({ 
				type : "POST",
				url : "uname",
				data :{'uname':uname},
				success : function(data) { 
					checkNameBoo = data;
					nameError(data);
				},
			});
		}
		
		function nameError(boo){
			var Error = $("#unameError");
			if(boo){
				Error.text("");
			}else{
				Error.text("该用户名已存在！");
			}
		}
		
		function check() {
			if(checkPhone() && checkEmail() && checkPassword() && checkPwd() && checkNameBoo) {
				alert("注册成功！请记住您的账号和密码");
				return true;
			}else{
				alert("注册失败！请仔细填写您的信息");
				return false;
			}
		}

	</script>

</body>
</html>