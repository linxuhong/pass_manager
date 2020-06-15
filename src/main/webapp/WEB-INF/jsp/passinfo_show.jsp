<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>出入证管理 </title>
    <style>
    <jsp:include page="css.jsp"></jsp:include>
    </style>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.0.0.min.js"></script>
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>

    <br>
    <br>

    <form action= "${pageContext.request.contextPath}/pass/list"  >
        人员证件号 <input type="text" name="pno" ></input>
<%--        姓名 <input type="text" name="pname" ></input>--%>
        <input type="submit">
        <div style="float: left">
        <table border="1" cellspacing="0" width="800px" height="00px" align="left">
            <thead style="width: 600px">
                <tr>
                    <th nowrap>编号</th>

                    <th nowrap>人员证件号</th>
                    <th nowrap>人员姓名</th>
                    <th nowrap>联系电话</th>

                    <th nowrap>房屋信息</th>
                    <th nowrap>人员类型</th>
                    <th nowrap>办证日期</th>
                    <th nowrap>操作</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="code">
                    <tr>
                        <td nowrap>${code.id}</td>

                        <td nowrap>${code.pno}</td>
                        <td nowrap>${code.pname}</td>
                        <td nowrap>${code.ptel}</td>

                        <td nowrap>${code.cname}</td>
                        <td ${code.type} nowrap>
                         <c:if test="${code.type ==1}" >房东</c:if>
                         <c:if test="${code.type ==2}" >租客</c:if>
                        </td> <!--  房东 /租客 -->
                        <td nowrap>${code.createtime}</td>

                        <td nowrap>
                            <button id="del" onclick="del(this)" ds =${code.id} >删除</button>
                            <a href="/pass/update/${code.id}">修改</a>
                        </td>
                    </tr>


                </c:forEach>

            </tbody>
        </table>

        </div>

    </form>

    <div style="float: left;width: 1000px">
        <a href="${pageContext.request.contextPath}/pass/update/0">添加</a>
    </div>



    <script>
        function del(obj) {
           var id = $(obj).attr("ds")

            console.log(id)
            $.ajax({
                url: "${pageContext.request.contextPath}/pass/code/"+id,
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
