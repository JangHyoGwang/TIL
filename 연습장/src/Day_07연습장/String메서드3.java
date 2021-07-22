package Day_07연습장;

import java.util.Scanner;

public class String메서드3 {

	public static void main(String[] args) {
		
		String[] fileName = {"이것이자바다.java", "String메서드.java", "java의 정석앞표지.jpg", "java.gif", "String.png"};
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어를 입력 : ");
		String s = scan.next();
		System.out.println("--- 검색 값 : " + s + "---");
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(s)) {
				System.out.println(fileName[i]);
			}
		}
		scan.close();
	}

}
