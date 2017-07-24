<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Szymon
  Date: 24.07.2017
  Time: 07:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Patient Visits</title>
    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/tableStyle.css"/>

</head>
<body>

<div class="table-users">
<div class="header">Patient's Visits</div>
    <table>
        <th>Visit ID</th>
        <th>Date</th>
        <th>Comment</th>
<c:forEach var="visit" items="${visitsList}">



        <tr>
            <td>${visit.id}</td>
            <td>${visit.date}</td>
            <td>${visit.comment}</td>
        </tr>


</c:forEach>
</table>
</div>

<h2>
    <a href="${pageContext.request.contextPath}/patient/list">Back to Patients List</a>
</h2>

</body>
</html>
