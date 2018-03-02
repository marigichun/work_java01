package com.koitt.java.class01;

public class Student extends Person {

	/*Animal과 Person의 필드값을 상속받기 때문에
	 * 중복으로 작성하지 않아도 된다.
	 * 단, Teacher는 상속받지 않았기 때문에
	 * Teacher의 필드는 사용할 수 없다.
	 */
	private int studentID;		//학번
	private String major;		//전공
	private int grade;			//학년
	
	//메소드(method)
		public int getStudentID() {
			//return taehyun.studentId;
			return this.studentID;
		}
		public void setStudentID(int studentID) {
			//taehyun.studentId =10
			this.studentID = studentID;
		}
		//메소드(method)
		public String getMajor() {
			//return taehyun.major;
			return this.major;
		}
		public void setMajor(String major) {
			//taehyun.major= ="연기과";
			this.major = major;
		}
		//메소드(method)
		public int getGrade() {
			//return taehyun.grade;
			return this.grade;
		}
		public void setGrade(int gender) {
			//taehyun.grade = 4;
			this.grade = grade;
		}
}
