<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html lang="en">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<!--[if IE]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

</head>
<body class="">
	<!-- START SITE -->
	<div id="wrapper">

		<%@include file="common/header.jsp"%>

		<!-- 该页面的主题之类的 -->
		<section class="section single-wrap">
			<div class="container">
				<div class="page-title public-profile-title">
					<div class="row">
						<div class="col-sx-12 text-center">
							<h3>修改个人信息</h3>
						</div>
					</div>

					<div class="content boxs">
						<div class="row">
							<div class="col-md-8">
								<div class="widget-title">
									<h4>联系方式</h4>
								</div>
								<!-- end widget-title -->
								<form class="uploaditem">
									<!-- <div class="space">
                                    <label>选择头像</label>
                                    <div class="fileupload fileupload-new" data-provides="fileupload">
                                        <div class="fileupload-preview thumbnail"></div>
                                        <br>
                                        <span class="btn btn-primary btn-file">
                                        
                                            <span class="fileupload-new">从文件中选择头像</span>
                                            <span class="fileupload-exists">Change</span>
                                            <input type="file">
                                        </span>
                                        <a href="#" class="btn btn-primary fileupload-exists" data-dismiss="fileupload">Remove</a>
                                    </div>
                                </div> -->

									<div class="space">
										<label>电话 : </label> <input type="text" class="form-control"
											placeholder="请输入您的电话">
									</div>

									<div class="space">
										<label>邮箱 : </label> <input type="text" class="form-control"
											placeholder="请输入您的邮箱">
									</div>

									<div class="space">
										<input type="button" onclick="" class="btn btn-primary">更新联系方式</a>
									</div>
								</form>
							</div>
							<!-- end col -->

							<div class="col-md-4">
								<div class="widget-title">
									<h4>收货地址</h4>
								</div>
								<!-- end widget-title -->
								<form class="uploaditem">
									<c:forEach var="addr" items="${addresses }">
										<div class="address">
											<label>${addr.addname }</label> <label>${addr.addphone }</label>
											<label>${addr.address }</label> <input type="button" href="#"
												class="btn btn-primary" id="${addr.addid }" value="编辑地址">
											<input type="button" href="#" class="btn btn-primary "
												id="${addr.addid }" value="删除地址">
										</div>
									</c:forEach>
									<div class="space" align="center">
										<input type="button" href="#" class="btn btn-primary "
											value="添加地址">
										<!-- btn-block -->
									</div>
								</form>
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
			</div>
		</section>
		<%@include file="common/footer.jsp"%>
	</div>
	<!-- end wrapper -->
	<!-- END SITE -->

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/custom.js"></script>


</body>
</html>