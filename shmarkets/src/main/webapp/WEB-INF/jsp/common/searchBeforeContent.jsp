<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
				<div class="content-before">
					<div class="row">
						<div class="col-md-6 col-sx-12 cen-xs">
							<form:form class="dropForm" modelAttribute="commodities">
								<div class="input-prepend">
									<div class="btn-group">
										<select name="tid" class="selectpicker" id="type">
											<option value="">所有商品</option>
											<c:forEach items="${typeList}" var="types">
											<option value="${types.tid}">${types.tname}</option>
											</c:forEach>
										</select>
									</div>
									<input onkeyup="relativeS()" autocomplete="off" type="text" class="form-control" id="search-keyword" name="cname"
										placeholder="选择标签再查找会更精确哦~" onfocus="relativeS()" onblur="setTimeout(hiddenhot,100)">
									<button  type="button" class="btn btn-primary" tabindex="-1" onclick="search()">
										<i class="fa fa-search"></i>
									</button>
									<!-- 下拉框 -->
	 								<ul id="hotwords" ></ul>
								</div>
							</form:form>
						</div>
						<div class="col-md-6 text-right hidden-xs">
							<div class="catalog-order">
								<select name="orderby" class="selectpicker" id="orderby" onchange="orderby()">
									<option value="date" selected='selected'>按日期排序</option>
									<option value="priceASC">按价格升序</option>
									<option value="dateDESC">按价格降序</option>
								</select>
							</div>
						</div>
					</div>
					<!-- end row -->
				</div>
				<!-- end content before -->
<script type="text/javascript">
//搜索框下拉显示相关
var content;
function relativeS(){
	var input=$("#search-keyword").val();
	var tid=$("#type").val();
	if(content!=input){
		content=input;
		var params;
		if(""==tid){
			params={cname:content};
		}else{
			params={cname:content,tid:tid};
		}
		$.get("hotWords",params,function(data){
			 if(data!=null && data.length>0){
				 $("#hotwords").css('display','block');
				 $("#hotwords li").remove();//移除之前生成的li相关搜索
				 for(var i=0;i<data.length;i++){
				 	var li = document.createElement("li");
					li.innerHTML = data[i].cname;
					li.onclick = function onclick(){
				    	choosecontent(this);
				    }
					$("#hotwords").append(li);
				 }
				 $("li").css('cursor','pointer');
			}else{
				$("#hotwords").css('display','none');
				 }
		},'json');
	}
}
//选中下拉框中的词
function choosecontent(e){
	var input = document.getElementById("search-keyword");
	input.value = e.innerHTML;
	$("#hotwords").css('display','none');
}
//搜索框丢失焦点，下拉框也会消失
function hiddenhot(){
	$("#hotwords").css('display','none');
}

function orderby(){
	var orderby=$("#orderby").val();
	search(1);
}
</script>