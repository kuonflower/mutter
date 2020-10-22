<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="model.Fruit2" %>
    <%
    Fruit2 fruit2 = (Fruit2) application.getAttribute("fruit2");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>アプリケーションスコープの練習</title>
</head>
<body>

<h1>アプリケーションスコープの練習</h1>


<p>名前:<%= fruit2.getName() %>値段<%= fruit2.getPrice() %>:</p>

</body>
</html>