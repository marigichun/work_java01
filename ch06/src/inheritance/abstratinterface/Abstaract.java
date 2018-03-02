package inheritance.abstratinterface;

public class Abstaract {
	public static void main(String[] args) {
		Shape r = new Rectangle(2, 3, 3.67, 7.89);
		//Rectangle r = new Rectangle(2, 3, 3.67, 7.89);
		// 이렇게 할 수 있으나 상위 클래스을 표시함
		Shape c = new Circle(3, 4, 4.82);
		r.draw();
		c.draw();
		
		Shape sa[] = {
					new Rectangle(2.5, 3.1, 1.67, 3.89), 
					new Circle(4.2, 3.8, 1.56)
		};
		sa[0].draw();	//Shape 베열이지만 원소에 저장된 객체의 종류에 따라 
		sa[1].draw();	//자신 도형의 메소드draw()가 호출된다.
	}
}
