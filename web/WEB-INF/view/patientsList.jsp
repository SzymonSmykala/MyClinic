<%--
  Created by IntelliJ IDEA.
  User: Szymon
  Date: 23.07.2017
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>PatientsList</title>

    <link type="text/css"
          rel="stylesheet"
            href="${pageContext.request.contextPath}/resources/css/tableStyle.css"/>

</head>
<body>

<h2>
    <a href="addPatient">Add patient</a><br>
    <a href="${pageContext.request.contextPath}/visit/list">Visits</a>

</h2>

<div class="table-users">
    <div class="header">Patients List</div>
<table cellspacing="0">
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Action</th>
    </tr>

    <c:forEach var="patient" items="${patientsList}">

        <!-- Construct link for new visit with patientId -->
        <c:url var="newVisit" value="/visit/newVisit">
            <c:param name="patientId" value="${patient.id}"/>
        </c:url>


        <tr>
            <td>${patient.id}</td>
            <td>${patient.firstName}</td>
            <td>${patient.lastName}</td>
            <td>${patient.email}</td>
            <td>${patient.phoneNumber}</td>
           <td> <a href="${newVisit}">New Visit</a></td>
        </tr>
    </c:forEach>


</table>
</div>

</body>
</html>
