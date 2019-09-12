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
							<h3>忘记密码</h3>
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
												<form method="post" action="forget" role="forget" onsubmit="return checkAndSend()">
													<div class="form-group">
														<label>用户名</label>
														<!-- <input type="email" name="email" required class="form-control" placeholder="" /> -->
														<input type="text" name="uname" required
															class="form-control" placeholder="" id="uname" />
													</div>
													<div class="form-group">
															<label>邮箱地址</label> 
															<span style="color: red" id="uemailError"> </span>
															<input type="text"
																name="uemail" required class="form-control"
																placeholder="" id="uemail" onchange="checkEmail()"/><!--   -->
														</div>
													<input type="button" name="sendOut" class="btn btn-primary"
														id="sendOut" value="发送验证码" onclick="checkAndSend()"><!--  -->
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
	<!-- <script src="js/jquery-2.1.4.min.js"></script> -->
	<script src="js/bootstrap.js"></script>
	<script src="js/custom.js"></script>

	<script type="text/javascript">

	var ce = false;
	function checkEmail() {
		var regEmail = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
		var uemail = $("#uemail").val();
		if (regEmail.test(uemail)) {
			$("#uemailError").text("");
			ce = true;
		} else {
			$("#uemailError").text("邮箱格式不正确");
			ce = false;
		}
	};
	
	function checkAndSend(){
		if(ce){
			var uname = $("#uname").val();
			var uemail = $("#uemail").val();
			var url = "toCheckAndSend";
			var data = {"uname":uname,"uemail":uemail};
			var cas = function(result){
				//alert(result.code)
				if(result.code == 1){
					checkCode();
					window.location.href="tonewPassword";
				}else{
					alert(result.msg);
			    	window.location.reload();
				}
			};
			$.post(url,data,cas);
			
		}else{
			alert("邮箱错误");
		}
		
	}
	
	function checkCode(){
		var code = prompt("请输入验证码");
		var url = "checkCode";
		var data = {"code":code};
		var cc = function(result){
			if(result.code != 3){
				alert(result.msg);
		    	window.location.reload();
			}
			//alert("checkCode网络繁忙，请稍后再试");
			//return false;
		};
		$.post(url,data,cc);
	}
	
	</script>

</body>
</html>