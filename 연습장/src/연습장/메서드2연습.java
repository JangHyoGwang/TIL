package 연습장;

public class 메서드2연습 {

	public static void main(String[] args) {
		hap(60,40);
		

	}
	
	static void hap(int num1, int num2) {
		System.out.println("두 수의 합 : " + (num1+num2));
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.println("두 수의 차: " + (num1-num2));
	}

}
