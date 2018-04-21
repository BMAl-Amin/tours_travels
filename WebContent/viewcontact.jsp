<%@page import="com.bdtravels.models.ContactModel"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="link.jsp" %>
<title>Admin access</title>
<link rel="icon" href="images/admin.png" />
</head>
<body>
	<div class="container-fluid">
		<%@ include file="subheader.jsp" %>
		<hr>
		<div class="row text-center">
			<div class="col-sm-2"></div>
			<div class="col-sm-8">
				<table class="admintable">
					<tr>
						<th>Sl</th>
						<th>Client Name</th>
						<th>Phone Number</th>
						<th>Email Address</th>
						<th>Country</th>
						<th>Travel Time</th>
						<th>Submission Date</th>
					</tr>
					<%
					  int sl=0;
					  Object contactInfo=request.getAttribute("clientinfo");
					  ContactModel model=(ContactModel)contactInfo;
					  for(ContactModel eachClient:model.getContactInfo()){
						  ++sl;
					  %>
					  <tr>
					    <td><%out.print(sl); %></td>
					    <td><%out.print(eachClient.getFullName()); %></td>
						<td><%out.print(eachClient.getPhoneNumber()); %></td>
						<td><%out.print(eachClient.getEmail()); %></td>
						<td><%out.print(eachClient.getCountry()); %></td>
						<td><%out.print(eachClient.getTravelTime()); %></td>
						<td><%out.print(eachClient.getDate()); %></td>
						
					</tr>
					  <%} %>
				</table>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>