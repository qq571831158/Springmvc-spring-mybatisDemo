window.onload = function () {
    setTimeout(show(), 1000);
    var bg = document.getElementById('bg');
    var login = document.getElementById('login');
    var username = document.getElementById('username');
    var password = document.getElementById('password');
    var doRegist = document.getElementById('doRegist');
    var doLogin = document.getElementById('doLogin');
    var loginBtn = document.getElementById('loginBtn');
    var cancelBtn = document.getElementById('cancelBtn');
    var doLogout = document.getElementById('doLogout');
    doLogin.onclick = function () {
        doMove(login, 'top', 80, 180);
        bg.style.display = 'block';
    }
    cancelBtn.onclick = function () {
        doMove(login, 'top', 80, -420);
        bg.style.display = 'none';
    }
    loginBtn.onclick = function () {
        if (username.value.length != 0 && password.value.length != 0) {
            var con = JSON.stringify({"username": username.value, "password": password.value});
            $.ajax({
                type: "POST",
                dataType: "json",
                contentType: "application/json",
                url: "http://localhost:8080/user/login.do",
                data: con,
                success: function (data) {
                    if (data.code == "S01") {
                        doLogin.innerHTML = data.contents.nickname;
                        doLogout.style.display = "block";
                        doMove(login, 'top', 80, -420);
                        doRegist.style.display = "none";
                        bg.style.display = 'none';
                        doLogin.onclick = function () {
                            return false;
                        };
                        doRegist.innerHTML = "退出"
                    } else {
                        alert(data.message);
                    }
                },
            });
        } else {
            alert("请重新输入！");
        }
    }

    doLogout.onclick = function () {
        window.location.href = "index.html";
    }
}


