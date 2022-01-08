package myservlet.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
@SuppressWarnings("serial")
public class Decompose extends HttpServlet{
public void init(ServletConfig config) throws ServletException{
	super.init(config);}
 
 
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException{
	request.setCharacterEncoding("gb2312");//���ñ���
	response.setContentType("text/html;charset=gb2312");//������Ӧ
	PrintWriter out = response.getWriter(); //���
	out.println("<html><body bgcolor=pink>");
	out.println("���������£�");
	
	String str = request.getParameter("english");
	out.println(str);
 
	
	if(str==null||str.length()==0)
		return;
	String []word = str.split("[^a-zA-Z]+");//�ָ�
	int n = 0;
	
	try{
	for(int i=0;i<word.length;i++){
	if(word[i].length()>=1){
		n++;
		out.print("<br>"+word[i]);}
	}
	}
	catch(NumberFormatException e){out.println(" "+e);}
	out.println("������Ŀ��"+n);
	out.println("</body></html>");
	}
 
}