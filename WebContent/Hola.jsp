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
<h3>Contenu du panier de "+username+" : </h3>
<table><tr>
<td>numero d'article</td>
<td>Designation</td>
<td>Prix de un</td></tr>
<tr>
<td><jsp:getProperty name="piano" property="num"/></td>
<td><jsp:getProperty name="piano" property="libelle"/></td>
<td><jsp:getProperty name="piano" property="price"/></td>
	
</tr>
<tr>
<td><jsp:getProperty name="flute" property="num"/></td>
<td><jsp:getProperty name="flute" property="libelle"/></td>
<td><jsp:getProperty name="flute" property="price"/></td>
	
</tr>

</tr>

</table>
<jsp:getProperty name="onePerson" property="name"/>
is

</jsp:scriptlet>

</body>
</html>