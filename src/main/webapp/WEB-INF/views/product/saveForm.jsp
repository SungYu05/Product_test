<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="/product/add" method="POST">
		<div class="mb-3 mt-3">
			<input id="productName" type="text" class="form-control"
				placeholder="상품명을 입력하세요" name="productName">
		</div>
		<div class="mb-3">
			<input id="productPrice" type="text" class="form-control"
				placeholder="상품가격을 입력하세요" name="productPrice">
		</div>
		<div class="mb-3">
			<input id="productQty" type="text" class="form-control"
				placeholder="상품수량을 입력하세요" name="productQty">
		</div>
		<button type="submit" class="btn btn-primary">상품등록하기</button>
	</form>
</div>

<script>
</script>
<%@ include file="../layout/footer.jsp"%>