package ����;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("������ ����");
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int[] arr = new int[t];
		
		for(int i = 0; i < t; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			arr[i] = A + B;
		}
		scan.close();
		
		for(int tmp : arr) {
			System.out.println(tmp); //  �迭�� �� ���� tmp�� �������.
		}
	}

}