package inheritance.typecast;

public class UpCasting {
	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		
		Faculty f = new Faculty ("김영태", 1145782, "연한대학교", 38764);
		Person p = f;		// 업캐스팅.  부모 타입의 변수에다 자식의 객체를 넣을 수 있다.(부모가 자식을 품은것)
		System.out.print(p.name + " "+ p.number + " ");
		//System.out.println(p.univ); //참조 불가능 업이 될떄 Person(부모클래스의) 기본 필드(생성자)가 없기에
		System.out.println(f.name + " " + ((Person) f).number);
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff("김상기", 1187543, "강서대학교", 3456);
		s.division = "교학처";
		Person pn = s;
		Faculty ft = s;
		System.out.print(pn.name + " " + pn.number + " ");
		System.out.print(ft.name + " " + ft.number + " ");
		System.out.println(s.division);
	}
}
