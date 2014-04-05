package company.helloworldservlet.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Boris J.
 */
@WebServlet("/StartServlet2")
public class StartServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StartServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

   // RequestDispatcher je when you dont want the user to see the URL (we are hiding HelloWorldServlet)
    // StartServlet i StartServlet2 su both re-directing, except we are just hiding things here with requestDispatcher
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// you dont need to have project name, unlike in StartServlet.java
		RequestDispatcher dispatcher = request.getRequestDispatcher("/hiddenservlets/ResultsServlet.do");
		dispatcher.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
