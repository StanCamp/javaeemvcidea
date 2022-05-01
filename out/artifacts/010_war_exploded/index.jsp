<%--
  Created by IntelliJ IDEA.
  User: jsdx0
  Date: 2022/4/25
  Time: 19:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.sql.*,java.io.*" pageEncoding="UTF-8" %>
<html>
<head>
    <title>展示输入内容的界面</title>
</head>
<body>
<table>
    <tr>
        <td>你刚才输入的文本是</td>
        <td><%=session.getAttribute("name")%>
        </td>
    </tr>
</table>
</body>
</html>
