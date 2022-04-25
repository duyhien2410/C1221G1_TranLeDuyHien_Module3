<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/4/2022
  Time: 3:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/bootstrap-4.0.0-dist/css/bootstrap.css">
</head>
<body>
<h2><a href="/employees?action=employees">List All Service</a></h2>
<h2><a href="/index.jsp">Home</a></h2>

<form method="post" action="/employees?action=create">
    <fieldset>
        <legend><h3>Add New Employee</h3></legend>
        <table>
            <tr>
                <th>Name employee:</th>
                <td><input type="text" name="name" id="name" size="50"></td>
            </tr>
            <tr>
                <th>Birth day:</th>
                <td><input type="date" name="birthDay" id="birthDay" size="50"></td>
            </tr>
            <tr>
                <th>Employee id card:</th>
                <td><input type="text" name="idCard" id="idCard" size="50"></td>
            </tr>
            <tr>
                <th>Wage:</th>
                <td><input type="text" name="wage" id="wage" size="50">${error.get("wage")}</td>
            </tr>
            <tr>
                <th>Number of phone:</th>
                <td><input type="text" name="phone" id="phone" size="50">${error.get("phone")}</td>
            </tr>
            <tr>
                <th>Email:</th>
                <td><input type="text" name="email" id="email" size="50"></td>
            </tr>
            <tr>
                <th>Address:</th>
                <td><input type="text" name="address" id="address" size="50"></td>
            </tr>
            <tr>
                <th>Position:</th>
<%--                <td><input type="text" name="positionId" id="positionId" size="50"></td>--%>
                <td>
                    <select name="positionId">
                        <c:forEach var="position" items="${positionList}">
                            <option value="${position.positionId}">${position.positionName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Level:</th>
                <td>
                    <select name="levelId">
                        <c:forEach var="level" items="${levelList}">
                            <option value="${level.levelId}">${level.levelName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <th>Department:</th>
<%--                <td><input type="text" name="departmentId" id="departmentId" size="50"></td>--%>
                <td>
                    <select name="departmentId">
                        <c:forEach var="department" items="${departmentList}">
                            <option value="${department.departmentId}">${department.departmentName}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>

        </table>
    </fieldset>
    <input type="submit" value="Save"/>
</form>

<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
</body>
</html>
