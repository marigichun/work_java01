package inheritance.typecast;

public class Faculty extends Person {
	
	public String univ;
	public long number;
	
	public Faculty(String name, long number, String univ, long idNumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNumber;	//this.number는 사원번호,
	}							//super.uumber는 주민번호를 위한 필드이다.
	
	public long getSNumber() {
		return super.number;	//주민번호를 반환해야 하므로 반드시
	}							//super.number가 필요하다.
}
