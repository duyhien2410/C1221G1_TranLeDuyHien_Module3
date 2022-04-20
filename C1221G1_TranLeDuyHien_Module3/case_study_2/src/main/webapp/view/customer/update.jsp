<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 20/4/2022
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Customer Management Application</title>
</head>
<body>
<center>
    <h1>Customer Management</h1>
    <h2>
        <a href="customers?action=customers">List All Customers</a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit User
                </h2>
            </caption>
            <c:if test="${customer != null}">
                <input type="hidden" name="customerId" value="<c:out value='${customer.customerId}' />"/>
            </c:if>
            <tr>
                <th>CustomerType:</th>
                <td>
                    <input type="text" name="customerTypeId" size="45"
                           value="<c:out value='${customer.customerTypeId}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Name:</th>
                <td>
                    <input type="text" name="customerName" size="45"
                           value="<c:out value='${customer.customerName}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>BirthDay:</th>
                <td>
                    <input type="text" name="customerBirthday" size="45"
                           value="<c:out value='${customer.customerBirthday}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Gender:</th>
                <td>
                    <input type="text" name="customerGender" size="45"
                           value="<c:out value='${customer.customerGender}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>IdCard:</th>
                <td>
                    <input type="text" name="customerIdCard" size="45"
                           value="<c:out value='${customer.customerIdCard}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Phone:</th>
                <td>
                    <input type="text" name="customerPhone" size="45"
                           value="<c:out value='${customer.customerPhone}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Email:</th>
                <td>
                    <input type="text" name="customerEmail" size="45"
                           value="<c:out value='${customer.customerEmail}' />"
                    />
                </td>
            </tr>
            <tr>
                <th>Address:</th>
                <td>
                    <input type="text" name="customerAddress" size="45"
                           value="<c:out value='${customer.customerAddress}' />"
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
