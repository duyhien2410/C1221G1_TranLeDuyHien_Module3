<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/4/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<h1>Product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].getName()}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].getPrice()}</td>
    </tr>
    <tr>
        <td>Description Product: </td>
        <td>${requestScope["product"].getDescriptionProduct()}</td>
    </tr>
    <tr>
        <td>Manufacture: </td>
        <td>${requestScope["product"].getManufacture()}</td>
    </tr>
</table>
</body>
</html>
