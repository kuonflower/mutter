<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="model.User1" %>

    <%
    User1 user1 = (User1)session.getAttribute("user1");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>registerConfirm1のページ</title>
</head>
<body>
<h1>登録確認画面！！</h1>

<table>

<tr>
<td>ID:</td>
<td><%= user1.getId() %></td>
</tr>

<tr>
<td>NAME:</td>
<td><%= user1.getName() %></td>
</tr>

<tr>
<td><a href="/docoTsubu/RegisterUser1?action=done">登録</a></td>
<td><a href="/docoTsubu/RegisterUser1">キャンセル</a></td>
</tr>

</table>

</body>
</html>