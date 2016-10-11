package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connect.DBAccess;
import model.Students;
import model.StudentsDAOImpl;

@WebServlet(urlPatterns = { "/findStudent" })
public class FindStudent extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public FindStudent() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        //Get Parameter 
        String mssv = request.getParameter("mssv");
        int mssvNew = Integer.parseInt(mssv);
        //New connection 
        DBAccess access = new DBAccess();
        Connection conn = access.getConnection();
        Students students = null;
        StudentsDAOImpl method = new StudentsDAOImpl();
        //Use method findStudent and return object Students
        try {
            students = method.findStudent(conn, mssvNew);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //Sava data to request
        request.setAttribute("student", students);
        //forward findStudent.jsp
        RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/findStudent.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
