<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>show</title>
    <style>
    <jsp:include page="css.jsp"></jsp:include>
    </style>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.0.0.min.js"></script>
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>

    <br>
    <br>




    <div style="float: left">
    <table border="1" cellspacing="0" width="800px" height="00px" align="left">
        <thead style="width: 600px">
            <tr>
                <th nowrap>编号</th>
                <th nowrap>小区名</th>
                <th nowrap>房号</th>
                <th nowrap>业主身份证</th>
                <th nowrap>业主电话</th>
                <th nowrap>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="code">
                <tr>
                    <td nowrap>${code.cid}</td>
                    <td nowrap>${code.cname}</td>
                    <td nowrap>${code.cno}</td>
                    <td nowrap>${code.clandlord}</td>
                    <td nowrap>${code.ctel}</td>
                    <td nowrap>
                        <button id="del" onclick="del(this)" ds =${code.cid} >删除</button>
                        <a href="/h/update/${code.cid}">修改</a>
                    </td>
                </tr>


            </c:forEach>
            <c:set var="cid" value="${code.cid}" scope="page"></c:set>

        </tbody>
    </table>

    </div>

    <div style="float: left;width: 1000px">
        <a href="${pageContext.request.contextPath}/update">添加</a>
    </div>



    <script>
        function del(obj) {
           var id = $(obj).attr("ds")

            console.log(id)
            $.ajax({
                url: "${pageContext.request.contextPath}/h/code/"+id,
                type: "post",
                data: {"_method": "delete"},
                dataType: "json",
                success: function (param) {
                    if (param.success) {
                        window.location = "${pageContext.request.contextPath}/h/list";
                    } else {
                        console.log(param.msg);
                    }

                }
            })

        }
    </script>
</body>
</html>
