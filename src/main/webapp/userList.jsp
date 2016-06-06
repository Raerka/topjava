<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User list</title>
</head>
<body>
<h2><a href="index.html">Home</a></h2>
<h2>User list</h2>


<form action="loginServlet" method="post">
    Username: <label>
    <input type="text" name="user">
</label>
    Password: <label>
    <input type="text" name="pwd">
</label>
    <input type="submit" value="Login">
</form>


</body>
</html>
