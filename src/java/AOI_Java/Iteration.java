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
public class Iteration extends TagSupport{
private int start,end;
private int step=1;
    JspWriter out;
    public int doStartTag() throws JspException
    {
        return EVAL_BODY_INCLUDE;
    }
    public int doAfterBody() throws JspException
    {
        
        if(start<=end-1)
        {
            try
            {
                out=pageContext.getOut();
                out.print("<br>");
                start+=step;
                return EVAL_BODY_AGAIN;
            }
            catch(Exception e){}
            
        }
        start=0;
        return SKIP_BODY;
      }
    public void setStart(int s){start=s;}
    public void setEnd(int e){end=e;}
    public void setStep(int st){step=st;}
}
