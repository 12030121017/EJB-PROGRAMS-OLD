<%-- 
    Document   : factorial_printer
    Created on : 21 Nov, 2014, 12:17:13 PM
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
        <ex:factorial n="${param.t1}"/>
    </body>
</html>
