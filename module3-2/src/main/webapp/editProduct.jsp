<%--
  Created by IntelliJ IDEA.
  User: VuHongLinh
  Date: 05/11/2022
  Time: 6:16 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form action="/crudServlet?action=edit" method="post">
        <table>
            <h1>Edit Product</h1>
            <tr>
                <td>Nhập id</td>
                <td><input name="id" value="${p.id}" readonly ></td>
            </tr>
            <tr>
                <td>Nhập img</td>
                <td><input name="img" value="${p.img}"></td>
            </tr>
            <tr>
                <td>Nhập name</td>
                <td><input name="name" value="${p.name}"></td>
            </tr>
            <tr>
                <td>Nhập Số Lượng</td>
                <td><input name="amount" value="${p.amount}"></td>
            </tr>
            <tr>
                <td>Nhập giá</td>
                <td><input name="price" value="${p.price}"></td>
            </tr>
            <button type="submit">Submit</button>
        </table>
    </form>

</head>
<body>
<div
        class="bg-image"
        style="
        background-image:url('https://img.freepik.com/premium-photo/handsome-bearded-cheef-cook-preparing-spaghetti-kitchen_38145-484.jpg?w=2000');
     background-size: cover;

 "
>
</body>
</html>
