<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="link.jsp" %>
<title>Admin Access</title>
<link rel="icon" href="images/admin.png" />
</head>
<body>
	<div class="container-fluid">
		<%@ include file="subheader.jsp" %>
		<hr>
		<a href="home.jsp">As User</a>
		<div class="text-center adminblock">
			<a href="addpackage.jsp">Add Package</a>
			<a href="PackageListServlet">Delete Package</a>
			<a href="PackageListServlet">Edit Package</a>
			<a href="ViewContactServlet">View Contact</a>
		</div>
	</div>
</body>
</html>