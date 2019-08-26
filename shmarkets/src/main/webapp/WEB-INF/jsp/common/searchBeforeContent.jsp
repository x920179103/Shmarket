<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

				<div class="content-before">
					<div class="row">
						<div class="col-md-6 col-sx-12 cen-xs">
							<form class="dropForm">
								<div class="input-prepend">
									<div class="btn-group">
										<select name="orderby" class="selectpicker">
											<option>所有商品</option>
											<option>标签1</option>
											<option>标签2</option>
											<option>标签3</option>
										</select>
									</div>
									<input type="text" class="form-control"
										placeholder="选择标签再查找会更精确哦~">
									<button class="btn btn-primary" tabindex="-1">
										<i class="fa fa-search"></i>
									</button>
								</div>
							</form>
						</div>
						<div class="col-md-6 text-right hidden-xs">
							<div class="catalog-order">
								<select name="orderby" class="selectpicker">
									<option value="popularity">根据名字排序</option>
									<option value="rating">根据日期排序</option>
									<option value="date" selected='selected'>根据。。排序</option>
									<option value="price">根据。。排序</option>
								</select>
							</div>
						</div>
					</div>
					<!-- end row -->
				</div>
				<!-- end content before -->