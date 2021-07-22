package 연습장2;

public class 메서드6연습 {

	public static void main(String[] args) {
		/* 메서드 오버로딩: 동일한 이름을 가지는 메서드가 여러개 있을경우.
		 * 아래 조건을 만족하면 적용이 됨.
		 * 1. 매개변수의 개수가 다른경우
		 * 2. 매개변수의 자료형이 다른경우
		 * 매개변수의 이름은 상관없고, 리턴타입의 자료형도 상관없음.
		 * */
		int a = sum(5, 2);
		System.out.println(a);
		System.out.println(sum(5,2,3));
		System.out.println(sum(5.0,2.0));
				
		

	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	

}
