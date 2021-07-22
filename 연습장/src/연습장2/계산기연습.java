package 연습장2;

public class 계산기연습 {

	public static void main(String[] args) {
		double a = calc(10, 20, '*');
		System.out.println(a);

	}
	/* 두 정수 num1, num2 연산자가(+ -  * / % )가 주어졌을때 연산의 결과를 알려주는 메서드
	 * 매개변수: 두 정수, 연산자
	 * 리턴타입:
	 * 메서드명: calc
	 * */
	
	public static double calc(int num1, int num2, char op) {
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 = num2;
		case '*': return num1 * num2;
		case '/': return num1 / num2;
		case '%': return num1 % num2;
		default: return 99999;
		}

	}
	
}
