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
<jsp:useBean id="onePerson" class="metier.Person">
	<jsp:setProperty name="onePerson" property="name" value = "Dupont" />
	<jsp:setProperty name="onePerson" property="deceased" value = "true" />
</jsp:useBean>
M.
<jsp:getProperty name="onePerson" property="name"/>
is
<jsp:scriptlet>
	if(onePerson.isDeceased()){
		out.print("dead");
		
	}
	else{out.print("alive");
		
	}
</jsp:scriptlet>

</body>
</html>