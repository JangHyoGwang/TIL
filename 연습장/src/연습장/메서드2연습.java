package ������;

public class �޼���2���� {

	public static void main(String[] args) {
		hap(60,40);
		

	}
	
	static void hap(int num1, int num2) {
		System.out.println("�� ���� �� : " + (num1+num2));
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		System.out.println("�� ���� ��: " + (num1-num2));
	}

}
