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
public class no_name extends SimpleTagSupport{
    int n;
    public static final String[] units = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"};
    public static final String[] tens = {
            "",        // 0
            "",        // 1
            "twenty",  // 2
            "thirty",  // 3
            "forty",   // 4
            "fifty",   // 5
            "sixty",   // 6
            "seventy", // 7
            "eighty",  // 8
            "ninety"   // 9
            };
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        out.println("<html><body>");
    out.println(convert(n));
}
   
    public static String convert(int no) 
    {
    if (no < 20)
    {
            return(units[no]);
    }
    if (no < 100) 
    {
            return(tens[no / 10] + ((no % 10 != 0) ? " " : "") + units[no % 10]);
    }
    if (no < 1000) 
    {
            return(units[no / 100] + " hundred" + ((no % 100 != 0) ? " " : "") + convert(no % 100));
    }
    if (no < 1000000) 
    {
            return(convert(no / 1000) + " thousand" + ((no % 1000 != 0) ? " " : "") + convert(no % 1000));
    }
    return "";
    }   
    public void setN(int no)
    {
    n=no;
    }   
}
