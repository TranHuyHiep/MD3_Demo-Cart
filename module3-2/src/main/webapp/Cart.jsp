<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 11/11/2022
  Time: 12:11 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<c:forEach items = "${carts}" var="cart">
  <div>${cart.id_product}</div>
  <div>${cart.amount}</div>
  <div>${cart.totalPrice}</div>
</c:forEach>
<a href="/CartServlet">Thanh toan</a>

</body>
</html>
