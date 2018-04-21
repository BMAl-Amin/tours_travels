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
		<br>
		<div class="text-center">
			<form action="UploadImageServlet" method="POST" enctype="multipart/form-data">
				<input type="file" name="pimage" /><br>
				<input type="submit" value="Upload" />
			</form>
		</div>
	</div>
</html>