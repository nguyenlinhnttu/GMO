package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.DBAccess;
import model.Students;
import model.StudentsDAOImpl;

@WebServlet(urlPatterns = { "/listStudent" })
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public HomeServlet() {
        super();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //New connection
        DBAccess access = new DBAccess();
        Connection conn = access.getConnection();
        
        List<Students> studentList = new ArrayList<>();
        StudentsDAOImpl method = new StudentsDAOImpl();
        try {
            studentList = method.getAllStudent(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Save request
        request.setAttribute("StudentList", studentList);
        // forward index
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
