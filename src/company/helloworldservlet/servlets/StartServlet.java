package company.helloworldservlet.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Boris J.
 * 
 * ovaj servlet doesnt matter because it is just re directing us to the other page
 */
@WebServlet("/StartServlet")
public class StartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
											/*WE START OUR START SERVLET I DODJE TO RESULT SERVLET*/
       
 
    public StartServlet() {
        super();
       
    }        // WE NEED TO SPECIFY PROJECT NAME UVJEK

    /*/HelloWorldServlet/hiddenservlets/ResultsServlet.do je HelloWorldServlet je name of our total project in project explorer*/
    
   /* /hiddenservlets/ResultsServlet.do comes from @WebServlet("/hiddenservlets/ResultsServlet.do")*/
    
 /*   sto znaci NameOfTheProject.@WebServlet*/
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*you would do redirect in the real world like send it to a page for example index.jsp*/
		response.sendRedirect("/HelloWorldServlet/hiddenservlets/ResultsServlet.do");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
