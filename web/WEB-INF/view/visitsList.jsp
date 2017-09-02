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


<div class="table-users">
    <div class="header">Visits List</div>
    <table cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Date</th>
            <th>Patient Id</th>
            <th>Comment</th>
            <th>Action</th>

        </tr>

        <c:forEach var="visit" items="${visitList}">

            <c:url var="deleteLink" value="/visit/list/delete">
                <c:param name="visitId" value="${visit.id}"/>
            </c:url>

            <tr>
                <td>${visit.id}</td>
                <td>${visit.date}</td>
                <td> ${visit.patientId}</td>
                <td>${visit.comment}</td>
                <td><a href="${deleteLink}"> Delete </a> </td>
            </tr>
        </c:forEach>


    </table>
</div>
<h2>
    <a href="${pageContext.request.contextPath}/patient/list">Back to Patients List</a>
</h2>
</body>
</html>
