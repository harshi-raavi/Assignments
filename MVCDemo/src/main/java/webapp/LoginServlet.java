package webapp;


 
 import java.io.IOException;
 import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
 import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

 /*
  * Browser sends Http Request to Web Server
  * 
  * Code in Web Server => Input:HttpRequest, Output: HttpResponse
  * JEE with Servlets
  * 
  * Web Server responds with Http Response
  */

 //Java Platform, Enterprise Edition (Java EE) JEE6

 //Servlet is a Java programming language class 
 //used to extend the capabilities of servers 
 //that host applications accessed by means of 
 //a request-response programming model.

 //1. extends javax.servlet.http.HttpServlet
 //2. @WebServlet(urlPatterns = "/login.do")
 //3. doGet(HttpServletRequest request, HttpServletResponse response)
 //4. How is the response created?

 @WebServlet(urlPatterns = "/login.do")
 public class LoginServlet extends HttpServlet
 {
//	 protected void doGet(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, java.io.IOException{
//		
//		PrintWriter writer = response.getWriter();
//		writer.println("Good sussu");
//		 String name = request.getParameter("name"); 
//		 request.setAttribute("name", name);
//		request.setAttribute("name","Harshi");
//		request.setAttribute("password ", "some password");
//		 request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//	 }
//		 protected void doPost(HttpServletRequest request, HttpServletResponse response)throws javax.servlet.ServletException, java.io.IOException{
//			request.setAttribute("name",request.getParameter("name"));
//			 request.getRequestDispatcher("/WEB-INF/views/we lcome.jsp").forward(request, response);			
//		 }
//    @Override
//     	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
// 		PrintWriter out = response.getWriter();
// 	    out.println("<html>");
// 		out.println("<head>");
// 		out.println("<title>Yahoo!!!!!!!!</title>");
// 		out.println("</head>");
// 		out.println("<body>");
// 		out.println("My First Servlet");
// 		out.println("</body>");
// 		out.println("</html>");
// 	} 


	private UserValidationService service=new UserValidationService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/views/login.do").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		boolean isUserValid = service.isUserValid(name, password);
		if(isUserValid) {
		   request.setAttribute("name", name);	
	       request.setAttribute("password", password);
		   request.getRequestDispatcher("/WEB-INF/views/wlcome.jsp").forward(request, response);
	}
		else {
			request.setAttribute("errorMessage", "Invalid Credentials" );
			request.getRequestDispatcher("/WEB-INF/views/login.do").forward(request, response);	
		}
	}
 }
   
 

