package 연습장;

import java.util.Scanner;

public class 메서드3연습 {

	public static void main(String[] args) {
		System.out.println(isPrime(7));
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		
		if(isPrime(num)) {
			System.out.println("소수입니다.");
		}else {
			System.out.println("소수가 아닙니다.");
		}
		
		System.out.println();
		for(int i=0; i<=100; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}

	}
	
	public static boolean isPrime(int num) {
		int cnt = 0;
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				cnt++;
			}
		}
		if(cnt == 2) {
			return true;
		}else {
			return false;
		}
	}

}
