<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/4/2022
  Time: 9:15 PM
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
<h2><a href="/customers?action=customers">List All Customers</a></h2>
<h2><a href="/index.jsp">Home</a></h2>

<form method="post" action="/customers?action=create">
<fieldset>
    <legend><h3>Add New Customer</h3></legend>
    <table>
        <tr>
            <th>Customer type id:</th>
            <td>
                <select name="customerTypeId">
                    <c:forEach var="customerTypeId" items="${customerTypeList}">
                        <option value="${customerTypeId.customerTypeId}">${customerTypeId.customerTypeName}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <th>Name:</th>
            <td><input type="text" name="customerName" id="customerName" size="50"></td>
        </tr>
        <tr>
            <th>Birth day:</th>
            <td><input type="text" name="customerBirthday" id="customerBirthday" size="50"></td>
        </tr>
        <tr>
            <th>Gender:</th>
            <td><input type="text" name="customerGender" id="customerGender" size="50"></td>
        </tr>
        <tr>
            <th>Id card:</th>
            <td><input type="text" name="customerIdCard" id="customerIdCard" size="50">${error.get("cmnd")}</td>
        </tr>
        <tr>
            <th>Phone:</th>
            <td><input type="text" name="customerPhone" id="customerPhone" size="50">${error.get("phone")}</td>
        </tr>
        <tr>
            <th>Email:</th>
            <td><input type="text" name="customerEmail" id="customerEmail" size="50">${error.get("email")}</td>
        </tr>
        <tr>
            <th>Address:</th>
            <td><input type="text" name="customerAddress" id="customerAddress" size="50"></td>
        </tr>
    </table>
</fieldset>
    <input type="submit" value="Save"/>
</form>

<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
</body>
</html>
