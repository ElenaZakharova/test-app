<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>
<head>
<title>${categoryName}</title>
</head>
<body>
<h1>${categoryName}</h1>
<ul>

<c:forEach var="product" items="${products}">
<a href = "http://localhost:9090/test-mvn-app/category/${categoryId}/product/${product.productId}">
    <li>${product.productName}</li></a>
</c:forEach>
</ul>




</body>
</html>
