package encapsulation;

public class StudentDetails {
	private String studentName;
	private String studentAge;
	private int studentID;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String inputstudentName) {
		studentName = inputstudentName;
	}
	public String getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(String inputstudentAge) {
		studentAge = inputstudentAge;
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int inputstudentID) {
		studentID = inputstudentID;
	}

}

