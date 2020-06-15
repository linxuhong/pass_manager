<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page contentType="text/html;charset=gbk" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>����֤���� </title>
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
        ��Ա֤���� <input type="text" name="pno" ></input>
<%--        ���� <input type="text" name="pname" ></input>--%>
        <input type="submit">
        <div style="float: left">
        <table border="1" cellspacing="0" width="800px" height="00px" align="left">
            <thead style="width: 600px">
                <tr>
                    <th nowrap>���</th>

                    <th nowrap>��Ա֤����</th>
                    <th nowrap>��Ա����</th>
                    <th nowrap>��ϵ�绰</th>

                    <th nowrap>������Ϣ</th>
                    <th nowrap>��Ա����</th>
                    <th nowrap>��֤����</th>
                    <th nowrap>����</th>
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
                         <c:if test="${code.type ==1}" >����</c:if>
                         <c:if test="${code.type ==2}" >���</c:if>
                        </td> <!--  ���� /��� -->
                        <td nowrap>${code.createtime}</td>

                        <td nowrap>
                            <button id="del" onclick="del(this)" ds =${code.id} >ɾ��</button>
                            <a href="/pass/update/${code.id}">�޸�</a>
                        </td>
                    </tr>


                </c:forEach>

            </tbody>
        </table>

        </div>

    </form>

    <div style="float: left;width: 1000px">
        <a href="${pageContext.request.contextPath}/pass/update/0">���</a>
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
