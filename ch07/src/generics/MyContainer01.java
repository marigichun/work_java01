package generics;

import java.util.ArrayList;
import java.util.List;

public class MyContainer01<E> {	//객체가 정해지지 않은 상태이며 main에서 실행하면서 type이 정해짐
	public List<E> list;
	
	public MyContainer01() {
		list = new ArrayList<E>();
	}
	
	public E get(int index) {
		return list.get(index);
	}
	
	public void add(E element) {
		list.add(element);
	}
	
	public static void main(String[] args) {
		MyContainer01<String> pl = new MyContainer01<String>();	//실행하면 <E>는 전부  String으로 변환
		pl.add("algol");
	    pl.add("C");
	    //pl.add(5); //오류 발생
	    pl.add("java");
	    System.out.println(pl.get(0) + " ");
	    System.out.println(pl.get(1) + " ");
	    System.out.println(pl.get(2) + " "); 
		
	}
}
