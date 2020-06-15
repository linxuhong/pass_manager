<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="x"
           uri="http://java.sun.com/jsp/jstl/xml" %>
<html>
<head>
    <title>出入证管理</title>
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


    <form action="${pageContext.request.contextPath}/pass/${code.id ne null?"doUpdate":"insert"}" method="post">
        <input type="hidden" name="id" id="id" value="${code.id}">

        <br>
        人员 ：<input type="text" name="pno" id="pno" value="${code.pno}">

        <br>
        房屋 ： <input type="text" name="cno" id="cno" value="${code.cno}">
        <br>
        类型：



        <select   name="type" id="type" value = "${code.cno}" style ="width:150px" >
            <option value ="2"  >

                租客
            </option>
            <option value =1  >
                 租客
            </option>
        </select>

        <br>
        备注：
        <input type="text" name="remark" id="remark" value="${code.remark}">
          <br>
        <input type="submit" value="${code.id eq null?"添加":"修改"}">
         <a href="/">返回</a>
    </form>
</div>
</body>
</html>
