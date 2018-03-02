package inheritance.abstratinterface;

public class HPPrinter extends Device implements Connectable {
	//클래스 Device의 추상 메소드 구현
	public void print() {
		System.out.println("HP 프린트입니다.");
	}
	//인테페이스 Connectable의 추상메소드 구현
	@Override
	public void connect() {
		System.out.println(Connectable.name + ", HP 프린터를 연결합니다.");
	  //상위 인터페이스에 선언된 name은 정적이므로 super.name으로 참조가 불가능하다.
	}
}
