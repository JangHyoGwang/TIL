package ������;

import java.util.Scanner;

public class �޼���3���� {

	public static void main(String[] args) {
		System.out.println(isPrime(7));
		
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է����ּ���.");
		int num = scan.nextInt();
		
		if(isPrime(num)) {
			System.out.println("�Ҽ��Դϴ�.");
		}else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
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
