package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String emailSupport1;    
   
    public InitParamServlet() {
        super();
        
    }
 // Method này luôn luôn được gọi 1 lần ngay sau khi đối tượng Servlet được tạo ra.
    @Override
    public void init() throws ServletException {
        super.init();     
        this.emailSupport1=getInitParameter("emailSupport1");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 // Bạn có thể lấy ra tham số khởi tạo theo cách khác.
        String emailSupport2 = this.getServletConfig().getInitParameter("emailSupport2");
 
        ServletOutputStream out = response.getOutputStream();
 
        out.println("<html>");
        out.println("<head><title>Init Param</title></head>");
 
        out.println("<body>");
        out.println("<h3>Init Param</h3>");
        out.println("<p>emailSupport1 = " + this.emailSupport1 + "</p>");
        out.println("<p>emailSupport2 = " + emailSupport2 + "</p>");
        out.println("</body>");
        out.println("<html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
