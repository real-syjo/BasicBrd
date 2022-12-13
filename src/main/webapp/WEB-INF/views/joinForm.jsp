<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="https://code.jquery.com/jquery-1.12.4.min.js"></script>
<head>
<meta charset="UTF-8">
</head>
<body>
	<form id="addForm" action="${pageContext.request.contextPath}/user/save" method="POST">
		<label>Id:</label> 
		<input type="text" name="userId" /> 
		<label>password:</label>
		<input type="text" name="userPass" />
		<label>name:</label> 
		<input type="text" name="userNm" />
		<button type="submit" id="save">가입</button>
	</form>
</body>


