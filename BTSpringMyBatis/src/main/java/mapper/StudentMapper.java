package mapper;

import java.util.List;
import java.util.Map;

import model.Student;

public interface StudentMapper {
	List <Student> getStudentWithInfo();
	Student searchStudent(String student_Code);
	boolean insertStudent(Student student);
	boolean deleteStudent(int student_Id);
	boolean updateStudent(Student student);
	int countStudent(); // Count total students
	List <Student> pageStudent(Map<String, Integer> map); // Get student in page
}
