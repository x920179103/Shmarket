<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
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
<body class="nobg">

    <!-- START SITE -->
    <div id="wrapper">
	<%@include file="common/header.jsp"%>
	
        <section class="section single-wrap">
            <div class="container">
                <div class="page-title">
                    <div class="row">
                        <div class="col-sx-12 text-center">
                            <h3>上架新商品</h3>
                            <div class="bread">
                                <ol class="breadcrumb">
                                  <li><a href="toIndex">返回首页</a></li>
                                  <li class="active">Upload</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="content-top">
                    <div class="row">
                        <div class="col-sx-6 col-sm-6">
                            <div class="custommenu hidden-xs">
                                <a id="showLeft" href="#" title="" class="bt-menu-trigger"><i class="fa fa-bars"></i> <img src="upload/fav.png" alt=""></a>
                            </div>
                        </div> 

                        <div class="col-sm-6 col-xs-12 cen-xs text-right">
                            <ul class="list-inline social">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-behance"></i></a></li>
                                <li><a href="#"><i class="fa fa-pinterest"></i></a></li>
                            </ul>
                        </div>
                    </div><!-- end row -->
                </div><!-- end content top -->
               <!-- 此处原为搜索 -->
                <div class="content boxs">
                    <div class="row">
                        <div class="col-md-8 col-md-offset-2">
                            <div class="widget-title">
                                <h4>上架</h4>
                            </div><!-- end widget-title -->
                            <form class="uploaditem" name="form" id="form" action="multipleImageUpload"
							method="post" enctype="multipart/form-data">
                                <div class="space">   
                                    <label>商品类别 : </label> 
                                    <select class="selectpicker" data-live-search="true" name="tid">
                                        <c:forEach items="${typeList}" var="types">
											<option value="${types.tid}">${types.tname}</option>
										</c:forEach>
                                    </select>  
                                </div>                
                                <div class="space">
                                    <label>商品名称/标题 : </label>
                                    <input type="text" class="form-control" placeholder="" name="cname">    
                                </div>
								<div class="space">
                                    <label>转卖价 : </label>
                                    <input type="number" class="form-control" placeholder="" name="cprice">    
                                </div>
                                <div class="space">
                                    <label>原价 : </label>
                                    <input type="number" class="form-control" placeholder="" name="cnum">    
                                </div>
                                <div class="space">
                                    <label>是否可讲价 : </label>  
                                    <font><input type="radio"  name="cbargain" value="是"/>是</font>
                                    <font><input type="radio"  name="cbargain" value="否" checked="checked"/>否</font>
                                </div>
                                <div class="space">
                                    <label>是否包邮 : </label>
                                    <font onclick="cpostagYes()"><input type="radio"  name="cpostag" value="0"/>是</font>
                                    <font><input type="radio"  name="cpostag" value="否" checked="checked"/>否</font>    
                                </div>
                                <div class="space">
                                    <label>邮费 : </label>
                                    <input type="number" class="form-control" placeholder="" name="cpostage">    
                                </div>
                                <div class="space">
                                    <label>型号 : </label>
                                    <input type="text" class="form-control" placeholder="" name="cmodel">    
                                </div>
                                <div class="space">
                                    <label>颜色 : </label>
                                    <input type="text" class="form-control" placeholder="" name="ccolor">    
                                </div>
                                 <div class="space">   
                                    <label>磨损度 : </label> 
                                    <select class="selectpicker" data-live-search="true" name="cnew">
                                        <option>九成新</option>
                                        <option>九点五成新</option>
                                        <option>八成新</option>
                                    </select>  
                                </div>
                                <div class="space">
                                    <label>发货地 : </label>
                                    <input type="text" class="form-control" placeholder="" name="caddress">    
                                </div>
                                <div class="space">
                                    <label>联系电话 : </label>
                                    <input type="text" class="form-control" placeholder="" name="cphone">    
                                </div>
                                <div class="space">
                                    <label>描述信息 : </label>
                                    <textarea class="form-control" placeholder="" name="cdescribe"></textarea>
                                </div>  
                                 <div class="space">
                                    <label>商品图片：</label>        							
                        			<div class="col-xs-10 col-sm-8 mTop5">
                            		<span onclick=""><input type="file" name="fileName" id="filename"
								accept="image/png, image/jpeg, image/jpg" multiple="multiple"
								onchange="checkImage(this)"></span>
                        			</div>
                                </div>  
                                <div class="space">
                                	<a onclick="checkSubmit()" class="btn btn-primary btn-block">确认上架</a>
                                </div>
                            </form>
                            <div id="onLoadImage"></div>
                        </div><!-- end col -->
                    </div><!-- end row -->
                </div><!-- end content -->

                <br>

               <!--  <div class="content-message boxs">
                    <div class="row">
                        <div class="col-md-10 col-md-offset-1 text-center">
                            <h2>See why over 10,000 designers and developers trust Catalog. Ready to take your marketplace to the next level?</h2>
                            <a href="#" class="btn btn-default btn-lg">Join Today</a>
                        </div>
                    </div>end row
                </div>end content message -->
            </div><!-- end container -->
        </section>

     <%@include file="common/footer.jsp"%>
    </div><!-- end wrapper -->
    <!-- END SITE -->

    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/custom.js"></script>
