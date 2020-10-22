<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>registerForm1</title>
</head>
<body>
<h1>registerForm1.jspのページ</h1>

<p>ID,NAME,PASSを登録します、入力してください</p>

<form action="/docoTsubu/RegisterUser1" method="post">

<table>

<tr>
<td>ID:</td><td><input type="text" name="id"></td>
</tr>

<tr>
<td>NAME:</td><td><input type="text" name="name"></td>
</tr>

<tr>
<td>PASS:</td><td><input type="password" name="pass"></td>
</tr>

<tr>
<td></td><td><input type="submit" value="登録確認"><input type="reset" value="取消"></td>
</tr>

</table>

</form>

</body>
</html>