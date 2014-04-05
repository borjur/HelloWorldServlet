package company.helloworldservlet.servlets;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Boris J.
 * 
 * 
 * in url http://localhost:8080/HelloWorldServlet/hiddenservlets/HelloWorld2.do STO ZNACI da je HelloWorldServlet name of the project
 */
@WebServlet("/hiddenservlets/HelloWorld2.do")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		double sqrtvalue = Math.sqrt(4.0);
		
		out.println("<html><body><h1 align='center'>Hello World Servlet</h1>"
					+ "<br>The square root of 4.0 is: " + sqrtvalue + "<br>"
					+ "</body></html>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
