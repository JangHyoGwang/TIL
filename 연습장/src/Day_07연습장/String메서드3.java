package Day_07������;

import java.util.Scanner;

public class String�޼���3 {

	public static void main(String[] args) {
		
		String[] fileName = {"�̰����ڹٴ�.java", "String�޼���.java", "java�� ������ǥ��.jpg", "java.gif", "String.png"};
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� �ܾ �Է� : ");
		String s = scan.next();
		System.out.println("--- �˻� �� : " + s + "---");
		for(int i=0; i<fileName.length; i++) {
			if(fileName[i].contains(s)) {
				System.out.println(fileName[i]);
			}
		}
		scan.close();
	}

}
