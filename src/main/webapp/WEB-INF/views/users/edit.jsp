<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="/users/${edit.usersId}/edit" method="POST">
		<input id="id" type="hidden" value="${edit.usersId}" /> <br />
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
					<td><input id="usersName" name="usersName" type="text"
						class="form-control" value="${edit.usersName}" readonly /></td>
					<td><input id="usersPassword" name="usersPassword" type="text"
						class="form-control" value="${edit.usersPassword}"></td>
					<td><input id="usersEmail" name="usersEmail" type="text"
						class="form-control" value="${edit.usersEmail}"></td>
				</tr>
			</tbody>
		</table>
		<button type="submit" class="btn btn-primary">회원수정하기</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>