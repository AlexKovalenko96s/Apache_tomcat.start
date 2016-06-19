<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="person" scope="request" class="ua.kas.server_first.PersonBeanModel"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Server_first</title>
</head>
<body>
	<%Integer hitsCount = (Integer)application.getAttribute("hitCounter");
    if( hitsCount ==null || hitsCount == 0 ){
       /* First visit */
       out.println("Welcome to my website!");
       hitsCount = 1;
    }else{
       /* return visit */
       out.println("Welcome back to my website!");
       hitsCount += 1;
       out.println(hitsCount);
    }
    application.setAttribute("hitCounter", hitsCount);
	%>
	
	<br>
	Name: <jsp:getProperty property="name" name="person"/>
	<br>
	Password: <jsp:getProperty property="password" name="person"/>
	<br>
	Repeat password: <jsp:getProperty property="r_password" name="person"/>
	<br>
	Mail: <jsp:getProperty property="email" name="person"/>
</body>
</html>