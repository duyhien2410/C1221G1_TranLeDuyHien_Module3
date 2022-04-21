<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 21/4/2022
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Service Management Application</title>
    <link rel="stylesheet" href="/bootstrap-4.0.0-dist/css/bootstrap.css">
</head>

<body>
<center>
    <h1>Service Management</h1>
    <h2>
        <a href="/services?action=create">Add New Customer</a>
    </h2>
    <h2>
        <a href="/index.jsp">Home</a>
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
                    <th>Name</th>
                    <th>Area</th>
                    <th>Costs</th>
                    <th>PeopleMax</th>
                    <th>StandardRoom</th>
                    <th>ConvenientOther</th>
                    <th>AreaPool</th>
                    <th>NumberFloor</th>
                    <th>TypeRentId</th>
                    <th>TypeServiceId</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="service" items="${serviceList}">
                    <tr>
                        <td><c:out value="${service.serviceID}"/></td>
                        <td><c:out value="${service.serviceName}"/></td>
                        <td><c:out value="${service.area}"/></td>
                        <td><c:out value="${service.costs}"/></td>
                        <td><c:out value="${service.peopleMax}"/></td>
                        <td><c:out value="${service.standardRoom}"/></td>
                        <td><c:out value="${service.convenientOther}"/></td>
                        <td><c:out value="${service.areaPool}"/></td>
                        <td><c:out value="${service.numberFloor}"/></td>
                        <c:if test="${service.typeRentId==1}">
                            <td><c:out value="year"/></td>
                        </c:if>
                        <c:if test="${service.typeRentId==2}">
                            <td><c:out value="month"/></td>
                        </c:if>
                        <c:if test="${service.typeRentId==3}">
                            <td><c:out value="day"/></td>
                        </c:if>
                        <c:if test="${service.typeRentId==4}">
                            <td><c:out value="hour"/></td>
                        </c:if>
                        <c:if test="${service.typeServiceId==1}">
                            <td><c:out value="Villa"/></td>
                        </c:if>
                        <c:if test="${service.typeServiceId==2}">
                            <td><c:out value="House"/></td>
                        </c:if>
                        <c:if test="${service.typeServiceId==3}">
                            <td><c:out value="Room"/></td>
                        </c:if>
                    </tr>
                </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
</div>


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
            "pageLength": 4
        });
    });
</script>

</body>
</html>
