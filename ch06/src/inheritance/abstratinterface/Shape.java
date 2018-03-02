package inheritance.abstratinterface;

public abstract class Shape {
	protected static double x, y;
	

	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public void drawCenter() {					//일반 메소드 명확하게 기제해서 덜 추상적
		System.out.println("(x, y) = " + x + ", " +y);
	}
	/*
	 * 메소드 몸체가 없는 이유
	 * - 상속받은 클래스에서 구현을 하라는 뜻, 자식 클래스에게 맡기고 하라는 뜻
	 */
	public abstract void draw();				//추상 메소드 헤드만 있고 바디가 없다

	public static void main(String [] args) {
		//Shape s = new Shape(3.1, 4.5); 		//객체화 오류 추상 메소드 때문에(기능이 구현이 안된 상태라서)
		Shape s = new Circle(3.1, 4.5, x);  
		s.draw();
	}
}

