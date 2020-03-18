<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-12">

				<div class="row" id="productMain">
					<div class="col-sm-6">
						<div id="mainImage">
							<img src="img/detailbig1.jpg" alt="" class="img-responsive">
						</div>

						<div class="ribbon new">
							<div class="theribbon">${pdto.category }</div>
							<div class="ribbon-background"></div>
						</div>
						<div class="ribbon sale">
							<div class="theribbon">SALE</div>
							<div class="ribbon-background"></div>
						</div>
						<!-- /.ribbon -->

						<div class="ribbon new">
							<div class="theribbon">NEW</div>
							<div class="ribbon-background"></div>
						</div>
						<!-- /.ribbon -->

					</div>
					<div class="col-sm-6">
						<div class="box">
							<h1 class="text-center">${pdto.pname }</h1>
							<p class="goToDescription">
								<a href="#details" class="scroll-to">${pdto.regdate }</a>
							</p>
							<p class="writer">${pdto.pwriter }</p>
							<c:if test="${s_email eq pdto.pwriter }">
								<p class="text-center buttons">
								<a href="./product?action=pModify&pno=${pdto.pno }" class="btn btn-primary"><i
									class="fa fa-shopping-cart"></i> Modify</a> <a
									href="basket.html" class="btn btn-default"><i
									class="fa fa-heart"></i> Add to wishlist</a>
							</p></c:if>
						</div>

						<div class="row" id="thumbs">
							<div class="col-xs-4">
								<a href="img/detailbig1.jpg" class="thumb"> <img
									src="img/detailsquare.jpg" alt="" class="img-responsive">
								</a>
							</div>
							<div class="col-xs-4">
								<a href="img/detailbig2.jpg" class="thumb"> <img
									src="img/detailsquare2.jpg" alt="" class="img-responsive">
								</a>
							</div>
							<div class="col-xs-4">
								<a href="img/detailbig3.jpg" class="thumb"> <img
									src="img/detailsquare3.jpg" alt="" class="img-responsive">
								</a>
							</div>
						</div>
					</div>

				</div>


				<div class="box" id="details">
					<p>
					<h4>Product details</h4>
					<p>${pdto.pcontent }</p>
					<ul>
						<li>Polyester</li>
						<li>Machine wash</li>
					</ul>
					<h4>Size & Fit</h4>
					<blockquote>
						<p>
							<em>${pdto.pcontent }</em>
						</p>
					</blockquote>

					<hr>
					<div class="social">
						<h4>Show it to your friends</h4>
						<p>
							<a href="#" class="external facebook" data-animate-hover="pulse"><i
								class="fa fa-facebook"></i></a> <a href="#" class="external gplus"
								data-animate-hover="pulse"><i class="fa fa-google-plus"></i></a>
							<a href="#" class="external twitter" data-animate-hover="pulse"><i
								class="fa fa-twitter"></i></a> <a href="#" class="email"
								data-animate-hover="pulse"><i class="fa fa-envelope"></i></a>
						</p>
					</div>
				</div>





			</div>
			<!-- /.col-md-9 -->
		</div>
	</div>