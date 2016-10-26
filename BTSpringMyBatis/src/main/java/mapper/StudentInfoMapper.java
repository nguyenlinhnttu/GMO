package mapper;

import java.util.List;

import model.StudentInfo;

public interface StudentInfoMapper {
	List <StudentInfo> getAllStudentInfo();
	void insertStudentInfo(StudentInfo studentInfo);
	void updateStudentInfo(StudentInfo studentInfo);
	StudentInfo getInfoByID(int student_id);
	void deleteInfoStudent(int student_id);
}
