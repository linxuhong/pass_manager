<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人员管理</title>
    <style>
        body {
            text-align: center
        }

        .div {
            margin: 0 auto;
            width: 600px;
            height: 600px;
            border: 1px solid #F00
        }

    </style>
</head>
<body>
<div align="center">

     人员信息维护
    <form action="${pageContext.request.contextPath}/pp/${code.pid ne null?"doUpdate":"insert"}" method="post">
        <input type="hidden" name="pid" id="pid" value="${code.pid}">

        <br>
        证件号 ：<input type="text" name="pno" id="pno" value="${code.pno}">

        <br>
        姓名 ： <input type="text" name="pname" id="pname" value="${code.pname}">
        <br>
        原籍：<input type="text" name="paddress" id="paddress" value="${code.paddress}">

        <br>
        电话：
        <input type="text" name="ptel" id="ptel" value="${code.ptel}">

        <input type="submit" value="${code.pid eq null?"添加":"修改"}">
    </form>
</div>
</body>
</html>
