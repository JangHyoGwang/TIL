package ������2;

public class ���⿬�� {

	public static void main(String[] args) {
		double a = calc(10, 20, '*');
		System.out.println(a);

	}
	/* �� ���� num1, num2 �����ڰ�(+ -  * / % )�� �־������� ������ ����� �˷��ִ� �޼���
	 * �Ű�����: �� ����, ������
	 * ����Ÿ��:
	 * �޼����: calc
	 * */
	
	public static double calc(int num1, int num2, char op) {
		if(num1 < num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		switch(op) {
		case '+': return num1 + num2;
		case '-': return num1 = num2;
		case '*': return num1 * num2;
		case '/': return num1 / num2;
		case '%': return num1 % num2;
		default: return 99999;
		}

	}
	
}
