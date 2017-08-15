<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<jsp:include page="header.jsp"/>
<style>
    .bg {
        top: 0;
        bottom: 0;
        right: 0;
        position: absolute;
        z-index: -100;
    }

    .login {
        border: solid 2px rgba(0, 187, 255, 0.74);
        border-radius: 10px;
        width: 300px;
        height: 150px;
        margin: 550px auto 0;
        background-color: rgba(98, 224, 229, 0.87);
    }

    .register {
        height: 200px;
    }

    .login ul {
        list-style: none;
    }

    .login ul li {
        float: left;
        width: 100px;
        margin: 5px 0;
        text-align: center;
    }

    .login input {
        width: 100px;
    }

    .login .btn {
        width: 50px;
        border-radius: 10px;
        border-color: rgba(56, 223, 121, 0.63);
        background-color: rgba(56, 223, 121, 0.63);
    }

    .login ul .msg {
        color: red;
        width: 200px;
        font-size: 12px;
    }
</style>
</head>
<body>
<img class="bg" src="http://localhost:8081/img/bg.jpg" width="100%" height="100%"/>
<div class="login">
    <form id="loginForm" action="login" method="post">
        <ul>
            <li>用　　户：</li>
            <li><input type="text" name="userName"/></li>
        </ul>
        <ul>
            <li>密　　码：</li>
            <li><input type="password" name="password"/></li>
        </ul>
        <ul>
            <li class="msg">${message}</li>
        </ul>
        <ul>
            <li><input id="login" class="btn" type="submit" value="登录"/></li>
            <li><input id="register" class="btn" type="button" value="注册"></li>
        </ul>
    </form>
</div>

<div class="login register hide">
    <form action="register" method="post">
        <ul>
            <li>用　　户：</li>
            <li><input type="text" name="userName"/></li>
        </ul>
        <ul>
            <li>姓　　名：</li>
            <li><input type="text" name="name"/></li>
        </ul>
        <ul>
            <li>密　　码：</li>
            <li><input type="password" name="password"/></li>
        </ul>
        <ul>
            <li>确认密码：</li>
            <li><input type="password" name="confirmPass"/></li>
        </ul>
        <ul>
            <li class="msg">${message}</li>
        </ul>
        <ul>
            <li><input class="btn" type="submit" value="确认"/></li>
            <li><input id="backup" class="btn" type="button" value="返回"></li>
        </ul>
    </form>
</div>
</body>
<script>
    var app = angular.module('Login', [], function(){console.log('started')});
    app.controller.constructor

    /* $("#login").on("click", function() {
     var url = "./login";
     $.ajax({
     url: url,
     data: {

     }
     });

     });

     $("#register").on("click", function() {
     $(".login").hide();
     $(".register").show();
     });

     $("#backup").on("click", function() {
     $(".login").show();
     $(".register").hide();
     }); */

</script>
</html>