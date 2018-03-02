package inheritance.construtor;

public class Motor extends Vehicle{
	//public String name = "자동차";		//이름
	//public int displacement;			//배기량
	private String name = "자동차";		//이름
	private int displacement;			//배기량
	//Motor의 기본 생성자
	public Motor() {
		/*
		 * 부모가 존재해야 자식이 존내할 수 있기 때문에
		 * 항상 부모의 생성자를 먼저 한번 호출해야 한다.
		 */
		super();		//Vehicle(); 생략 가능(컴파일러가 알아서 자동으로 생성)
	}	//부모의 기본 생성자가 없으면 자식도 생성을 못한다.(객체)
		//따로 자식이 만들어 사용해야 한다.
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed, seater);
		//this.maxSpeed = maxSpeed; //자식 필드 초기화
		//this.seater = seater;		//자긱 필드 초기화
		//1.부모 필드(Vehicle) 먼저 출력후 - 초기화의 목적으로 
		this.displacement = displacement;
	}
	
	public void printInfo() {
		System.out.print(super.getName() + ": " + this.name);
		System.out.println(", 최대속도: " + this.getMaxSpeed() + " km");
		System.out.print("정원: "+ this.getSeater() + " 명");
		System.out.println(", 배기량: " + this.displacement + " cc");
	}
	
	//2.부모 이후 초기화되고 자식이 출력.
	public static void main(String[] args) {
		Motor myCar = new Motor(300, 4, 5000);
		myCar.printInfo();
	}

	
}
