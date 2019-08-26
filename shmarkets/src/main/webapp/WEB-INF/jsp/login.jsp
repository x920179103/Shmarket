<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

    <!-- SITE META -->
    <title>Catalog | Responsive Marketplace Showcase Template</title>
    <meta name="description" content="">
    <meta name="author" content="">
    <meta name="keywords" content="">

    <!-- FAVICONS -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="57x57" href="images/apple-touch-icon-57x57.png">
    <link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="76x76" href="images/apple-touch-icon-76x76.png">
    <link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="120x120" href="images/apple-touch-icon-120x120.png">
    <link rel="apple-touch-icon" sizes="144x144" href="images/apple-touch-icon-144x144.png">
    <link rel="apple-touch-icon" sizes="152x152" href="images/apple-touch-icon-152x152.png">

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
<body>

    <!-- START SITE -->
    <div id="wrapper">

		<%@include file="common/header.jsp"%>

        <section class="section single-wrap">
            <div class="container">
                <div class="page-title">
                    <div class="row">
                        <div class="col-sx-12 text-center">
                            <h3>登录</h3>
                            <div class="bread">
                                <ol class="breadcrumb">
                                  <li><a href="index">首页</a></li>
                                  <li class="active"><a href="register">注册账号</a></li>
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
                                                <h4>登录账号</h4>
                                            </div><!-- end widget-title -->

                                            <div class="login-form">
                                                <form method="post" action="" role="login">
                                                    <div class="form-group">
                                                        <label>用户名或邮箱</label>
                                                        <input type="email" name="email" required class="form-control" placeholder="" />
                                                        <span class="fa fa-user"></span>
                                                    </div>
                                                    <div class="form-group">
                                                        <label>密码</label>
                                                        <input type="password" name="password" required class="form-control" placeholder="" />
                                                        <span class="fa fa-lock"></span>
                                                    </div>
                                                    <button type="submit" name="go" class="btn btn-primary">登录</button>
                                                </form>
                                            </div><!-- end login-form -->
                                        </div><!-- end widget -->
                                    </div><!-- end col -->

                                </div><!-- end row -->
                            </div>
                        </div><!-- end col -->
                    </div><!-- end row -->
                </div><!-- end content -->

                <br>


		<%@include file="common/advertisement.jsp"%>

            </div><!-- end container -->
        </section>

        
		<%@include file="common/footer.jsp"%>

    </div><!-- end wrapper -->
    <!-- END SITE -->

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/custom.js"></script>

</body>
</html>