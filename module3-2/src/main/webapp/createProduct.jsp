
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div
        class="bg-image"
        style="
    background-image: url('https://static8.depositphotos.com/1010340/945/v/600/depositphotos_9458458-stock-illustration-chef-with-pizza.jpg');
    background-size: cover;

  "
>
    <form action="/crudServlet?action=create" method="post">
        <table>
            <h1>Create Product</h1>
            <tr>
                <td>Nhập IMG</td>
                <td><input name="img" placeholder="nhập IMG"></td>
            </tr>
            <tr>
                <td>Nhập name</td>
                <td><input name="name" placeholder="nhập name" ></td>
            </tr>
            <tr>
                <td>Nhập Số Lượng</td>
                <td><input name="amount" placeholder="Nhập Số Lượng"></td>
            </tr>
            <tr>
                <td>Nhập giá</td>
                <td><input name="price" placeholder="nhập price"></td>
            </tr>

            <button type="submit">Submit</button>
        </table>
    </form>

</body>
</html>
