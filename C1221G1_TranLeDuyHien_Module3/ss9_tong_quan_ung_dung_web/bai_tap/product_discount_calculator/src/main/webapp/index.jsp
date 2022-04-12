<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12/4/2022
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
  <title>Product Discount Calculator</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/ProductServlet" method="post">
  <input type="text" name="product" placeholder="Enter product: "/><span>Product Description</span>
  <input type="text" name="price" placeholder="Enter price: "/><span>List Price</span>
  <input type="text" name="discountPercent" placeholder="Enter discount percent: "/><span>Discount Percent</span>
  <input type = "submit" id = "submit" value = "Calculate Discount"/>
</form>
</body>
</html>
