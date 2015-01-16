<%-- 
    Document   : ITag
    Created on : 28 Nov, 2014, 12:41:02 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@taglib uri="/WEB-INF/tlds/mytaglib" prefix="ex" %>
        <% int a=20; %>
        
        <ex:ITag number="5">
            <h1>Hello World!</h1>
        <%=a++%>
        </ex:ITag>
    </body>
</html>
