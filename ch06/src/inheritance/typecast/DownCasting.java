package inheritance.typecast;

public class DownCasting {

	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		//Faculty f = she;				//컴파일 오류
		//Faculty f1 = (Faculty) she;	//실행오류(Runtime Exception) - 사람은 교직원으로 행세할 수 없다고 오류남 - 캐스팅이 잘못됐다
		
		Person p = new Staff("김상기", 1187543, "강서대학교", 3456); //업 캐스팅으로 
		//Staff s = p;					//컴파일 오류 Person은 staff에 집어 넣을 수 없다.
		Staff s = (Staff) p;			//다운 캐스팅.자식이 부모인척 하는것은 가능, 부모는 자식이 될 수 없다.
		s.division = "교학처";			//자식이 부모인척 하다가 다시 자신으로 돌아오는것이 다운 캐스팅이 된다.
		System.out.print(p.name + " " + p.number + " ");
		System.out.print(s.univ + " " + s.number + " ");
		System.out.println(s.division);
		
		
		Faculty f2 = s;			//업캐스팅
		Staff s1 = (Staff) f2;	//다운캐스팅
	}
}
