package com.koitt.java.deliver;

public class Pizza extends Process {

	@Override
	public void ordering() {
		System.out.println("피자 주문을 받는다.");
		
	}

	@Override
	public void cooking() {
		System.out.println("피자를 한다.");
	}

	@Override
	public void delivering() {
		System.out.println("피자 배달은 한다.");			
	}

	@Override
	public void payment() {
		System.out.println("피자집 배달원이 결제를 받는다.");
	}
}
