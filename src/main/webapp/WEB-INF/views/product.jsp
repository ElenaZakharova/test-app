<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>


<!DOCTYPE html>
<html>
<body>

<h1>${productName}</h1>

<p> Price: </p>
<p> ${productPrice}  </p>

<a href = "http://localhost:9090/test-mvn-app/category/${categoryId}">
    <p>Назад в категорию</p></a>


</body>
</html>