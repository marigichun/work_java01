package obj.constructor;

public class Student {
	public String name;
	//생성자(Construtor)
	//alt+shift+s
	public Student(String name) {
		/*
		 *super(); 나의 부모의 기본 생성자를 호출
		 *super(Object)는 나의 부모, 없다면 컴파일러가 자동으로 추가
		 *super():항상 자식 클래스 생성자의 맨 앞줄에 위치한다.
		 *this.name = name;
		*/
		this.name = name;
	}
	/*public Student(String name) {
		//필드 name을 초기화하는 생성자
		this.name = name;
	}*/
	public void print() {
		System.out.println("학생이름: " + this.name);
		
	}	
	public static void main(String[] args) {
		Student i = new Student ("김민정");
		System.out.println(i.name);
		i.print();
	}
	//object 객체 생성(기본 생성자를 이용하여 생성)
	/*
	 * 해당 클래스에 생성자가 하나도 없다면 
	 * 컴파일러가 자동으로 기본 생성자를 생성한다.
	 */
	Object test = new Object();
	
	/*이미 생성자 Student(String name)이 존재하기 때문에
	 * 컴파이러가 기본 생성자를 생성하지 않아서 아래와 같이 호출이 불가능하다.
	 */
	//Student
	
	}

