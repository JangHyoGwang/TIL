package ������;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0, min = 1, max = 45;
		int random;
		
		System.out.println("1 ~ 50 ������ ���� �Է��ϼ���");
		
		random = (int) (Math.random()*max-min+1)+1;
		while(num != random) {
			num = scan.nextInt();
			
			if(num > random) {
				System.out.println("down");
			}if(num < random) {
				System.out.println("up");
			}if(num == random) {
				System.out.println("�����Դϴ�~!!");
			}
		}
		
		
		
		
		
		
		scan.close();
		
	}

}
