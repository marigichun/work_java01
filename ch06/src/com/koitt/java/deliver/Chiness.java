package com.koitt.java.deliver;
/*
 * 중국집
 */
	public class Chiness extends Process {

		@Override
		public void ordering() {
			System.out.println("중국집에서 주문을 받는다.");
			
		}

		@Override
		public void cooking() {
			System.out.println("중국집에서 요리를 한다.");
		}

		@Override
		public void delivering() {
			System.out.println("중국집에서 배달은 한다.");			
		}

		@Override
		public void payment() {
			System.out.println("중국집 배달원이 결제를 받는다.");
			
		}

}
