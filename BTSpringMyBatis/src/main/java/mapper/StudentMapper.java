package mapper;

import java.util.List;
import model.Student;

public interface StudentMapper {
	List <Student> getAllStudent();
	List <Student> getListStudent(int firstResult, int maxResult);
	void insertStudent(Student student);
	void deleteStudent(int student_Id);
	void updateStudent(Student student);
	int countStudent();
}
