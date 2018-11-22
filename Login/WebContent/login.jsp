<%--
  Created by IntelliJ IDEA.
  User: 986758
  Date: 11/14/2018
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method='post'>
    Username : <input type='text' name='username' value="${username}" /> <br>
    Password : <input type='password' name='password' /> <br>
    Remember me : <input type='checkbox' name='remember' /> <br>
    <input type='submit' value='Login'/>
</form>
</body>
</html>
