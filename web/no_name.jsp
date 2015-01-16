<%-- 
    Document   : no_name.jsp
    Created on : 27 Nov, 2014, 11:52:00 AM
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
        <ex:noname n="${param.t1}"/>
    </body>
</html>
