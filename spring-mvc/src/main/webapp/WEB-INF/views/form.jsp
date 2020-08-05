<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/bootstrap/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container mt-3 mb-5">
		<div class="row">
			<div class="col-12">
				<div class="card">
					<form:form id="user-form" method="post" action="signup.do" modelAttribute="userForm">
						<div class="card-header">회원 가입 폼</div>
						<div class="card-body">
							<div class="from-group">
								<label>아이디</label>
								<form:input type="text" class="form-control" path="id" id="user-id"/>
								<form:errors path="id" class="text-danger"></form:errors>
							</div>	
							<div class="from-group">
								<label>이름</label>
								<form:input type="text" class="form-control" path="name" id="user-name"/>
								<form:errors path="name" class="text-danger"></form:errors>
							</div>	
							<div class="from-group">
								<label>비밀번호</label>
								<form:input type="password" class="form-control" path="password" id="user-password"/>
								<form:errors path="password" class="text-danger"></form:errors>
							</div>	
							<div class="from-group">
								<label>전화번호</label>
								<form:input type="text" class="form-control" path="tel" id="user-tel"/>
								<form:errors path="tel" class="text-danger"></form:errors>
							</div>	
							<div class="from-group">
								<label>이메일</label>
								<form:input type="text" class="form-control" path="email" id="user-email"/>
								<form:errors path="email" class="text-danger"></form:errors>
							</div>	
							<div class="from-group">
								<label>나이</label>
								<form:input type="number" class="form-control" path="age" id="user-age"/>
								<form:errors path="age" class="text-danger"></form:errors>
							</div>	
							<div class="from-group">
								<label>생년월일</label>
								<form:input type="date" class="form-control" path="birth" id="user-birth"/>
								<form:errors path="birth" class="text-danger"></form:errors>
							</div>	
						</div>
						<div class="card-footer">
							<a href="/home.do" class="btn btn-secondary">취소</a>
							<button type="submit" class="btn btn-primary">등록</button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>


































