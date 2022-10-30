<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">

	<br /> <input id="productId" type="hidden"
		value="${product.productId}" />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>상품명</th>
				<th>상품수량</th>
				<th>상품재고</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${product.productName}</td>
				<td>${product.productPrice}</td>
				<td>${product.productQty}</td>
			</tr>
		</tbody>
	</table>
	<a href="/product/${productId}/edit" class="btn btn-success">상품수정하기</a>
	<form action="/product/${productId}/delete" method="POST">
		<button type="submit" class="btn btn-danger">상품삭제하기</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>