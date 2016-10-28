package model;

import java.io.Serializable;

public class Student extends StudentInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private int studentID;
    private String studentName;
    private String studentCode;
    private StudentInfo studentInfo;
   
    public Student() {
    	super();
    }
   
	public Student(int studentID, String studentName, String studentCode, StudentInfo studentInfo) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentCode = studentCode;
		this.studentInfo = studentInfo;
	}


	public StudentInfo getStudentInfo() {
		return studentInfo;
	}


	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}


	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentCode=" + studentCode
				+"]";
	}
}
