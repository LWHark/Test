<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@ page import="java.sql.*,com.spring.register.model.*,com.spring.register.service.*" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%
	String username = request.getParameter("username");
String password = request.getParameter("password");
String password2 = request.getParameter("password2");
if(password != null && password.equals(password2)) {
	User user = new User();
	user.setUsername(username);
	user.setPassword(password);
	/* if(userManager.add(user)) {
		response.sendRedirect("registerSuccess.jsp");
		return;
	} else {
		response.sendRedirect("registerError.jsp");
		return;
	} */
	/* if(UserManager.exists(user)) {
		response.sendRedirect("registerError.jsp");
		return;
	} else {
		response.sendRedirect("registerSuccess.jsp");
		return;
	} */
}
response.sendRedirect("registerError.jsp");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>registerDeal</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    This is my JSP page. <br>
  </body>
</html>
