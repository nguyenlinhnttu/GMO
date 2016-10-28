package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.StudentInfo;
import service.StudentInfoService;

@Controller
public class StudentInfoController {
	
	static Log log = LogFactory.getLog(StudentInfoController.class.getName());

	@RequestMapping(value = "/viewdetail", method = RequestMethod.GET)
	public String getDetailInfo(HttpServletRequest request, HttpServletResponse response) {
		StudentInfoService service = new StudentInfoService();
		int student_ID = Integer.parseInt(request.getParameter("studentID"));
		StudentInfo object = service.getInfoByID(student_ID);
		System.out.print(object);
		request.setAttribute("student", object);
		log.info("Get info student with ID: " + student_ID);
		return "detailstudent";
	}
	
	@RequestMapping(value = "/updateinfostudent", method = RequestMethod.POST)
	public ModelAndView updateinfostudent(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		StudentInfoService service = new StudentInfoService();
		int studentID = Integer.valueOf(request.getParameter("studentID"));
		String address = request.getParameter("address");
		double score = Double.parseDouble(request.getParameter("averageScore"));

		String dateOfBirth = request.getParameter("dateOfBirth");
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = null;
		try {
			startDate = df.parse(dateOfBirth);
			String newDateString = df.format(startDate);
			System.out.println(newDateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setStudentID(studentID);
		studentInfo.setAddress(address);
		studentInfo.setAverageScore(score);
		studentInfo.setDateOfBirth(startDate);
		System.out.println(studentInfo);
		StudentInfo object = service.getInfoByID(studentID);
		String message = new String();
		if (object == null) {
			service.insertStudentInfo(studentInfo);
			message = "Success!";
			log.info("Insert info student by ID = " + studentID);
			return new ModelAndView("studentinfo","message",message);
		} else {
			service.updateStudentInfo(studentInfo);
			message = "Success!";
			log.info("Update info student by ID = " + studentID);
			return new ModelAndView("studentinfo","message",message);
		}
	}
}
