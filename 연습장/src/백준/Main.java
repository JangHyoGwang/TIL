package 백준;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("실행할 개수");
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
			System.out.println(tmp); //  배열의 각 값이 tmp에 담겨진다.
		}
	}

}