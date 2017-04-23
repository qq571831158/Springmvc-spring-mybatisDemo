<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: apple
  Date: 2017/4/24
  Time: 上午12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>success</h1>
<c:out value="cc"></c:out>
<c:out value="${userinfo.nickname}"></c:out>
${userinfo.nickname}
</body>
</html>
