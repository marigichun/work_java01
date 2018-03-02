package obj.basic;

public class Circle {
	public double radius;
	public static double PI = 3.141492;

	//생성자 구현
	public Circle(double radius) {
		this.radius = radius;
	}
	//현제 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;
		//return radius * radius * Circle.PI; // OK
		//return radius * radius * this.PI; // 오류 발생
		//this.PI=자기 자신의 객체를 표현하는 this로는 정적 멤버를 참조 불가능 
	}
	//주요 정보 출력
	public void print() {
		System.out.printf("반지름이 %f인 원의 면적은%f이다. %n", radius, getArea());
	}
	
	public static void main(String[] args) {
		System.out.println("원주율: " + Circle.PI);
		//Circle.PI=클래스 이름으로 정적 멤버를 참조 가능
		Circle c1 = new Circle(2.78);
		c1.print();
		Circle c2 = new Circle(5.25);
		c2.print();
		
		c1.PI = 3.14159265;
		System.out.println("원주율: "+ c2.PI);
		//c2.PI=객체 이름으로 정적 멤버를 참조 가능, 이클립스에서 경고가 발생하나 실행에는 전혀 문제가 없음
	}
}
