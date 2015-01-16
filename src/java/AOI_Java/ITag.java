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
public class ITag extends TagSupport {
    private int number;
     int count=0;
    JspWriter out;
    public int doStartTag() throws JspException
    {
        return EVAL_BODY_INCLUDE;
    }
    public int doAfterBody() throws JspException
    {
        
        if(count<number-1)
        {
            try
            {
                out=pageContext.getOut();
                out.print("<br>");
                count++;
                return EVAL_BODY_AGAIN;
            }
            catch(Exception e){}
            
        }
        count=0;
        return SKIP_BODY;
      }
    public void setNumber(int n){number=n;}
}