<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="model.Fruit" %>
    <%
    Fruit f = (Fruit)session.getAttribute("fruit");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>fruit のセッションスコープ練習</title>
</head>
<body>
<h1>fruit のセッションスコープ練習</h1>

<p>名前は：<%= f.getName() %>値段は：<%= f.getPrice() %></p>



</body>
</html>