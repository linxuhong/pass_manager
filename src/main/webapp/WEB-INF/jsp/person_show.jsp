<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>人员列表 </title>
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

                <th nowrap>姓名</th>
                <th nowrap>证件号</th>
                <th nowrap>原籍</th>
                <th nowrap>电话号码</th>
                <th nowrap>操作</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="code">
                <tr>
                    <td nowrap>${code.pid}</td>
                    <td nowrap>${code.pname}</td>
                    <td nowrap>${code.pno}</td>
                    <td nowrap>${code.paddress}</td>
                    <td nowrap>${code.ptel}</td>
                    <td nowrap>
                        <button id="del" onclick="del(this)" ds =${code.pid} >删除</button>
                        <a href="/pp/update/${code.pid}">修改</a>
                    </td>
                </tr>


            </c:forEach>
<%--            <c:set var="pid" value="${code.pid}" scope="page"></c:set>--%>

        </tbody>
    </table>

    </div>

    <div style="float: left;width: 1000px">
        <a href="${pageContext.request.contextPath}/pp/update/0">添加</a>
    </div>



    <script>
        function del(obj) {
           var id = $(obj).attr("ds")

            console.log(id)
            $.ajax({
                url: "${pageContext.request.contextPath}/pp/code/"+id,
                type: "post",
                data: {"_method": "delete"},
                dataType: "json",
                success: function (param) {
                    if (param.success) {
                        window.location = "${pageContext.request.contextPath}/pp/list";
                    } else {
                        console.log(param.msg);
                    }

                }
            })

        }
    </script>
</body>
</html>
