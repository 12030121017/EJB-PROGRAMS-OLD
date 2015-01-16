/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AOI_Java;
import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.*;

/**
 *
 * @author student
 */
public class no_table_tag extends SimpleTagSupport{
public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
    out.println("<html><body><center><table border=2>");
    for(int i= 1;i<=10;i++)
    {
        if(i==6)
        {
        out.println("<tr><td><table border=1><tr><td colspan=5>Table of " +i);
        }
        else
        {    
        out.println("<td><table border=1><tr><td colspan=5>Table of " +i);
        }
        for(int j=1;j<=10;j++)
        {
            out.println("<tr><td>"+i);
            out.println("<td> * ");
            out.println("<td>"+j);
            out.println("<td> = ");
            out.println("<td>"+(i*j));
        }
        out.println("</table></td>");
    }
    out.println("</table></center></body></html>");
    
}       
}
