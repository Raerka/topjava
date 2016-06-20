<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 06.06.2016
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Meal List</title>
</head>

<h2><a href="index.html">Back to home page</a></h2>
<h2>Meal List</h2>

<c:if test="${!empty meal}">
<table>
    <hr>
    <tr>
        <th>Дата</th>
        <th>Описание</th>
        <th>Калории</th>
        <th>Превышение</th>
    </tr>

    <c:forEach items="${meal}" var="m">
        <tr>
            <td>${m.dateTime}</td>
            <td>${m.description}</td>
            <td>${m.calories}</td>
            <td>${m.exceed}</td>
        </tr>
    </c:forEach>
</table>
</c:if>
<hr>

Hello

</body>

</html>
