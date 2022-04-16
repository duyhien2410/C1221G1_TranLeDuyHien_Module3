<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/4/2022
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Create New Product</title>
  <style>
    .message{
      color: pink;
    }
  </style>
</head>
<body>
<h1>Create New Product</h1>
<p>
  <c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
  </c:if>
</p>
<p>
  <a href="/products">Back to product list</a>
</p>
<form method="post">
  <fieldset>
    <legend>Product information</legend>
    <table>
      <tr>
        <td>Name: </td>
        <td><input type="text" name="name" id="name"></td>
      </tr>
      <tr>
        <td>Price: </td>
        <td><input type="text" name="price" id="price"></td>
      </tr>
      <tr>
        <td>Description Product: </td>
        <td><input type="text" name="descriptionProduct" id="descriptionProduct"></td>
      </tr>
      <tr>
        <td>Manufacture: </td>
        <td><input type="text" name="manufacture" id="manufacture"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Create product"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
