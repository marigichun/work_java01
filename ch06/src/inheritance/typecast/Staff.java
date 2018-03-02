package inheritance.typecast;

public class Staff extends Faculty {
	public String division;
	
	public Staff(String name, long number, String univ, long idNumber) {
		super(name, number, univ,idNumber); 
		//이 super(..)가 없다면 자동으로 super()를 호출하는데, Faculty에 기본으로 생성자가 구현되지 있지 않으므로 오류가 발생한다.
	}
}
