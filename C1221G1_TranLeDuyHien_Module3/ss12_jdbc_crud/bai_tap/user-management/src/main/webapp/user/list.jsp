<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 17/4/2022
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>User Management Application</title>
    <link rel="stylesheet" href="/bootstrap-4.0.0-dist/css/bootstrap.css">
</head>
<body>
<center>
    <h1>User Management</h1>
    <form action="/users?action=search" method="post">
        <input type="text" name="search" placeholder="search">
        <input type="submit" value="search">
    </form>
    <h2>
        <a href="/users?action=create">Add New User</a>
    </h2>
</center>
<div align="center">
    <table class="table table-striped m-4">
        <caption><h2>List of Users</h2></caption>
        <tr class="row">
            <th class="col-1">ID</th>
            <th class="col-3">Name</th>
            <th class="col-3">Email</th>
            <th class="col-3">Country</th>
            <th class="col-2">Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr class="row">
                <td class="col-1"><c:out value="${user.id}"/></td>
                <td class="col-3"><c:out value="${user.name}"/></td>
                <td class="col-3"><c:out value="${user.email}"/></td>
                <td class="col-3"><c:out value="${user.country}"/></td>
                <td class="col-2">
                    <a href="/users?action=edit&id=${user.id}">Edit</a>
                    <a href="/users?action=delete&id=${user.id}">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
    Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                ...
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">Save changes</button>
            </div>
        </div>
    </div>
</div>

<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
</body>
</html>
