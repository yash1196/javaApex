<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Person Information</title>
</head>
<body>

	 <%-- <form action="personInfo">
		<table>
			<tr>
				<td><label for="FN">First Name:</label></td>
				<td><input id="FN" type="text" name="firstName" required><br></td>
			</tr>

			<tr>
				<td><label for="LN">Last Name:</label></td>
				<td><input id="LN" type="text" name="lastName" required></td>
			</tr>

			<tr>
				<td><label for="M">Middle Name:</label></td>
				<td><input id="M" type="text" name="middleName" required></td>
			</tr>
		</table>

		<input id="Male" type="radio" name="gender" value="Male" required>
		<label for="Male">Male</label> <input id="Female" type="radio"
			name="gender" value="Female" required> <label for="Female">Female</label>
		<input id="Other" type="radio" name="gender" value="Other" required>
		<label for="Other">Other</label><br> <input type="submit">

	</form> --%> 
 <form:form method="post" modelAttribute="user"  action="/MyWebSpringNVC-client/processAddUser.do">
      <table>
          <tr>
              <td>First Name:</td>
              <td><form:input path="firstName" /></td>
          </tr>
          <tr>
              <td>Last Name:</td>
              <td><form:input path="lastName" /></td>
          </tr>
          
          <tr>
              <td>Middle Name:</td>
              <td><form:input id="Male" path="middleName" /></td>
          </tr>
          <tr>
          		<td><form:radiobutton path="gender" value="Male"/> 
          			<label for="Male">Male</label>
          		</td>
          		<td>
          			<form:radiobutton id="Female" path="gender" value="Female"/> 
          			<label for="Female">Female</label>
          		</td>
          		<td>
          			<form:radiobutton id="Other" path="gender" value="Other"/> 
          			<label for="Other">Other</label><br> 
          		</td>  
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