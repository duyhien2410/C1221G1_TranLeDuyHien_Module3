<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/4/2022
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Deleting Product</title>
</head>
<body>
<h1>Delete customer</h1>
<p>
  <a href="/products">Back to product list</a>
</p>
<form method="post">
  <h3>Are you sure?</h3>
  <fieldset>
    <legend>Product information</legend>
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
        <td>Description id: </td>
        <td>${requestScope["product"].getDescriptionProduct()}</td>
      </tr>
      <tr>
        <td>Manufacture: </td>
        <td>${requestScope["product"].getManufacture()}</td>
      </tr>
      <tr>
        <td><input type="submit" value="Delete Product"></td>
        <td><a href="/products">Back to product list</a></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
