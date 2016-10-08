package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SinhVien;
import model.SinhVienDAOImpl;

@WebServlet(urlPatterns = { "/findSinhVien" })
public class FindSinhVien extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FindSinhVien() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("UTF-8");
	    String mssv = request.getParameter("mssv");
        int mssvNew = Integer.parseInt(mssv);
        SinhVien sinhVien = null;
	    try {
	        SinhVienDAOImpl method = new SinhVienDAOImpl();
            sinhVien = method.searchSV(mssvNew);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();    
        } catch (SQLException e) {
            e.printStackTrace();
        }
	    request.setAttribute("sinhVien", sinhVien);
	    RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/TimKiem.jsp");
        dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
