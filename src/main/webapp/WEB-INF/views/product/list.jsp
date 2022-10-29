<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<br />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>상품명</th>
				<th>상품수량</th>
				<th>상품재고</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${productList}">
				<tr>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.productQty}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../layout/footer.jsp"%>