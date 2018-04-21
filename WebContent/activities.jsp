<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="link.jsp" %>
<title>Activities</title>
</head>
<body>
	<div class="container-fluid">
		<%@ include file="subheader.jsp" %>
	</div>
	<hr>
	<div class="container-fluid">
	<div class="row content">
		<div class="col-sm-3 text-left sidenav">
			<h4>Activities</h4>
      		<ul class="nav nav-pills nav-stacked">
				<li><a href="regpack.jsp">Regular Package</a></li>
				<li><a href="specialpack.jsp">Special Package</a></li>
				<li><a href="topsell.jsp">Top Selling</a></li>
				<li><a href="discountoff.jsp">Discount Offer</a></li>
				<li><a href="home.jsp"><i class="fas fa-arrow-left"></i>Back to Home</a></li>
			</ul>
		</div>
		<div class="col-sm-8">
			Activities
		</div>
	</div>
	</div>
</body>
</html>