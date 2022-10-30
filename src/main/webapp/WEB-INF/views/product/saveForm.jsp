<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form>
		<div class="mb-3 mt-3">
			<input id="productName" type="text" class="form-control"
				placeholder="상품명을 입력하세요">
			<button id="btnproductNameSameCheck" class="btn btn-warning"
				type="button">상품명 중복체크</button>
		</div>
		<div class="mb-3">
			<input id="productPrice" type="text" class="form-control"
				placeholder="상품가격을 입력하세요">
		</div>
		<div class="mb-3">
			<input id="productQty" type="text" class="form-control"
				placeholder="상품수량을 입력하세요">
		</div>
		<button id="btnSave" type="button" class="btn btn-primary">상품등록하기</button>
	</form>
</div>
<script src="/js/product.js"></script>

</script>
<%@ include file="../layout/footer.jsp"%>