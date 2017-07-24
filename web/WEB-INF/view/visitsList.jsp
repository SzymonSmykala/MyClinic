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

        </tr>

        <c:forEach var="visit" items="${visitList}">

            <tr>
                <td>${visit.id}</td>
                <td>${visit.date}</td>
                <td> ${visit.patientId}</td>
                <td>${visit.comment}</td>
            </tr>
        </c:forEach>


    </table>
</div>

</body>
</html>
