<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
					<form id="user-form" method="post" action="signup.do">
						<div class="card-header">회원 가입 폼</div>
						<div class="card-body">
							<div class="from-group">
								<label>아이디</label>
								<input type="text" class="form-control" name="id" id="user-id"/>
							</div>	
							<div class="from-group">
								<label>이름</label>
								<input type="text" class="form-control" name="name" id="user-name"/>
							</div>	
							<div class="from-group">
								<label>비밀번호</label>
								<input type="password" class="form-control" name="password" id="user-password"/>
							</div>	
							<div class="from-group">
								<label>전화번호</label>
								<input type="text" class="form-control" name="tel" id="user-tel"/>
							</div>	
							<div class="from-group">
								<label>이메일</label>
								<input type="text" class="form-control" name="email" id="user-email"/>
							</div>	
							<div class="from-group">
								<label>나이</label>
								<input type="number" class="form-control" name="age" id="user-age"/>
							</div>	
							<div class="from-group">
								<label>생년월일</label>
								<input type="date" class="form-control" name="birth" id="user-birth"/>
							</div>	
						</div>
						<div class="card-footer"></div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>