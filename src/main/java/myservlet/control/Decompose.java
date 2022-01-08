package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
@SuppressWarnings("serial")
public class Decompose extends HttpServlet{
public void init(ServletConfig config) throws ServletException{
	super.init(config);}
 
 
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException{
	request.setCharacterEncoding("gb2312");//设置编码
	response.setContentType("text/html;charset=gb2312");//设置响应
	PrintWriter out = response.getWriter(); //输出
	out.println("<html><body bgcolor=pink>");
	out.println("输出结果如下：");
	
	String str = request.getParameter("english");
	out.println(str);
 
	
	if(str==null||str.length()==0)
		return;
	String []word = str.split("[^a-zA-Z]+");//分割
	int n = 0;
	
	try{
	for(int i=0;i<word.length;i++){
	if(word[i].length()>=1){
		n++;
		out.print("<br>"+word[i]);}
	}
	}
	catch(NumberFormatException e){out.println(" "+e);}
	out.println("单词数目："+n);
	out.println("</body></html>");
	}
 
}