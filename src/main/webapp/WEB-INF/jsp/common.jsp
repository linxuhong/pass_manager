<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>操作页面</title>
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

         废物信息维护
    <form action="${pageContext.request.contextPath}/h/${code.cid ne null?"doUpdate":"insert"}" method="post">
        <input type="hidden" name="cid" id="cid" value="${code.cid}">

        <br>
        小区：<input type="text" name="cname" id="cname" value="${code.cname}">

        <br>
        房屋楼层： <input type="text" name="cno" id="cno" value="${code.cno}">
        <br>
        业主电话：
        <input type="text" name="ctel" id="ctel" value="${code.ctel}">

        <br>
        业主身份证号：
        <input type="text" name="clandlord" id="clandlor" value="${code.clandlord}">
        <br>
        <input type="submit" value="${code.cid eq null?"添加":"修改"}">
    </form>
</div>
</body>
</html>
