<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>

<body>
<h1>Все товары:</h1>
<ul>

<c:forEach var="product" items="${allproducts}">
<a href = "http://localhost:9090/test-mvn-app/category/${product.categoryId}/product/${product.productId}">
    <li>${product.productName}</li></a>
</c:forEach>
</ul>




</body>
</html>