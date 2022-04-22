<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/4/2022
  Time: 9:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
    <link rel="stylesheet" href="/bootstrap-4.0.0-dist/css/bootstrap.css">
    <link rel="stylesheet" href="datatables/css/dataTables.bootstrap4.min.css"/>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>

<body>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="/customers?action=create">Add New Customer</a>
    </h2>
    <h2>
        <a href="/index.jsp">Home</a>
    </h2>
    <form action="/customers?action=search" method="post">
        <input type="text" name="name" placeholder="search name">
        <input type="text" name="email" placeholder="search email">
<%--        <input type="text" name="customerType" placeholder="search customerType">--%>
        <select name="customerType">
            <c:forEach var="customerType" items="${customerTypeList}">
                <option value="${customerType.customerTypeId}">${customerType.customerTypeName}</option>
            </c:forEach>
        </select>
        <input type="submit" value="search">
    </form>
</center>

<div align="center" class="container">
    <div class="row">
        <div class="col-lg-12">
            <table class="table table-striped m-4" id="tableStudent" style="width:100%">
                <caption><h2>List of Customer</h2></caption>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>CustomerType</th>
                    <th>Name</th>
                    <th>Birth day</th>
                    <th>Gender</th>
                    <th>Id card</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="customer" items="${customerList}">
                    <tr>
                        <td><c:out value="${customer.customerId}"/></td>
                            <%--                        <td><c:out value="${customer.customerTypeId}"/></td>--%>
                        <td>
                            <c:forEach var="customerType" items="${customerTypeList}">
                                <c:if test="${customer.customerTypeId==customerType.customerTypeId}">
                                    <c:out value="${customerType.customerTypeName}"></c:out>
                                </c:if>
                            </c:forEach>
                        </td>
                        <td><c:out value="${customer.customerName}"/></td>
                        <td><c:out value="${customer.customerBirthday}"/></td>
                        <td><c:out value="${customer.customerGender}"/></td>
                        <td><c:out value="${customer.customerIdCard}"/></td>
                        <td><c:out value="${customer.customerPhone}"/></td>
                        <td><c:out value="${customer.customerEmail}"/></td>
                        <td><c:out value="${customer.customerAddress}"/></td>
                        <td>

                            <button class="btn-warning">
                                <a href="/customers?action=update&customerId=${customer.customerId}">Edit</a>
                            </button>

                                <%--                            <a href="/customers?action=delete&customerId=${customer.customerId}">--%>
                            <button onclick="deleteCustomer('${customer.customerId}','${customer.customerName}')"
                                    type="button" class="btn btn-danger" data-toggle="modal"
                                    data-target="#deleteModal">Delete
                            </button>
                                <%--                            </a>--%>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                Are you sure delete <span class="text-danger" id="name-customer"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden id="form-delete" method="post" action="/customers">
    <input type="text" name="action" value="delete">
    <input type="text" name="customerId" id="id-customer">
</form>

<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<%--<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>--%>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>

<script>
    function deleteCustomer(customerId, customerName) {
        document.getElementById("id-customer").value = customerId;
        document.getElementById("name-customer").innerText = customerName;
    }

    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>
</body>
</html>
