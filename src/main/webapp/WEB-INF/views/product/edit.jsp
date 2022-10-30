<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="/product/${edit.productId}/edit" method="POST">
		<input id="id" type="hidden" value="${edit.productId}" />
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
					<tr>
						<td><input id="productName"  name="productName" type="text" class="form-control"
						value="${edit.productName}" readonly/></td>
						<td><input id="productPrice" name="productPrice" type="text" class="form-control"
						 value="${edit.productPrice}"></td>
						<td><input id="productQty" name="productQty" type="text" class="form-control"
							 value="${edit.productQty}"></td>
					</tr>
			</tbody>
		</table>
		<button type="submit" class="btn btn-primary">상품수정하기</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>