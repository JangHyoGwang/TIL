package ������2;

public class �޼���6���� {

	public static void main(String[] args) {
		/* �޼��� �����ε�: ������ �̸��� ������ �޼��尡 ������ �������.
		 * �Ʒ� ������ �����ϸ� ������ ��.
		 * 1. �Ű������� ������ �ٸ����
		 * 2. �Ű������� �ڷ����� �ٸ����
		 * �Ű������� �̸��� �������, ����Ÿ���� �ڷ����� �������.
		 * */
		int a = sum(5, 2);
		System.out.println(a);
		System.out.println(sum(5,2,3));
		System.out.println(sum(5.0,2.0));
				
		

	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	

}