<script type="text/javascript">
function cpostagYes(){
	$("input[name='cpostage']").val(0);
}

var curFiles = [];//文件数组，用来保存上传的文件信息
//检查上传的图片
function checkImage(obj) {
	var files = obj.files;
	if (files) {

		if (curFiles.length < 3 && files.length <= 3)//把一次上传图片数限制在3张
			Array.prototype.push.apply(curFiles, files);//复制
		else {
			$("#filename").val("");
			alert("一次最多上传3张图片");
		}
	} else {
		$("#filename").val("");
		alert("请选择上传文件");
	}
	//去除文件名相同的情况（上传列表中多次出现同一个文件）
	for (var i = 0; i < curFiles.length - 1; i++) {
		for (var j = 1; j < curFiles.length; j++) {
			if (i != j) {
				if (curFiles[i].name == curFiles[j].name) {
					curFiles.splice(j, 1)
				}
			}
		}
	}

	//判断上传图片大小(100KB)
	for (var i = 0; i < curFiles.length - 1; i++) {
		var size = curFiles[i].size;
		if (size / 1000 > 100) {
			curFiles.splice(i, 1)
		}
	}

	console.log(curFiles);

	onLoadImage();
}

//预览图片
function onLoadImage() {
	$("#onLoadImage").html("");
	for (var i = 0; i < curFiles.length; i++) {
		(function(i) {
			var file = curFiles[i];
			var reader = new FileReader();
			reader.readAsDataURL(file);
			reader.onload = function() {
				$('#onLoadImage')
						.append(
								"<img src='"+reader.result+"'/><span><span>"
										+ file.name
										+ "</span><button id='"
										+ i
										+ "' onclick='del(this.id)'>删除</button></span><br>");
			}
		})(i)
	}
}

//删除功能
function del(id) {
	var name = $("#" + id).prev().text();
	console.log(name);
	curFiles = curFiles.filter(function(file) {
		return file.name !== name;
	});
	console.log(curFiles);
	onLoadImage();
}

//上传功能的实现
function checkSubmit() {
	if (curFiles.length > 0) {
		var formdata = new FormData($('#form')[0]);
		for (var i = 0; i < curFiles.length; i++) {
			formdata.append('uploadFiles', curFiles[i]);
		}
		console.log(formdata);
		 $.ajax({
			url : 'multipleImageUpload',
			type : 'post',
			data : formdata,
			processData : false,
			contentType : false,
			success : function(data) {
				alert(data.msg); 
				/* for ( var k in data) {
					var num = Number(k) + 1;
					alert("第" + num + "张上传结果：" + data[k].msg);
					if (data[k].hasOwnProperty("relativePath"))
						alert("第" + num + "张相对路径："
								+ data[k].msg);
				} */
			},
			error : function(err) {
				alert(data.msg);
			}
		}); 
		
	} else {
		alert("请选择文件后上传");
	}
}
</script>
</body>
</html>