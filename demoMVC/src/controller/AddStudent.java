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

@WebServlet(urlPatterns = { "/addStudent" })
public class AddStudent extends HttpServlet {
    private static final long serialVersionUID = 1L;
    String errorString = null;

    public AddStudent() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //Get parameter of form
        String mssv = request.getParameter("mssv");
        int mssvNew = Integer.parseInt(mssv);
        String name = (String) request.getParameter("name");
        String className = (String) request.getParameter("className");
        String address = (String) request.getParameter("address");
        Students students = new Students(mssvNew, name, className, address);
        //New conection
        DBAccess access = new DBAccess();
        Connection conn = access.getConnection();
        StudentsDAOImpl method;
        method = new StudentsDAOImpl();
        //Use method addStudent
        try {
            method.addStudent(conn, students);
        } catch (SQLException e) {
            e.printStackTrace();
            errorString = e.getMessage();
        }   
        //Sava data to request
        request.setAttribute("student", students);
        request.setAttribute("errorMesage", errorString);
        //if error show errorMesage else redirect listsinhvien
        if (errorString != null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/addStudent.jsp");
            dispatcher.forward(request, response);
            errorString = null;
        } else {
            response.sendRedirect(request.getContextPath() + "/listStudent");
            errorString = null;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
