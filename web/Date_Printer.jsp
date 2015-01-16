<%-- 
    Document   : Date_Printer
    Created on : 1 Dec, 2014, 2:16:14 PM
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
        
        
       <ex:Date date="${param.t1}" format="${param.t2}"/>
     
        
    </body>
</html>
