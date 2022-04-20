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
</head>

<body>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="/customers?action=create">Add New Customer</a>
    </h2>
</center>

<div align="center" class="container">
    <div class="row">
        <div class="col-lg-12">
            <table id="tableStudent" class="table table-striped m-4" style="width:100%">
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
                        <td><c:out value="${customer.customerTypeId}"/></td>
                        <td><c:out value="${customer.customerName}"/></td>
                        <td><c:out value="${customer.customerBirthday}"/></td>
                        <td><c:out value="${customer.customerGender}"/></td>
                        <td><c:out value="${customer.customerIdCard}"/></td>
                        <td><c:out value="${customer.customerPhone}"/></td>
                        <td><c:out value="${customer.customerEmail}"/></td>
                        <td><c:out value="${customer.customerAddress}"/></td>
                        <td>
                            <a href="/customers?action=update&customerId=${customer.customerId}">
                                <button class="btn-primary">Edit</button>
                            </a>
                                <%--                            <a href="/customers?action=delete&customerId=${customer.customerId}">--%>
                            <button onclick="deleteCustomer(${customer.customerId},'${customer.customerName}')"
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
<form action="/customers?action=delete" method="post">
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
</form>



<form hidden id="form-delete" action="/customers?action=delete">
    <input type="text" name="action" value="delete">
    <input type="text" name="customerId" id="id-customer">
</form>

<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });

    function deleteCustomer(id, name) {
        document.getElementById("id-customer").value = id;
        document.getElementById("name-customer").innerText = name;
    }

    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>
</body>
</html>
