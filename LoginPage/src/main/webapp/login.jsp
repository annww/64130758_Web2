<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Login Authentication</title>
	<meta charset="UTF-8">
</head>
<body>
<%-- 	<%@ page contentType="text/html;charset=UTF-8" language="java" %> --%>
<%
    String username = request.getParameter("email");
    String password = request.getParameter("password");

    if ("hong.dta.64cntt@ntu.edu.vn".equals(username) && "HongDuong".equals(password)) {
        response.sendRedirect("UserProfile.html");
    } else {
        response.sendRedirect("Login.html");
    }
%>
</body>
</html>