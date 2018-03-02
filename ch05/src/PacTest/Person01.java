package PacTest;

public class Person01 {
	String name;
	
	public void Person(String name) {
		this.name = name;
	}
	public static void main(String[]agrs) {
		Person p  = new Person("예진");
		System.out.println(p.name);
		p = new Person();
		p.name = "진태";
		System.out.println(p.name);
	}
}
