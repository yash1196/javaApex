<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/header.html"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css"
	href="/MyProject/css/Registation.css">
<style type="text/css">
h1 {style = solid 2px red;
	
}

body {
	background: rgb(235, 127, 186);
	text-align: center;
}

#first {
	background: rgb(222, 193, 209);
	border: 2px solid black;
}

.second {
	background: rgb(208, 200, 230);
	border: 1px dashed black;
}
</style>


<title>Review Data</title>
</head>

<body>


	<h1>Final Page</h1>


	<div>=====================================</div>
	<br>


	<div id=first>

		<p class=second>
		<h3>Personal Information</h3>

		First Name: ${user.firstName}<br> Middle Name: ${user.middleName}<br>
		Last Name: ${user.lastName}<br> Gender: ${user.gender}<br>

		</p>

		<p class=second>
		<h3>Contact Information</h3>


		Address: ${user.address}<br> City: ${user.city}<br> State:
		${user.state}<br> Country: ${user.country}<br> Phone:
		${user.phone}<br>

		</p>

		<p class=second>
		<h3>Bank Information</h3>
		Bank Info: ${user.bank}<br> Account Info: ${user.account}<br>
		SSN Info: ${user.ssn}<br>
		</p>
	</div>
</body>
</html>