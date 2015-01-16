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
public class factorial_printer extends SimpleTagSupport{
int n;
    public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
    out.println("<html><body>");
    int fact=1;
    if(n<=0)
    {
        out.println("Please enter a no which is greater than 1");
    }
    else
    {
        for(int i=1;i<=n;i++)
        {
          fact*=i;  
        }
    out.println("Factorial of "+n+" is: "+fact);
    }
}
public void setN(int no)
{
    n=no;
}
}
