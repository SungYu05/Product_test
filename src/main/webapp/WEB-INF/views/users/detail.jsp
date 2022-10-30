<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">

	<br /> <input id="usersId" type="hidden" value="${usersPS.usersId}" />
	<table class="table table-striped">
		<thead>
			<tr>
				<th>회원명</th>
				<th>비밀번호</th>
				<th>이메일</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${usersPS.usersName}</td>
				<td>${usersPS.usersPassword}</td>
				<td>${usersPS.usersEmail}</td>
			</tr>
		</tbody>
	</table>
	<a href="/users/${usersId}/edit" class="btn btn-success">상품수정하기</a>
	<form action="/users/${usersId}/delete" method="POST">
		<button type="submit" class="btn btn-danger">상품삭제하기</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>