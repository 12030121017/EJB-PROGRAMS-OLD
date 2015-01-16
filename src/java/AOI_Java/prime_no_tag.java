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
public class prime_no_tag extends SimpleTagSupport{
public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
   int limit = 100;        
    for(int i=1; i < 100; i++){
      boolean isPrime = true;
       for(int j=2; j < i ; j++){
         if(i % j == 0){
       isPrime = false;
       break;
       }
       }
        if(isPrime)
         out.println(i);
       } 
}
}
