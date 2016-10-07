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
import model.SinhVienDAO;

@WebServlet(urlPatterns = { "/addSinhVien" })
public class AddSinhVien extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public AddSinhVien() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String mssv = request.getParameter("mssv");
        int mssvNew = Integer.parseInt(mssv);
        String name = (String) request.getParameter("name");
        String className = (String) request.getParameter("className");
        String address = (String) request.getParameter("address");
        SinhVien sinhVien = new SinhVien(mssvNew, name, className, address);
        SinhVienDAO method;
        try {
            method = new SinhVienDAO();
            method.addSinhVien(sinhVien);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // request.setAttribute("sinhVien", sinhVien);
        response.sendRedirect(request.getContextPath() + "/danhSachSV");
        // if (errorString.contentEquals("done")) {
        //
        // } else {
        // RequestDispatcher dispatcher =
        // request.getRequestDispatcher("/ThemSinhVien.jsp");
        // dispatcher.forward(request, response);
        // }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
