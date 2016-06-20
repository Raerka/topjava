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

    <style>
        .true {
            color: red;
        }

        .false {
            color: green;
        }
    </style>
</head>

<h2><a href="index.html">Back to home page</a></h2>
<h2>Meal List</h2>

<c:if test="${!empty meal}">
    <table>
        <hr>
        <tr>
            <th width="150">Дата</th>
            <th width="100">Описание</th>
            <th width="100">Калории</th>
            <th width="100">Превышение</th>
        </tr>

        <c:forEach items="${meal}" var="m">
            <c:if test="${m.exceed}">
                <table class="true">
                    <tr>
                        <td width="150">${m.dateTime}</td>
                        <td width="100">${m.description}</td>
                        <td width="100">${m.calories}</td>
                        <td width="100">${m.exceed}</td>
                    </tr>
                </table>
            </c:if>

            <c:if test="${!m.exceed}">
                <table class="false">
                    <tr>
                        <td width="150">${m.dateTime}</td>
                        <td width="100">${m.description}</td>
                        <td width="100">${m.calories}</td>
                        <td width="100">${m.exceed}</td>
                    </tr>
                </table>
            </c:if>
        </c:forEach>
    </table>
</c:if>
<hr>

</html>
