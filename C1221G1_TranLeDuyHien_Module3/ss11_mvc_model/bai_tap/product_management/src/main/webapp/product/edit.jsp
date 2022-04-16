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
  <title>Edit Product</title>
</head>
<body>
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
        <td><input type="text" name="name" id="name" value="${requestScope["product"].getName()}"></td>
      </tr>
      <tr>
        <td>Price: </td>
        <td><input type="text" name="price" id="price" value="${requestScope["product"].getPrice()}"></td>
      </tr>
      <tr>
        <td>Description Product: </td>
        <td><input type="text" name="descriptionProduct" id="descriptionProduct" value="${requestScope["product"].getDescriptionProduct()}"></td>
      </tr>
      <tr>
        <td>Manufacture: </td>
        <td><input type="text" name="manufacture" id="manufacture" value="${requestScope["product"].getManufacture()}"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Update Product"></td>
      </tr>
    </table>
  </fieldset>
</form>
</body>
</html>
