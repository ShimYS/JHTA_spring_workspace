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
					<div class="card-header">
						제품리스트
						<select class="float-right">
								<option value="">전체</option>
							<c:forEach var="category" items="${categories}">
								<option value="${category.id }">${category.name }</option>
							</c:forEach>
						</select>
					</div>
					<div class="card-body">
						<table class="table">
							<colgroup>
								<col width="10%">
								<col width="40%">
								<col width="20%">
								<col width="15%">
								<col width="10%">
							</colgroup>
							<thead>
								<tr>
									<th>번호</th>
									<th>상품명</th>
									<th>가격(할일가)</th>
									<th>재고</th>
									<th>구매</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="product" items="${products }">
									<tr>
										<td>${product.no }</td>
										<td>${product.name }</td>
										<td>
											<fmt:formatNumber value="${product.price }" /> 원
											(<span class="text-weight-bold text-danger">
												<fmt:formatNumber value="${product.discountPrice }" /> 원 
											</span>)
										</td>
										<td><fmt:formatNumber value="${product.stock }"/></td>
										<td><a href="/order/step1.do?no=${product.no }" class="btn btn-success btn-sm">구매</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
					<div class="card-footer text-right">
						<a href="add.do" class="btn btn-primary">제품 등록</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>