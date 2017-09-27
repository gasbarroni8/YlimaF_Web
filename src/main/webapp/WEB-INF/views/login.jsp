<%@page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<jsp:include page="header.jsp"/>
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

    $("#login").on("click", function () {
        var url = "./login";
        $.ajax({
            url: url,
            data: {}
        });

    });

    $("#register").on("click", function () {
        $(".login").hide();
        $(".register").show();
    });

    $("#backup").on("click", function () {
        $(".login").show();
        $(".register").hide();
    });

</script>
</html>
