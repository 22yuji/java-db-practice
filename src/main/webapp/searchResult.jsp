<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Result</title>
	</head>
	
	<body>
		<h1>検索結果</h1>
		<p>データを取得しました</p>
		
		<div>
		    <label>product_id:</label>${fn:escapeXml(product.productId)}<br>
		    <label>product_name:</label>${fn:escapeXml(product.productName)}<br>
			<label>price:</label>${fn:escapeXml(product.price)}
		</div>
  		
	</body>
</html>