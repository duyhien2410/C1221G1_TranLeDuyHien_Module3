<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/4/2022
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee Management Application</title>
</head>
<body>
<center>
    <h1>Employee Management</h1>
    <h2>
        <a href="employees?action=employees">List All Employee</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit Employee
                </h2>
            </caption>
            <c:if test="${employee != null}">
                <input type="hidden" name="employeeId" value="<c:out value='${employee.employeeId}' />"/>
            </c:if>
            <tr>
                <th>Name:</th>
                <td>
                    <input type="text" name="name" size="45"
                           value="<c:out value='${employee.name}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>BirthDay:</th>
                <td>
                    <input type="text" name="birthDay" size="45"
                           value="<c:out value='${employee.birthDay}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>IdCard:</th>
                <td>
                    <input type="text" name="idCard" size="45"
                           value="<c:out value='${employee.idCard}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Wage:</th>
                <td>
                    <input type="text" name="wage" size="45"
                           value="<c:out value='${employee.wage}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="phone" size="45"
                           value="<c:out value='${employee.phone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="email" size="45"
                           value="<c:out value='${employee.email}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="address" size="45"
                           value="<c:out value='${employee.address}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>PositionId:</th>
                <td>
                    <input type="text" name="positionId" size="45"
                           value="<c:out value='${employee.positionId}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>LevelId:</th>
                <td>
                    <input type="text" name="levelId" size="45"
                           value="<c:out value='${employee.levelId}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>DepartmentId:</th>
                <td>
                    <input type="text" name="departmentId" size="45"
                           value="<c:out value='${employee.departmentId}' />"
                    />
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
