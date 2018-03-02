//package inheritance.typecast;
package inheritance.overriding;
//클래스 위치 파일에 파일이 있을 수 없다.
public class Staff extends Faculty {
	public String division;
	
	public Staff(String name, long number, String univ, long idNumber, String division) {
		super(name, number, univ, idNumber);
		this.division = division;
	}
	
	public void printInfo() {
		System.out.print("이름: " + super.name + " 주민번호: "+ super.getSNumber());
		System.out.print(" 대학: " + this.univ + " 직원번호: " + super.number);
		System.out.println(" 부서: " + division);
	}
	
	public void printFacultyInfo() {
		super.printInfo();
	}
	
	public static void main(String[] args) {
		 Person she = new Person("이소라", 2056432);
		 she.printInfo();    //person에 있는 메소드 단순 호출 출력
		 
		 Faculty i  = new Faculty("김영태", 1145782, "연한대학교", 38764);
		 i.printInfo();		 //person에 있는 것을 보고 자식 클래스 Faculty에 있는걸 롹인후 최종 출력
		 
		 Staff he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
		 he.printInfo();		//최상위 person> 다음 Faculty> 다음 자신에게 확인 후 출력
		 he.printFacultyInfo();
		 he.printInfoPerson();
	}
}






