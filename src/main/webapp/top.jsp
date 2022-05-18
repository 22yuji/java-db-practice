<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Top</title>
	</head>
	
	<body>
		<h1>検索条件を入力してください</h1>
		<form action="searchServlet" method="post">
		    <label>ユーザ名：</label>
		    <input type="number" name="pID">
		    <br>
		    <button type="submit">検索</button>
		</form>
	</body>
</html>