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
public class PrintTag extends TagSupport{
    public int doStartTag(){
        try{
            JspWriter out= pageContext.getOut();
            out.println("Hello World");
        }
        catch(IOException ioe){}
        //return EVAL_BODY_INCLUDE;
        return SKIP_BODY;
        }
    }
