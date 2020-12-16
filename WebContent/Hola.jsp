<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% %>
<jsp:directive.page import="metier.*"/>
<jsp:declaration> int a = 3;</jsp:declaration>

<jsp:scriptlet>// String name = (String) session.getattributes("username");</jsp:scriptlet>
<jsp:expression>a </jsp:expression>
<jsp:useBean id="piano" class="metier.Article">
	<jsp:setProperty name="piano" property="num" value = "12345" />
	<jsp:setProperty name="piano" property="libelle" value = "piano standard" />
	<jsp:setProperty name="piano" property="price" value = "1299.99" />
</jsp:useBean>

<jsp:useBean id="flute" class="metier.Article">
	<jsp:setProperty name="flute" property="num" value = "19872" />
	<jsp:setProperty name="flute" property="libelle" value = "flute à bec" />
	<jsp:setProperty name="flute" property="price" value = "12.99" />
</jsp:useBean>
<h3>Bonjour 
<jsp:expression >(String) session.getAttribute("user")</jsp:expression>
<jsp:declaration> DB db = new DB();</jsp:declaration>
 Voici les articles disponibles 
 : </h3>
<jsp:declaration> Article flute = (db).findArticle(19872);</jsp:declaration>
<jsp:declaration> Article piano = (db).findArticle(12345);</jsp:declaration>
<table><tr>
<td>numero d'article</td>
<td>Designation</td>
<td>Prix de un</td></tr>

<tr>
<td><jsp:expression >piano.getNum()</jsp:expression></td>
<td><jsp:expression >piano.getLibelle()</jsp:expression></td>
<td><jsp:expression >piano.getPrice()</jsp:expression></td>
</tr>

<tr>
<td><jsp:expression >flute.getNum()</jsp:expression></td>
<td><jsp:expression >flute.getLibelle()</jsp:expression></td>
<td><jsp:expression >flute.getPrice()</jsp:expression></td>
</tr>
<!--
<td><jsp:getProperty name="piano" property="num"/></td>
<td><jsp:getProperty name="piano" property="libelle"/></td>
<td><jsp:getProperty name="piano" property="price"/></td>
	
</tr>
<tr>
<td><jsp:getProperty name="flute" property="num"/></td>
<td><jsp:getProperty name="flute" property="libelle"/></td>
<td><jsp:getProperty name="flute" property="price"/></td>
-->
	
</tr>



</table>

<h3>contenu de votre panier</h3>
</body>
</html>