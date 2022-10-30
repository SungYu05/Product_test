<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<br />
		<table class="table table-striped">
			<thead>
				<tr>
					<th>회원명</th>
					<th>비밀번호</th>
					<th>이메일</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="users" items="${usersList}">
					<tr>
						<td>${users.usersName}</td>
						<td>${users.usersPassword}</td>
						<td>${users.usersEmail}</td>
						<td><a href="/users/${users.usersId}" class="btn btn-success">상세보기</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
</div>
<%@ include file="../layout/footer.jsp"%>