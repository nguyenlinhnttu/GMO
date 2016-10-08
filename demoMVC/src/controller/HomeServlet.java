package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SinhVien;
import model.SinhVienDAOImpl;

@WebServlet(urlPatterns = { "/danhSachSV" })
public class HomeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HomeServlet() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            List<SinhVien> list = new ArrayList<>();
            SinhVienDAOImpl method = new SinhVienDAOImpl();
            list = method.getAllSV();
            // Lưu thông tin request
            request.setAttribute("sinhVienList", list);
            // Chuyển dữ liệu sang index
            RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
            dispatcher.forward(request, response);

        } catch (Exception e1) {

        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
