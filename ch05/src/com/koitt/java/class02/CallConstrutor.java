package com.koitt.java.class02;

public class CallConstrutor {
	
	public static void main(String[] args) {
		Parent p = new Parent();
		child a = new child();
		child c = new child("새해 복 많이 받으세요.");
		child d = new child(30);
	}

}
