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
				<form action="AddPackageServlet" method="POST" enctype="multipart/form-data">
					<label>
						Tour Name:
						<input name="tour_name" placeholder="Tour Name" />
					</label><br>
					<label>
						Activities:
						<select name="activity">
							<option value="RP">Regular Package</option>
							<option value="SP">Special Package</option>
							<option value="TS">Top Selling</option>
							<option value="DO">Discount Offer</option>
						</select>
					</label><br>
					<label>
						Tour Category:
						<select name="category">
							<option value="PT">Package Tour</option>
							<option value="GT">Group Tour</option>
							<option value="FT">Family Tour</option>
							<option value="HT">Honeymoon Tour</option>
						</select>
					</label><br>
					<label>
						Tour Detail:
						<textarea name="tour_detail" rows="15" cols="50" placeholder="Tour Detail"></textarea>
					</label><br>
					<label>
						<input type="file" name="pimage" />
					</label>
					<input type="submit" value="Save" />
				</form>
			</div>
			<div class="col-sm-2"></div>
		</div>
	</div>
</body>
</html>