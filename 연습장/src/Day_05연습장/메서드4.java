package Day_05연습장;

public class 메서드4 {

	public static void main(String[] args) {
		printMulti(3);

	}
	
	static void printMulti(int num) {
		for(int i=1; i<=9; i++) {
			System.out.println((num) + " * " + (i) + " = " + (num*i));
		}
	}

}
