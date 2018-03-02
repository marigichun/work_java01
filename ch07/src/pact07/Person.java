package pact07;


public class Person<p> {
	
	String name;
	public Person(String string) {
	}
	protected boolean myEqual(String a, String b) {
		return false;
	}
	protected boolean myEqual(String a, String b, String c) {
		return true;
	}
	
		
	@Override
	public String toString() {
		return "Person [name=";
	}
	public static void main(String[] args) {
		String a = "홍길동";
		String b = "최영태";
		String c = (a = b);
		
		Person<Object> p1 = new Person<Object>("홍길동");
		System.out.println(p1.equals(new Person<Object>(a)));
		System.out.println(p1.equals(new Person<Object>(b)));
		System.out.println(p1.equals(new Person<Object>(c)));

	}
}	
	