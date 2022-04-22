<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/4/2022
  Time: 3:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
    <link rel="stylesheet" href="/bootstrap-4.0.0-dist/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.11.4/css/jquery.dataTables.min.css">
</head>

<body>
<center>
    <h1>Employee Management</h1>
    <h2>
        <a href="/employees?action=create">Add New Employee</a>
    </h2>
    <h2>
        <a href="/index.jsp">Home</a>
    </h2>
    <form action="/employees?action=search" method="post">
        <input type="text" name="search" placeholder="search">
        <input type="submit" value="search">
    </form>
</center>

<div align="center" class="container">
    <div class="row">
        <div class="col-lg-12">
            <table id="tableStudent" class="table table-striped m-4" style="width:100%">
                <caption><h2>List of Employee</h2></caption>
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>BirthDay</th>
                    <th>IdCard</th>
                    <th>Wage</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>PositionId</th>
                    <th>LevelId</th>
                    <th>DepartmentId</th>
                    <th>Action</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="employee" items="${employeeList}">
                    <tr>
                        <td><c:out value="${employee.employeeId}"/></td>
                        <td><c:out value="${employee.name}"/></td>
                        <td><c:out value="${employee.birthDay}"/></td>
                        <td><c:out value="${employee.idCard}"/></td>
                        <td><c:out value="${employee.wage}"/></td>
                        <td><c:out value="${employee.phone}"/></td>
                        <td><c:out value="${employee.email}"/></td>
                        <td><c:out value="${employee.address}"/></td>
                            <%--                    <td><c:out value="${employee.positionId}"/></td>--%>
                        <td>
                            <c:forEach var="position" items="${positionList}">
                                <c:if test="${employee.positionId==position.positionId}">
                                    <c:out value="${position.positionName}"></c:out>
                                </c:if>
                            </c:forEach>
                        </td>
                        <td>
                            <c:forEach var="level" items="${levelList}">
                                <c:if test="${employee.levelId==level.levelId}">
                                    <c:out value="${level.levelName}"></c:out>
                                </c:if>
                            </c:forEach>
                        </td>
                        <td>
                            <c:forEach var="department" items="${departmentList}">
                                <c:if test="${employee.departmentId==department.departmentId}">
                                    <c:out value="${department.departmentName}"></c:out>
                                </c:if>
                            </c:forEach>
                        </td>
                        <td>
                            <button class="btn-warning">
                                <a href="/employees?action=update&employeeId=${employee.employeeId}">Edit</a>
                            </button>
                            <button onclick="deleteEmployee('${employee.employeeId}','${employee.name}')"
                                    type="button" class="btn btn-danger" data-toggle="modal"
                                    data-target="#deleteModal">Delete
                            </button>
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
                Are you sure delete <span class="text-danger" id="name-employee"></span> ?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                <button onclick="submitFormDelete()" type="button" class="btn btn-danger">Delete</button>
            </div>
        </div>
    </div>
</div>


<form hidden id="form-delete" method="post" action="/employees">
    <input type="text" name="action" value="delete">
    <input type="text" name="employeeId" id="id-employee">
</form>

<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.bundle.js">
<link rel="stylesheet" href="/bootstrap-4.0.0-dist/js/bootstrap.js">
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap4.min.js"></script>
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
            "pageLength": 3
        });
    });

</script>

<script>
    function deleteEmployee(employeeId, name) {
        document.getElementById("id-employee").value = employeeId;
        document.getElementById("name-employee").innerText = name;
    }

    function submitFormDelete() {
        document.getElementById("form-delete").submit();
    }
</script>
</body>
</html>
