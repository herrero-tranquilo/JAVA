<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="all">

	<div id="content">

		<div class="container">
			<div class="col-md-12">
				<div class="box">
					<h1>ProductList</h1>
					<p>In our Ladies department we offer wide selection of the best
						products we have found and carefully selected worldwide.</p>
					<c:if test="${s_email ne null && s_email ne ''}">
						<a href="./index.jsp?pg=pWrite" class="btn btn-success">Write</a>
					</c:if>
				</div>
				<div class="row products">

					<c:forEach items="${objList }" var="pdto">

						<div class="col-md-3 col-sm-4">
						
								<div class="product">
									<div class="flip-container">
										<div class="flipper">
											<div class="front">
												<a href="./product?action=pDetail&pno=${pdto.pno }"> <img
													src="resources/img/product1.jpg" alt=""
													class="img-responsive">
												</a>
											</div>
											<div class="back">
												<a href="./product?action=pDetail&pno=${pdto.pno }"> <img
													src="resources/img/product1_2.jpg" alt=""
													class="img-responsive">
												</a>
											</div>
										</div>
									</div>
									<a href="detail.html" class="invisible"> <img
										src="resources/img/product1.jpg" alt="" class="img-responsive">
									</a>
									<div class="text">
										<h3>
											<a href="./product?action=pDetail&pno=${pdto.pno }">${pdto.pname }</a>
										</h3>
										<p class="writer">${pdto.pwriter }</p>
										<p class="buttons">
											<a href="./product?action=pDetail&pno=${pdto.pno }"
												class="btn btn-default">View detail</a> <a
												href="basket.html" class="btn btn-primary"><i
												class="fa fa-shopping-cart"></i>Add to cart</a>
										</p>
									</div>
									<!-- /.text -->
								</div>
						
							<!-- /.product -->
						</div>

					</c:forEach>


				</div>
				<!-- /.products -->

			</div>
		</div>

	</div>