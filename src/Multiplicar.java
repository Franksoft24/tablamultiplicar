/*
	*Este software fue desarrollado por Franksoft, el 31-01-2015. 
*/

import java.io.*; 
import java.text.*;
import java.util.*; 
import javax.servlet.*;
import javax.servlet.http.*;
public class Multiplicar extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
				throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		pw.println("<!Doctype html><HTML><HEAD><meta charset=\"utf-8\"><TITLE>Tabla de multiplicar</TITLE>");
		pw.println("<style>table{float:left; padding:5%; background-color:#fff;}body{background-color:#ECECEC}header{margin-left:10%;margin-right:10%;width:80%;background-color:#fff;text-align:center;text-transform:uppercase;}section{margin-right:10%;margin-left:10%;width:80%;background-color:#fff;overflow:hidden;margin-top:3%;}</style>");
		pw.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"recursos/css/style.css\" /></head>");
		pw.println("<body>");
		pw.println("<header>Tabla de multiplicar</header><section class=\"tabla\">");
		int multiplicar;
		if(num1<=num2){
			for(int j = num1; j <= num2; j++){
				pw.println("<table>");
				for(int i = 1; i <=20; i++){			
					multiplicar = i*j;
					pw.println("<tr><td>"+j+"x"+i+": "+multiplicar+"</td></tr>");
				}
				pw.println("</table>");
			}
		}else{
			for(int j = num2; j <= num1; j++){
				pw.println("<table>");
				for(int i = 1; i <=20; i++){			
					multiplicar = i*j;
					pw.println("<tr><td>"+j+"x"+i+": "+multiplicar+"</td></tr>");
				}
				pw.println("</table>");
			}
		}
		pw.println("</section></body></html>");
		pw.close();
	}
} 
