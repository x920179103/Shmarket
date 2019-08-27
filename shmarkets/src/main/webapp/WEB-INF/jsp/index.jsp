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
<link rel="stylesheet" type="text/css" href="css/animate.css">
<link rel="stylesheet" type="text/css" href="css/responsive.css">
<link rel="stylesheet" type="text/css" href="css/custom.css">

</head>
<body>

	<!-- START SITE -->
	<div id="wrapper">

		<%@include file="common/header.jsp"%>

		<!-- 该页面的主题之类的 -->
		<section class="section single-wrap">
			<div class="container">
				<div class="page-title public-profile-title">
					<div class="row">
						<div class="col-sx-12 text-center">
							<h3>二手交易市场</h3>
							<p>想写啥口号就写上</p>
							<a href="#" class="followbtn">东西不想要</a> <span>-</span> <a
								href="#" class="followbtn">想买便宜点</a> <span>-</span> <a href="#"
								class="followbtn">交易不满意</a>
						</div>
					</div>
				</div>

		<%@include file="common/favorites.jsp"%>

		<%@include file="common/searchBeforeContent.jsp"%>

				<div class="content">
					<div class="row">
						<div class="col-md-12 general-title">
							<h4>
								最新商品<span class="hidden-xs"><a href="#"> </a></span>
							</h4>
							<hr>
						</div>
						<!-- end col -->
					</div>
					<!-- end row -->
					<div class="row">
						<div class="col-md-3 col-sm-6">
							<div class="item-box">
								<div class="item-media entry">
									<img src="upload/item_01.jpg" alt="" class="img-responsive">
									<div class="magnifier">
										<div class="item-author">
											<a href="public-profile.html"><img
												src="upload/member_01.jpg" class="img-circle" alt="">
												Amanda</a>
										</div>
										<!-- end author -->
									</div>
									<div class="theme__button">
										<p>
											<a href="single-item.html" title="">$21</a>
										</p>
									</div>
								</div>
								<!-- end item-media -->
								<h4>
									<a href="single-item.html">Weather Forecast</a>
								</h4>
								<small><a href="single-item.html"><i
										class="fa fa-eye"></i> 893</a></small> <small><a
									href="single-item.html"><i class="fa fa-comment-o"></i> 12</a></small>
							</div>
							<!-- end item-box -->
						</div>
						<!-- end col -->

					</div>
					<!-- end row -->
				</div>
				<!-- end content -->

				<div class="content-after text-center boxs">
					<div class="row">
						<div class="col-md-12">
							<nav class="pagination-wrapper">
								<ul class="pagination">
									<li><h5>记得无限翻页哦~</h5></li>
									<li><a href="#" aria-label="Next"> <span
											aria-hidden="true">&raquo;</span>
									</a></li>
								</ul>
							</nav>
						</div>
					</div>
					<!-- end row -->
				</div>
				<!-- end content after -->

				<div class="stores boxs">
					<div class="row">
						<div class="col-md-12 general-title">
							<h4>
								友情推荐<span class="hidden-xs"><a href="stores.html"> </a></span>
							</h4>
							<hr>
						</div>
						<!-- end col -->
					</div>
					<!-- end row -->

					<div class="row homefeatured">
						<div class="col-md-12">
							<div class="storelist panel panel-info">
								<div class="panel-body">
									<div class="form-group row">
										<div class="col-sm-3 col-xs-12">
											<img alt="" class="img-responsive img-thumbnail"
												src="upload/store_09.jpg">
										</div>
										<div class="col-sm-2 col-xs-12">
											<h4>
												<a href="public-profile.html">标题</a>
											</h4>
											<ul>
												<li><a href="#"><i class="fa fa-envelope-o"></i>信息</a></li>
												<li><a href="public-profile.html"><i
														class="fa fa-image"></i>信息</a></li>
												<li><a href="single-item.html"><i
														class="fa fa-shopping-cart"></i>信息</a></li>
												<li><i class="fa fa-map-marker"></i>信息</li>
											</ul>
										</div>
										<div class="col-md-5 col-xs-12">
											<ul class="list-inline">

												<!-- 次要推荐 -->
												<li><a href="single-item.html" title=""><img
														class="img-responsive img-thumbnail"
														src="upload/item_01.jpg" alt=""></a></li>
												<li><a href="single-item.html" title=""><img
														class="img-responsive img-thumbnail"
														src="upload/item_02.jpg" alt=""></a></li>
												<li><a href="single-item.html" title=""><img
														class="img-responsive img-thumbnail"
														src="upload/item_03.jpg" alt=""></a></li>
												<li><a href="single-item.html" title=""><img
														class="img-responsive img-thumbnail"
														src="upload/item_04.jpg" alt=""></a></li>
												<li><a href="single-item.html" title=""><img
														class="img-responsive img-thumbnail"
														src="upload/item_05.jpg" alt=""></a></li>

											</ul>
										</div>
										<!-- end col -->
										<div class="col-sm-2 col-xs-12 text-center">
											<ul>
												<li><a href="#" class="btn btn-primary btn-block">点击进入</a></li>
												<li><a href="public-profile.html" title="">多少次点击</a></li>
												<li><a href="public-profile.html" title="">多少人购买</a></li>
											</ul>
										</div>
									</div>
									<!-- end form-group -->
								</div>
							</div>
						</div>
						<!-- end col -->
					</div>
					<!-- end r0w -->
				</div>
				<!-- end stores -->

				
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
</body>
</html>