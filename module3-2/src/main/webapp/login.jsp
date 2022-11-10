
<!--author:starttemplate-->
<!--reference site : starttemplate.com-->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="keywords"
          content="unique login form,leamug login form,boostrap login form,responsive login form,free css html login form,download login form">
    <meta name="author" content="leamug">
    <title>Unique Login Form | Bootstrap Templates</title>
    <style>
        /*reference site : starttemplate.com*/
        body {
            background-image:url('https://i.redd.it/o8dlfk93azs31.jpg');
            background-position:center;
            background-size:cover;

            -webkit-font-smoothing: antialiased;
            font: normal 14px Roboto,arial,sans-serif;
            font-family: 'Dancing Script', cursive!important;
        }

        .container {
            padding: 110px;
        }
        ::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
            color: #ffffff!important;
            opacity: 1; /* Firefox */
            font-size:18px!important;
        }
        .form-login {
            background-color: rgba(0,0,0,0.55);
            padding-top: 10px;
            padding-bottom: 20px;
            padding-left: 20px;
            padding-right: 20px;
            border-radius: 15px;
            border-color:#d2d2d2;
            border-width: 5px;
            color:white;
            box-shadow:0 1px 0 #cfcfcf;
        }
        .form-control{
            background:transparent!important;
            color:white!important;
            font-size: 18px!important;
        }
        h1{
            color:white;
        }
        h4 {
            border:0 solid #fff;
            border-bottom-width:1px;
            padding-bottom:10px;
            text-align: center;
        }

        .form-control {
            border-radius: 10px;
        }
        .text-white{
            color: white!important;
        }
        .wrapper {
            text-align: center;
        }
        .footer p{
            font-size: 18px;
        }
    </style>
</head>
<body>

<!-- Page Content -->
<div class="container">
    <div class="row">
        <div class="col-md-offset-5 col-md-4 text-center">
            <h1 class='text-white'>Unique Login Form</h1>
            <div class="form-login"></br>
                <form action="/login" method="post">
                    <h4>Secure Login</h4>
                    </br>
                    <input type="text" id="userName" class="form-control input-sm chat-input" placeholder="username" name="username"/>
                    </br></br>
                    <input type="password" id="userPassword" class="form-control input-sm chat-input" placeholder="password" name="password"/>
                    </br></br>
                    <h1 style="color: red">${messeger}</h1>

                    <div class="form-group">
                        <input type="submit" value="Submid" class="btn float-right login_btn">
                    </div>
                </form>
                <form action="/register">
                    <input type="submit" value="Register" class="btn float-right login_btn">
                </form>
            </div>
        </div>
    </div>
    </br></br></br>
    <!--footer-->
    <div class="footer text-white text-center">
        <p></p>
    </div>
    <!--//footer-->
</div>
</body>
</html>
