<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/4/2022
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="/bootstrap-4.0.0-dist/css/bootstrap.css">
    <link rel="stylesheet" href="/style-css.css">
</head>
<body>
<header>
    <div class="row p-2">
        <div class="col-10">
            <img src="https://marketingbox.vn/wp-content/uploads/2021/05/Screenshot_242.png" class="img-thumbnail"
                 style="width: 100px">
        </div>
        <div class="pt-2 col-2">
            <h5>Trần Lê Duy Hiển</h5>
        </div>
    </div>
</header>
<nav>
    <div class="row" id="nav-link">
        <div class="col-8" id="nav-link-1">
            <a href="#">Home</a>
            <a href="#">Employee</a>
            <a href="/customers">Customer</a>
            <a href="#">Service</a>
            <a href="#">Contract</a>
        </div>
        <div class="col-4" id="nav-link-2">
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="row h-75">
    <div class="col-3" id="center-1">
        <ul>
            <li><a href="#">Item One</a></li>
            <li><a href="#">Item Two</a></li>
            <li><a href="#">Item Three</a></li>
        </ul>
    </div>
    <div class="col-9" id="center-2">
        <p>Body...</p>
    </div>
</div>


<footer>
    <div>
        <p>Footer</p>
    </div>
</footer>




<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
</body>
</html>
