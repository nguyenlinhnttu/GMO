package mapper;

import java.util.List;
import model.Student;

public interface StudentMapper {
	List <Student> getStudentWithInfo();
	Student searchStudent(String student_Code);
	void insertStudent(Student student);
	void deleteStudent(int student_Id);
	void updateStudent(Student student);
	
	int countStudent();
	List <Student> pageStudent(int firstResult, int maxResult);
}
