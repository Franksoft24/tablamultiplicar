import java.io.*; 
import java.text.*;
import java.util.*; 
import javax.servlet.*;
import javax.servlet.http.*;
public class multiplicar extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		int num = req.getParameter("num");
		for(int i=0; i <= 20; i++){
			
		}
		pw.println("<HTML><HEAD><TITLE>Leyendo parámetros</TITLE></HEAD>");
		pw.println("<BODY BGCOLOR=\"#CCBBAA\">");
		pw.println("<H2>Leyendo parámetros desde un formulario html</H2><P>");
		pw.println("<UL>\n");
		pw.println("Te llamas " + req.getParameter("num") + "<BR>");
		pw.println("y tienes "  + req.getParameter("EDA") + " años<BR>");
		pw.println("</BODY></HTML>");
		pw.close();
	}
} 
