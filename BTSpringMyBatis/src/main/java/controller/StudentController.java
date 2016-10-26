package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Student;
import model.StudentInfo;
import service.StudentInfoService;
import service.StudentService;

@Controller
public class StudentController {

	@RequestMapping("/getallstudent")
	public String getAllStudent(ModelMap model) throws IOException {
		StudentService studentService = new StudentService();
		List<Student> listStudent = studentService.getAllStudent();
		int count = studentService.countStudent();
		model.addAttribute("listStudent", listStudent);
		model.addAttribute("count", count);
		return "students";
	}
	@RequestMapping(value = "/insert")
	public String insert(ModelMap model) {
		return "addstudent";
	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public void insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		StudentService studentService = new StudentService();
		Student student = new Student();
		student.setStudentName(request.getParameter("studentName"));
		student.setStudentCode(request.getParameter("studentCode"));
		try {
			studentService.insertStudent(student);
			String message = "Insert thành công!";
			request.setAttribute("message", message);
			response.sendRedirect(request.getContextPath() + "/insert");
		} catch (Exception ex) {
			String message = "Insert thất bại!";
			request.setAttribute("message", message);
			response.sendRedirect(request.getContextPath() + "/insert");
		}
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(HttpServletRequest request, HttpServletResponse response) {
		int studentID = Integer.parseInt(request.getParameter("studentID"));
		StudentInfoService service = new StudentInfoService();
		StudentInfo object = service.getInfoByID(studentID);

		if (object == null) {
			request.setAttribute("studentID", studentID);
		} else {
			request.setAttribute("studentID", studentID);
			request.setAttribute("student", object);
		}
		return "updatestudent";
	}

	@RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
	public ModelAndView updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");

		Student student = new Student();
		String student_ID = request.getParameter("studentID");
		student.setStudentID(Integer.valueOf(student_ID));
		student.setStudentName(request.getParameter("studentName"));
		student.setStudentCode(request.getParameter("studentCode"));
		try {
			StudentService studentService = new StudentService();
			studentService.updateStudent(student);
			String message = "Update thành công!";
			return new ModelAndView("student", "message", message);
		} catch (Exception ex) {
			String message = "Update thất bại!";
			return new ModelAndView("students", "message", message);
		}

	}

	@RequestMapping(value = "/deletestudent", method = RequestMethod.GET)
	public void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentService studentService = new StudentService();
		int studentID = Integer.valueOf(request.getParameter("studentID"));
		try {
			studentService.deleteStudent(studentID);
			String message = "Delete thành công!";
			request.setAttribute("message", message);
			response.sendRedirect(request.getContextPath() + "/getallstudent");

		} catch (Exception ex) {
			String message = "Delete thất bại!";
			request.setAttribute("message", message);
			response.sendRedirect(request.getContextPath() + "/getallstudent");
		}
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String pageStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentService studentService = new StudentService();
		int pageNumber = Integer.valueOf(request.getParameter("number"));
		int start = (pageNumber * 10) - 10;
		int last = start + 10;
		try {
			List<Student> listStudent = studentService.getListStudent(start, last);
			request.setAttribute("listStudent", listStudent);
			return "students";
		} catch(Exception ex) {
			System.out.println(ex);
		}
		return "students";
	}
}
