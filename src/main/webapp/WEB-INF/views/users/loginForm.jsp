<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="/users/login" method="POST">
		<div class="mb-3 mt-3">
			<input id="usersName" type="text" class="form-control"
				placeholder="성함을 입력하세요" name="usersName">
		</div>
		<div class="mb-3">
			<input id="usersPassword" type="text" class="form-control"
				placeholder="비밀번호를 입력하세요" name="usersPassword">
		</div>
		<button id="btnLogin" type="submit" class="btn btn-primary">로그인</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>