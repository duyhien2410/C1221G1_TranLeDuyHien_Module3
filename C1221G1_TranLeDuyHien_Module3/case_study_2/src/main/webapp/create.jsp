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

</head>
<body>
<form method="post">
<fieldset>
    <legend><h3>Add New Customer</h3></legend>
    <table>
        <tr>
            <th>Customer type id:</th>
            <td><input type="text" name="customerTypeId" id="customerTypeId" size="50"></td>
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
            <td><input type="text" name="customerIdCard" id="customerIdCard" size="50"></td>
        </tr>
        <tr>
            <th>Phone:</th>
            <td><input type="text" name="customerPhone" id="customerPhone" size="50"></td>
        </tr>
        <tr>
            <th>Email:</th>
            <td><input type="text" name="customerEmail" id="customerEmail" size="50"></td>
        </tr>
        <tr>
            <th>Address:</th>
            <td><input type="text" name="customerAddress" id="customerAddress" size="50"></td>
        </tr>
    </table>
</fieldset>
</form>


</body>
</html>
