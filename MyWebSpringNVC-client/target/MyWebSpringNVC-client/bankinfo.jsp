
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>







<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Personal Info Page</title>
</head>
<body>
<center><h1>Personal Info Page</h1></center>

<form:form method="post" modelAttribute="bank"  action="/MyWebSpringNVC/addBank.do">
      <table>
          <tr>
              <td>Bank Information: </td>
              <td><form:input path="bank" /></td> 
          </tr>
          <tr>
              <td>Account Information: </td>
              <td><form:input path="account" /></td>
          </tr>
          
          <tr>
              <td>Social Security Number :</td>
              <td><form:input path="ssn" /></td>
          </tr>
          <tr>
              <td colspan="2">
                  <input type="submit" value="Save Changes" />
              </td>
          </tr>
      </table>

</form:form>
</body>
</html>

















































<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bankInfo" >

	<table>
		<tr>
			<td><label for="BN">Bank Name: </label></td>
			<td><input id="BN" type="text" name="bank" required></td>
		</tr>
		<tr>
			<td><label for="Acconut">Account:</label></td>
			<td><input id="Accout" type="text" name="account" required></td>
		</tr>
		<tr>
			<td><label for="SSN">SSN</label></td>
			<td><input id="SSN" type="text" name="ssn" required></td>
		</tr>
		<tr>
			<td><input type="Submit"></td>
		</tr>
	</table>
</form>

</body>
</html> --%>