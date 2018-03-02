package PacTest;

public class Student {
	String major;
	int StudentID;
	
	public Student() {
		
	}
	public static void main(String[] args) {
		String major = "기공과";
		int Student = 303030;
	}
	public Student(String major) {
		this.major = major;
	}
	public Student(int StudentID) {
		this.StudentID = StudentID;
	}
	public void print() {
		System.out.println("학과: " + "학번: " + major, StudentID);
	}
}
