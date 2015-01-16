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
public class Date_Printer extends SimpleTagSupport{
String date,format="";
public void doTag() throws JspException, IOException {
    JspWriter out = getJspContext().getOut();
   //out.println("<html><body>in do tag, values "+ date+" & "+format+"</body></html>"); 
String d=date.substring(0,date.indexOf("/"));
   String m=date.substring(date.indexOf("/")+1,date.lastIndexOf("/"));
   String y=date.substring(date.lastIndexOf("/")+1,date.length());
//out.println("<html><body>"+d+" @ "+m+" @ "+y );
String mon[]={"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
String month[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
String mm[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
String dd[]={"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};

if( format.equals("DD-MON-YYYY"))
{
out.println(dd[Integer.parseInt(d)-1]+" "+mon[Integer.parseInt(m)-1]+" "+y); 
//out.println("<html><body>1</body></html>");
}
if(format.equals("DD-MM-YYYY"))
{
out.println(dd[Integer.parseInt(d)-1]+" "+mm[Integer.parseInt(m)-1]+" "+y);
//out.println("<html><body>2</body></html>");
}
if(format.equals("DD-MONTH-YYYY"))
{
out.println(dd[Integer.parseInt(d)-1]+" "+month[Integer.parseInt(m)-1]+" "+y);   
//out.println("<html><body>3</body></html>");
}
if(format.equals("DD-MM-YY"))
{
out.println(dd[Integer.parseInt(d)-1]+" "+mm[Integer.parseInt(m)-1]+" "+y.substring(2,4));   
//out.println("<html><body>4</body></html>");
}
}
public void setDate(String d)
{
    date=d;
}
public void setFormat(String f)
{
    format=f;
}
}
