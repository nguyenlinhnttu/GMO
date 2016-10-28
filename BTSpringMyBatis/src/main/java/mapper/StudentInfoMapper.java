package mapper;


import model.StudentInfo;

public interface StudentInfoMapper {
	
	void insertStudentInfo(StudentInfo studentInfo);
	void updateStudentInfo(StudentInfo studentInfo);
	StudentInfo getInfoByID(int student_id);
	boolean deleteInfoStudent(int student_id);
}
