<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="link.jsp" %>
<title>Regular Package</title>
</head>
<body>
	<div class="container-fluid">
		<%@ include file="subheader.jsp"%>
		<hr>
		<div class="row">
			<div class="col-sm-2">
				<a id="suba" href="home.jsp"><i class="fas fa-arrow-left"></i>Back to Home</a>
			</div>
			<div class="col-sm-7 submenubg text-center">
				<h3>Regular Package</h3>
				<img alt="" width="100%" src="images/2.jpg"><br><br><hr>
				<p class="text-justify">See the best of the USA in one epic adventure! 
				Crossing the States from sea to shining sea truly 
				embodies the great American road trip.
				Experience the fast paced East, take a bite of the Big 
				Apple and be awestruck by the epic monuments of Washington 
				DC on our epic American road trip holidays. Make your way 
				through the slow moving South, stop off in New Orleans for 
				a party on Bourbon Street and leave your mark at Cadillac 
				Ranch in Texas. Saddle up for olden-day frontiers and cowboy 
				towns, then catch some rays on stunning beaches – from the 
				white sands of Destin in Florida, all the way up to chilled-out 
				California. Out West, be dazzled by the bright lights of the 
				Vegas Strip and walk San Francisco’s Golden Gate Bridge.
				The unspoilt beauty of America’s national parks also awaits, 
				from the towering red rocks of Monument Valley to the waterfall 
				hikes and lush forest of Yosemite. Gaze upon the Grand Canyon, 
				and get soaked by Niagara Falls – experiences you’ll remember 
				forever. Want a full-on taste of the States? Get coast to coast 
				on our guided tours of America!</p>
			</div>
			<div class="col-sm-3" id="contactformbg">
				<h4>Contact Information</h4>
				<form action="ContactServlet" method="POST" id="contactform">
					<label>Email<br>
						<input type="email" name="email" placeholder="i.e example@domain.com" />
					</label><br>
					<label>
					Title<br>
						<select name="title">
							<option value="blank" selected>Pick one</option>
							<option value="Mr">Mr</option>
							<option value="Mrs">Mrs</option>
							<option value="Miss">Miss</option>
							<option value="Mx">Mx</option>
							<option value="Ms">Ms</option>
							<option value="Dr">Dr</option>
							<option value="Dr(m">Dr(m</option>
							<option value="Dr(f">Dr(f</option>
						</select>
					</label>
					<label>
						Full Name<br>
						<input type="text" name="uname" placeholder="i.e Mahbubul Alam" />
					</label><br>
					<label>
					Country<br>
						<select name="country">
							<option value="blank" selected>Pick one</option>
							<option value="Bangladesh">Bangladesh</option>
							<option value="India">India</option>
							<option value="Pakistan">Pakistan</option>
							<option value="Sri lanka">SriLanka</option>
							<option value="Myanmar">Myanmar</option>
						</select>
					</label><br>
					<label>
						Cell Number<br>
						<input type="text" name="pnumber" placeholder="i.e +880 1711 234 324" />
					</label><br>
					<label>
						When are you looking to travel?
						<input type="text" name="traveltime" placeholder="i.e Summer, Winter, After two days etc">
					</label>
					<input type="submit" value="Submit" />
				</form><br>
				<hr>
				<h3>Data Protection Notice</h3>
				<p class="text-justify">All details provided by you will be held by us 
				and used in accordance with our Privacy Policy. We may from time to 
				time contact you with further information on the latest offers, 
				brochures, products or services which we believe may be of interest 
				to you, from Grand American Adventures or other Travelopia companies. 
				As you requested to receive information by e-communications, we may 
				contact you for the same purposes above using similar means. By clicking 
				'Submit' you confirm that you have read and understood our Privacy Policy
				 and consent to our use of your information
				 </p>
			</div>
		</div>
	</div>
</body>
</html>