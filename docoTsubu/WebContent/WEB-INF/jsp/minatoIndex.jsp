<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <%@ page import="model.SiteEV" %>

    <%
    SiteEV siteEV = (SiteEV)application.getAttribute("siteEV");
    %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>minatoIndex.jsp</title>
</head>
<body>
<p>湊　雄介のプロフィールページ</p>


<table>
<tr>
<td><a href="/docoTsubu/MinatoIndex?action=like">いいね</a></td>
<td><%= siteEV.getLike() %>人</td>
</tr>
<tr>
<td><a href="/docoTsubu/MinatoIndex?action=dislike">わるいね</a></td>
<td><%= siteEV.getDislike() %>人</td>
</tr>

</table>
</body>
</html>