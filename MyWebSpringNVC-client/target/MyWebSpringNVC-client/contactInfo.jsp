
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

<form:form method="post" modelAttribute="contact"  action="/MyWebSpringNVC/addContact.do">
      <table>
          <tr>
              <td>Address: </td>
              <td><form:input path="address" /></td> 
          </tr>
          <tr>
              <td>City: </td>
              <td><form:input path="city" /></td>
          </tr>
          
          <tr>
              <td>State :</td>
              <td><form:input path="state" /></td>
          </tr>
          <tr>
              <td>Country :</td>
              <td><form:input path="country" /></td>
          </tr>
          <tr>
              <td>Phone :</td>
              <td><form:input path="phone" /></td>
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
<title>Contact Information</title>
</head>
<body>
<form action="contactInfo">

<table>
  <tr>
    <td><label for="Address">Address:</label></td>
    <td><input id="Address" type="text" name="address" required><br></td>
  </tr>

  <tr>
    <td><label for="City">City:</label></td>
    <td><input id="City" type="text" name="city" required><br></td>
  </tr>

  <tr>
    <td><label for="State">State:</label></td>
    <td><input id="State" type="text" name="state" required></td>
  </tr>

  <tr>
    <td><label for="Country">Country:</label></td>
    <td><input id="Country" type="text" name="country" required></td>
  </tr>

  <tr>
    <td><label for="Phone">Phone:</label></td>
    <td><input id="Phone" type="text" name="phone" required></td>
  </tr>

  <tr>
    <td><input type="Submit"></td>
  </tr>
</table>  
</form>

</body>
</html> --%>