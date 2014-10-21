<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>

<body>
<h1>Категории товаров:</h1>
<ul>

<c:forEach var="category" items="${categories}">
<a href = "http://localhost:9090/test-mvn-app/category/${category.categoryId}">
    <li>${category.categoryName}</li></a>
</c:forEach>
</ul>




</body>
</html>