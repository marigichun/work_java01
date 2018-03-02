package PacTest;

public class TestPer {
	public static void main(String[] args) {
		Person hangook = new Person();
		
		hangook.setName("나한국");
		hangook.setAge(30);
		
		hangook.print();
		hangook.print();
		
		System.out.println(hangook.getName());
		System.out.println(hangook.getAge());
	}
}
