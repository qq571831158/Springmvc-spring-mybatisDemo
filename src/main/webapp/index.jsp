<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/index.css">
    <script type="text/javascript" src="js/jquery.js"></script>
    <script type="text/javascript" src="js/utils.js"></script>
    <script type="text/javascript" src="js/index.js"></script>
</head>
<body style="display: block">
<div id="top">
    <div class="w">
        <div class="top-left">
            <ul>
                <li>
                    <a id="doLogin">登录</a>
                </li>
                <li>
                    <a id="doRegist">注册</a>
                </li>

                <li>
                    <a id="doLogout" style="display: none">退出</a>
                </li>
            </ul>
        </div>
    </div>
</div>

<div id="login" style="top :-420px;">
    <span>用户登录</span>
    <input type="text" id="username" placeholder="用户名">
    <input type="password" id="password" placeholder="密码">
    <button id="loginBtn">登录</button>
    <button id="cancelBtn">取消</button>
</div>
<div id="bg" style="display: none"></div>
</body>
</html>
