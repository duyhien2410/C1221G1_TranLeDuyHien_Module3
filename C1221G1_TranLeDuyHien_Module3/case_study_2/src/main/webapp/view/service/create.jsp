<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/4/2022
  Time: 11:27 AM
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
<h2><a href="/services?action=services">List All Service</a></h2>
<h2><a href="/index.jsp">Home</a></h2>

<form method="post" action="/services?action=create">
    <fieldset>
        <legend><h3>Add New Service</h3></legend>
        <table>
            <%--            <tr>--%>
            <%--                <th>Customer type id:</th>--%>
            <%--                <td>--%>
            <%--                    <select name="customerTypeId">--%>
            <%--                        <c:forEach var="customerTypeId" items="${customerTypeList}">--%>
            <%--                            <option value="${customerTypeId.customerTypeId}">${customerTypeId.customerTypeName}</option>--%>
            <%--                        </c:forEach>--%>
            <%--                    </select>--%>
            <%--                </td>--%>
            <%--            </tr>--%>
            <tr>
                <th>Name:</th>
                <td><input type="text" name="serviceName" id="serviceName" size="50"></td>
            </tr>
            <tr>
                <th>Area:</th>
                <td><input type="text" name="area" id="area" size="50"></td>
            </tr>
            <tr>
                <th>Costs:</th>
                <td><input type="text" name="costs" id="costs" size="50"></td>
            </tr>
            <tr>
                <th>PeopleMax:</th>
                <td><input type="text" name="peopleMax" id="peopleMax" size="50"></td>
            </tr>
            <tr>
                <th>StandardRoom:</th>
                <td><input type="text" name="standardRoom" id="standardRoom" size="50"></td>
            </tr>
            <tr>
                <th>ConvenientOther:</th>
                <td><input type="text" name="convenientOther" id="convenientOther" size="50"></td>
            </tr>
            <tr>
                <th>AreaPool:</th>
                <td><input type="text" name="areaPool" id="areaPool" size="50"></td>
            </tr>
            <tr>
                <th>NumberFloor:</th>
                <td><input type="text" name="numberFloor" id="numberFloor" size="50"></td>
            </tr>
            <tr>
                <th>TypeRentId:</th>
                <td>
                    <select name="typeRentId" id="typeRentId">
                        <option value="1">year</option>
                        <option value="2">month</option>
                        <option value="3">day</option>
                        <option value="4">hour</option>
                    </select>
                </td>
<%--                <td><input type="text" name="typeRentId" id="typeRentId" size="50"></td>--%>
            </tr>
            <tr>
                <th>TypeServiceId:</th>
<%--                <td><input type="text" name="typeServiceId" id="typeServiceId" size="50"></td>--%>
                <td>
                    <select name="typeServiceId" id="typeServiceId">
                        <option value="1">Villa</option>
                        <option value="2">House</option>
                        <option value="3">Room</option>
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