/*
	*Este software fue desarrollado por Franksoft, el 31-01-2015. 
*/

import java.io.*; 
import java.text.*;
import java.util.*; 
import javax.servlet.*;
import javax.servlet.http.*;
public class Multiplicar extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		int num = Integer.parseInt(req.getParameter("num"));
		pw.println("<!Doctype html><HTML><HEAD><meta charset=\"utf-8\"><TITLE>Tabla de multiplicar</TITLE>");
		pw.println("<link rel=\"stylesheet\" href=\"../../src/css/reset.css\">");
		pw.println("<link rel=\"stylesheet\" href=\"../../src/css/style.css\"></head>");
		pw.println("<BODY");
		pw.println("<header>Tabla de multiplicar</header><section class=\"tabla\"><table>");
		int multiplicar;
		for(int i=0; i <= 20; i++){
			multiplicar = i*num;
			pw.println("<tr><td>"+i+"x"+num+": "+multiplicar+"</td></tr>");
		}
		pw.println("</table></section></body></html>");
		pw.close();
	}
} 
