package Day_05연습장;

public class 메서드1 {

	public static void main(String[] args) {
		
		int hap = sum(10,20);
		System.out.println(hap);
		
		sum2(30,40);
		
		
		
	
	
	}
	
	static int sum(int num1, int num2) {
		int hap = num1 + num2;
		return hap;
	}
	
	static void sum2(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
}