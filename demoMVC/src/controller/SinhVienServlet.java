package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SinhVienServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public SinhVienServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//response.getWriter().append("Served at: ").append(request.getContextPath());
		 ServletOutputStream out = response.getOutputStream();
	        
	       out.println("<html>");
	       out.println("<head><title>Hello Servlet</title></head>");
	        
	       out.println("<body>");
	       out.println("<h3>Hello World</h3>");
	       out.println("This is my first Servlet");
	       out.println("</body>");
	       out.println("<html>");
	       
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
