package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Student;
import model.StudentInfo;
import service.StudentInfoService;
import service.StudentService;

@Controller
public class StudentController {
	
	private static Log log = LogFactory.getLog(StudentController.class.getName());
	// Get all Student with info merge 2 table
	@RequestMapping("/studentwithinfo")
	public String getAllStudent(ModelMap model) throws IOException {
		StudentService studentService = new StudentService();
		List<Student> listStudent = studentService.getStudentWithInfo();
		int count = studentService.countStudent();
		model.addAttribute("listStudent", listStudent);
		model.addAttribute("count", count);
		log.info("Get list student with Info!");
		return "students";
	}
	
	@RequestMapping(value = "/insert")
	public String insert(ModelMap model) {
		return "addstudent";
	}
	// Add new Student
	@RequestMapping(value = "/addstudent", method = RequestMethod.POST)
	public String  insertStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		StudentService studentService = new StudentService();
		Student student = new Student();
		student.setStudentName(request.getParameter("studentName"));
		student.setStudentCode(request.getParameter("studentCode"));
		String message = new String();
		boolean checkInsert = studentService.insertStudent(student);
		if (checkInsert == true) {
			message = "Insert thành công!";
			request.setAttribute("message", message);
			log.info(message);
		} else {
			message = "Insert thất bại!";
			log.info(message);
			request.setAttribute("message", message);
		}
		return ("addstudent");
	}
	
	@RequestMapping(value = "/search")
	public String search(ModelMap model) {
		return "searchstudent";
	}
	// Search Student with StudentCode example:  13A1519597
	@RequestMapping(value = "/searchstudents", method = RequestMethod.POST)
	public String  searchStudent(ModelMap model,HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		StudentService studentService = new StudentService();
		Student student = new Student();
		String student_Code = request.getParameter("studentCode");
		student = studentService.searchStudent(student_Code);
		try {
			if (student != null) {
				model.addAttribute("student", student);
				return ("searchstudent");
			} else {
				model.addAttribute("message", "Không tìm thấy!");
				return ("searchstudent");
			}
		} catch (Exception ex){
			log.error(ex);		
		}
		return ("searchstudent");
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
	// Update Info Student
	@RequestMapping(value = "/updatestudent", method = RequestMethod.POST)
	public void updateStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");

		Student student = new Student();
		String student_ID = request.getParameter("studentID");
		student.setStudentID(Integer.valueOf(student_ID));
		student.setStudentName(request.getParameter("studentName"));
		student.setStudentCode(request.getParameter("studentCode"));
			StudentService studentService = new StudentService();
		boolean checkUpdate = studentService.updateStudent(student);
		if (checkUpdate == true) {
			String message = "Update thành công!";
			log.info(message);
			request.setAttribute("message", message);
			response.sendRedirect(request.getContextPath() + "/update");
		} else {
			String message = "Update thất bại!";
			log.info(message);
			request.setAttribute("message", message);
			response.sendRedirect(request.getContextPath() + "/update");
		}	
	}
	// Delete Student: Delete infoStudet if exits, after delete Student
	@RequestMapping(value = "/deletestudent", method = RequestMethod.GET)
	public void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentService studentService = new StudentService();
		StudentInfoService infoService = new StudentInfoService();
		int studentID = Integer.valueOf(request.getParameter("studentID"));
			StudentInfo info = infoService.getInfoByID(studentID);
			if (info == null) {
				boolean checkDelete = studentService.deleteStudent(studentID); 
				if (checkDelete == true) {
					 String message = "Delete thành công!";
					 log.info(message);
					 response.sendRedirect(request.getContextPath() + "/studentwithinfo");
				} else {
					String message = "Delete thất bại!";
					log.info(message);
					response.sendRedirect(request.getContextPath() + "/studentwithinfo");
				}

			} else  {
				boolean checkDeleteInfo = infoService.deleteInfoStudent(studentID);
				if( checkDeleteInfo == true) {
					studentService.deleteStudent(studentID);
					String message = "Delete thành công!";
					log.info(message);
					response.sendRedirect(request.getContextPath() + "/studentwithinfo");
				} else {
					String message = "Delete thất bại!";
					log.info(message);
					response.sendRedirect(request.getContextPath() + "/studentwithinfo");
				}
			}
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String pageStudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		StudentService studentService = new StudentService();
		int pageNumber = Integer.valueOf(request.getParameter("number"));
		int start  = (pageNumber * 10) - 9;
		log.info("Page number:"+ pageNumber );
		try {
			Map<String, Integer> map = new HashMap<String, Integer>();
			map.put("start", start);
			List<Student> listStudent = studentService.pageStudent(map);
			int count = studentService.countStudent();
			request.setAttribute("count", count);
			request.setAttribute("listStudent", listStudent);
			return "students";
		} catch(Exception ex) {
			log.info(ex);
		}
		return "students";
	}
}
