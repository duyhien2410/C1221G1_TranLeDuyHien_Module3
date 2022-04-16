<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 16/4/2022
  Time: 11:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Product List</title>
  <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
</head>
<body>
<h1>Products</h1>
<form>
  <input type="text" name="search" placeholder="Search By Name">
  <input type="text" name="action" hidden value="search">
  <button>Search</button>
</form>
<p>
  <a href="/products?action=create">Create New Product</a>
</p>
<table border="1"  id="example" class="table table-striped table-bordered" style="width:100%">

  <thead>
  <tr>
    <td>Name</td>
    <td>Price</td>
    <td>Description Product</td>
    <td>Manufacture</td>
    <td>Edit</td>
    <td>Delete</td>
  </tr>
  </thead>
  <tbody>
  <c:forEach items='${requestScope["products"]}' var="product">
    <tr>
      <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
      <td>${product.getPrice()}</td>
      <td>${product.getDescriptionProduct()}</td>
      <td>${product.getManufacture()}</td>
      <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
      <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.11.4/js/dataTables.bootstrap4.min.js"></script>
</body>
</html>
