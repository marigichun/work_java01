package Operator;

public class DevideByZero {
	public static void main(String[] args) {
		short data1 = 32766;
		short data2 =1;
		//short data3 = data1 + data2;				//더한 결과가 int형으로 변환
		short data3 = (short)(data1 + data2);		//명시적 형변환 int-> short
		short data4 = 32766 +1;
		System.out.println(data3 + " " + data4);
		
		System.out.println(0.0 / 0.0);				//Not a Number(숫자가 아니다)	
		System.out.println(3 / 0.0);				//무한대(3이 double형으로 변환)실수에서 정수를 나누면 무한대이기에
		//System.out.println(3 / 0);					//정수는 0으로 나눌 수 없기 때문에 예외
		
		String money = "NaN";
		double moneyDouble = Double.parseDouble(money);
		if(!Double.isNaN(moneyDouble)) {			//실수형에만 존재(NaN)->double,float
			double balance = 30000;//묵시적 형변환
			balance = balance + moneyDouble;
			System.out.println(balance);
		}
		else{
			System.out.println("금액을 다시 입력하세요.");
		}
	}

}
