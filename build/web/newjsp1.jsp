<%-- 
    Document   : newjsp1
    Created on : 20 Nov, 2014, 12:04:27 PM
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
        <h1>Hello World!</h1>
        <ex:Hello/>
        <ex:PrintTag>This is Tag</ex:PrintTag>
    </body>
</html>
