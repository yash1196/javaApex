<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@include file="/header.html"%>
<html>
<head>
<title>Update Contact</title>
</head>

<body bgcolor="#ffffee" leftmargin="10px" rightmargin="10px">

<center>
<h2>Update contact</h2>
</center>
<!--Body: add contact information-->
<center>
<form action="modify">
	
	<table  cellpadding="0" cellspacing="0" width="50%"">
 		<tr>
			<td><input type="text" name="ssn" maxlength="12" value="${user.ssn}" hidden="true" /></td>
		</tr>

		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">First Name</td>
			<td><input type="text" name="firstName" maxlength="12" value = "${user.firstName}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Last Name</td>
			<td><input type="text" name="lastName" maxlength="12" value="${user.lastName}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Middle Name</td>
			<td><input type="text" name="middleName" maxlength="12" value="${user.middleName}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Gender</td>
			<td><input type="text" name="gender" maxlength="12" value="${user.gender}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Address</td>
			<td><input type="text" name="address" maxlength="12" value="${user.address}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">City</td>
			<td><input type="text" name="city" maxlength="12" value="${user.city }" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">State</td>
			<td><input type="text" name="state" maxlength="12" value="${user.state}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Country</td>
			<td><input type="text" name="country" maxlength="12" value="${user.country}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Phone</td>
			<td><input type="text" name="phone" maxlength="12" value="${user.phone}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Bank Info</td>
			<td><input type="text" name="bank" maxlength="12" value="${user.bank}" /></td>
		</tr>
		<tr>
			<td bgcolor="#FAFAF9" style="padding-left: 10px;">Account Info</td>
			<td><input type="text" name="account" maxlength="12" value="${user.account}" /></td>
		</tr>

		<tr>
			<td colspan="2" align="right">
			<br>
			<table  width="50%">
				<tr>
					<td><input type="submit" name="update" value="Update"/></td>
					<td width="201"><input type="reset" name="clear" value="Clear" />&nbsp;</td>
				</tr>
			</table>
			</td>
		</tr>
	</table>
</form>
</center>
</body>

	

</html>


</body>
