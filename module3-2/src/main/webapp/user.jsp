<%--
  Created by IntelliJ IDEA.
  User: VuHongLinh
  Date: 04/11/2022
  Time: 11:45 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Bootstrap Example</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <div class="container mt-3">
        <h2></h2>
        <p></p>
        <table class="table">
            <tr>
                <a href="/LogOutServlet">Log Out</a><br>
            </tr>

            <thead>
            <tr>
                <form action="/CartServlet">
                    <button type="submit">Cart</button>
                </form>
            </tr>

            <tr>
                <th>IMG</th>
                <th>Name</th>
                <th>Amount</th>
                <th>price</th>
                <th>Buy</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items = "${product}" var="pd">
                <form action="/CartServlet" method="post">
                    <tr class="table-white">
                        <td><input name="productId" value="${pd.id}" readonly hidden></td>
                        <td><img src="${pd.img}" height="200" width="250"></td>
                        <td>${pd.name}</td>
                        <td>${pd.amount}</td>
                        <td>${pd.price}</td>
                        <td>
                            <input placeholder="amount" name="number" >
                            <button type="submit">Buy</button>
                        </td>
                            <%--                <td><a class="btn btn-danger" href=""><input type="text" placeholder="Number"></a></td>--%>
                            <%--                <td><a type="button" class="btn btn-danger" href="">Buy</a></td>--%>
                    </tr>
                </form>
            </c:forEach>

            </tbody>
        </table>
    </div>