package model;

import java.io.Serializable;
import java.util.Date;

public class StudentInfo implements Serializable {
	private static final long serialVersionUID = 2L;
	private int infoID;
	private int studentID;
	private String address;
	private double averageScore;
	private Date dateOfBirth;
	
	public StudentInfo() {
		
	}
	public StudentInfo(int infoID, int studentID, String address, double averageScore, Date dateOfBirth) {
		super();
		this.infoID = infoID;
		this.studentID = studentID;
		this.address = address;
		this.averageScore = averageScore;
		this.dateOfBirth = dateOfBirth;
	}
	public int getInfoID() {
		return infoID;
	}
	public void setInfoID(int infoID) {
		this.infoID = infoID;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getAverageScore() {
		return averageScore;
	}
	public void setAverageScore(double averageScore) {
		this.averageScore = averageScore;
	}
	
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "StudentInfo [infoID=" + infoID + ", studentID=" + studentID + ", address=" + address + ", averageScore="
				+ averageScore + ", dataOfBirth=" + dateOfBirth + "]";
	}
}
