package Day_07연습장;

public class 예외처리2 {

	public static void main(String[] args) {
		
		try {
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '?')); // 예외 발생구문
			System.out.println(calc(4, 0, '/')); // 예외 발생구문
			System.out.println(calc(4, 0, '%')); // 예외 발생구문
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("수고하셨습니다.^^");
		}
	}
	/* 기능 : 두 정수와 산술 연산자가 주어지면 연산의 결과를 알려주는 메서드
	 * 매개변수 : int num1, int num2, char op
	 * 리턴타입 : double
	 * 메서드명 : calc
	 * */
	/* 메서드에 throw를 하면 선언부에 throws를 이용하여 발생할 수 있는 예외를 선언해야 한다.
	 * 단, RuntimeException을 상속받은 클래스는 제외. (기재하지 않아도 됨.)
	 * */
	
	public static double calc(double num1, double num2, char op) throws RuntimeException{
		double res;
		if((op == '/' || op == '%') && num2 == 0) { // 예외 발생상황
			throw new RuntimeException("Num2는 0이 될 수 없습니다.");
		}
		if(num1 < num2) {
			int tmp = (int) num1;
			num1 = num2;
			num2 = tmp;
		}
		switch(op) {
		case'+': res = num1 + num2; break;
		case'-': res = num1 - num2; break;
		case'*': res = num1 * num2; break;
		case'/': res = (double) num1 / num2; break;
		case'%': res = num1 % num2; break;
		default : throw new RuntimeException(op + "는 산술연산자가 아닙니다.");
		}
		return res;
	}

}
