<%--
  Created by IntelliJ IDEA.
  User: VuHongLinh
  Date: 03/11/2022
  Time: 9:36 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body {
            background: url('https://static-communitytable.parade.com/wp-content/uploads/2014/03/rethink-target-heart-rate-number-ftr.jpg') fixed;
            background-size: cover;
        }

        *[role="form"] {
            max-width: 530px;
            padding: 15px;
            margin: 0 auto;
            border-radius: 0.3em;
            background-color: #f2f2f2;
        }

        *[role="form"] h2 {
            font-family: 'Open Sans' , sans-serif;
            font-size: 40px;
            font-weight: 600;
            color: #000000;
            margin-top: 5%;
            text-align: center;
            text-transform: uppercase;
            letter-spacing: 4px;
        }
    </style>
</head>
<body>
<div
        class="bg-image"
        style="
    background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTcEMlEtwLW6vKnLj7QfpKmGHCxcbfc6L8KVQ&usqp=CAU');
    height: 100vh;
  "
>

    <div class="container">
        <form class="form-horizontal" role="form" action="/register" method="post">
            <h2>Registration</h2>
            <h3 style="color: red">${mess1}</h3>
            <div class="form-group">
                <label for="UserName" class="col-sm-3 control-label" >User Name</label>
                <div class="col-sm-9">
                    <input type="email" id="UserName" placeholder="User Name" class="form-control" autofocus name="username">
                    <h6 style="color: red">${messusername}</h6>

                </div>
            </div>
            <div class="form-group">
                <label for="PassWord" class="col-sm-3 control-label">Password</label>
                <div class="col-sm-9">
                    <input type="text" id="PassWord" placeholder="Pass Word" class="form-control" autofocus name="password">
                </div>
                <h6 style="color: red">${messpass}</h6>
            </div>
            <div class="form-group">
                <label for="ConfirmPass" class="col-sm-3 control-label">Confirm Password</label>
                <h6 style="color: red">${messconfirm}</h6>
                <div class="col-sm-9">
                    <input type="text" id="ConfirmPass" placeholder="Confirm Password" class="form-control" name= "confirmpass">
                </div>
            </div>
            <div class="form-group">
                <label for="PhoneNumber" class="col-sm-3 control-label">Phone Number</label>
                <div class="col-sm-9">
                    <input id="PhoneNumber" placeholder="Phone Number" class="form-control" name="phonenumber">
                </div>
                <h6 style="color: red">${messphonenumber}</h6>
            </div>
            <div class="form-group">
                <label for="birthDate" class="col-sm-3 control-label">Email/label>
                <div class="col-sm-9">
                    <input type="email" id="" class="form-control" name="email">
                </div>
                    <h6 style="color: red">${messemail}</h6>
            </div>
            <div class="form-group">
                <label for="birthDate" class="col-sm-3 control-label">Date of Birth</label>
                <div class="col-sm-9">
                    <input type="date" id="birthDate" class="form-control" name="birthday">
                </div>
            </div>
<%--            <div class="form-group">--%>
<%--                <label for="Address" class="col-sm-3 control-label">Address </label>--%>
<%--                <div class="col-sm-9">--%>
<%--                    <input type="phoneNumber" id="Address" placeholder="Address" class="form-control" name="address">--%>
<%--                    <span class="help-block"> </span>--%>
<%--                    <h6 style="color: red">${messaddress}</h6>--%>
<%--                </div>--%>
<%--            </div>--%>
            <button type="submit" class="btn btn-primary btn-block">Register</button>
        </form> <!-- /form -->
    </div> <!-- ./container -->
</body>
</html>
