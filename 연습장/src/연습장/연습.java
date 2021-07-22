package 연습장;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, min = 1, max = 45;
		int random;
		
		System.out.println("1 ~ 50 사이의 수를 입력하세요");
		
		random = (int) (Math.random()*max-min+1)+1;
		while(num != random) {
			num = scan.nextInt();
			
			if(num > random) {
				System.out.println("down");
			}if(num < random) {
				System.out.println("up");
			}if(num == random) {
				System.out.println("정답입니다~!!");
			}
		}
		
		
		
		
		
		
		scan.close();
		
	}

}
