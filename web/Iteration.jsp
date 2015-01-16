<%-- 
    Document   : Iteration
    Created on : 4 Dec, 2014, 12:38:51 PM
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
        <% int i=10; %>
        
        <ex:Iter start="5" end="15" step="3">
            <h1>This is JSP?</h1>
        <%=i++%>
        </ex:Iter>
    </body>
</html>
