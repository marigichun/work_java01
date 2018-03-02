package inheritance.overriding;

public class Overriding {
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		she.printInfo();       //Person의 기본 호출  
		
		Person i = new Faculty("김영태", 1145782, "연한대학교", 38764);
		i.printInfo();
		
		//업 캐스팅을 해도  본체의 형태로 출력
		Person he = new Staff("최영기", 1167429, "남도대학교", 1287, "기획처");
		he.printInfo();
		Faculty f = (Faculty) he;	 //다운 캐스팅
		f.printInfo();
		Staff s = (Staff) he;		//순차적으로 본체인 형태로 다운되서 출력
		s.printInfo();
	}
}
