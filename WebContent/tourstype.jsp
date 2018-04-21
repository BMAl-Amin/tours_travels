<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="link.jsp" %>
<title>Tour's Category</title>
</head>
<body>
	<div class="container-fluid">
		<%@ include file="subheader.jsp" %>
	</div>
	<div class="container-fluid">
		<div class="row content">
			<div class="col-sm-3 sidenav">
				<h4>Tour's Category</h4>
	      		<ul class="nav nav-pills nav-stacked">
	      			<li><a href="packtour.jsp">Package Tour</a></li>
					<li><a href="grouptour.jsp">Group Tour</a></li>
					<li><a href="familytour.jsp">Family Tour</a></li>
					<li><a href="haneytour.jsp">Haneymoon Tour</a></li>
					<li><a href="home.jsp"><i class="fas fa-arrow-left"></i>Back to Home</a></li>
				</ul>
			</div>
			<div class="col-sm-8">
			Tour's Category
			</div>
		</div>
	</div>
</body>
</html>