<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Szymon
  Date: 23.07.2017
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link type="text/css"
          rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/tableStyle.css"/>

    <title>New Visit</title>
</head>
<body>


<form:form action="saveVisit" modelAttribute="visit" method="post">

    <div class="table-users">
        <div class="header">${firstName} ${lastName}</div>
        <table>
            <tr>
                <td>PatientId:</td>
                <td><form:input path="patientId" value="${patientId}"/></td>
            </tr>
            <tr>
                <td>Comment:</td>

                <td>
                    <form:textarea path="comment" rows="30" cols="90"/>

                </td>

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
