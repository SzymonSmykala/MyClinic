<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Szymon
  Date: 23.07.2017
  Time: 17:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Patient</title>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/tableStyle.css"/>

</head>
<body>



<form:form action="savePatient" modelAttribute="patient" method="post">

    <div class="table-users">
        <div class="header">Add Patient</div>
    <table>

        <tr>
            <td><label>First Name: </label></td>
            <td><form:input path="firstName"/></td>
        </tr>

        <tr>
            <td><label>Last Name: </label></td>
            <td><form:input path="lastName"/></td>
        </tr>

        <tr>
            <td><label>Phone Number: </label></td>
            <td><form:input path="phoneNumber"/></td>
        </tr>

        <tr>
            <td><label>Email: </label></td>
            <td><form:input path="email"/></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>


    </table>
    </div>

</form:form>
<h2>
    <a href="${pageContext.request.contextPath}/patient/list">Back to Patients List</a>
</h2>
</body>
</html>
