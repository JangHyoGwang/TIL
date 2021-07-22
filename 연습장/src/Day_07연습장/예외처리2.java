package Day_07������;

public class ����ó��2 {

	public static void main(String[] args) {
		
		try {
			System.out.println(calc(4, 0, '+'));
			System.out.println(calc(4, 0, '-'));
			System.out.println(calc(4, 0, '*'));
			System.out.println(calc(4, 0, '?')); // ���� �߻�����
			System.out.println(calc(4, 0, '/')); // ���� �߻�����
			System.out.println(calc(4, 0, '%')); // ���� �߻�����
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("�����ϼ̽��ϴ�.^^");
		}
	}
	/* ��� : �� ������ ��� �����ڰ� �־����� ������ ����� �˷��ִ� �޼���
	 * �Ű����� : int num1, int num2, char op
	 * ����Ÿ�� : double
	 * �޼���� : calc
	 * */
	/* �޼��忡 throw�� �ϸ� ����ο� throws�� �̿��Ͽ� �߻��� �� �ִ� ���ܸ� �����ؾ� �Ѵ�.
	 * ��, RuntimeException�� ��ӹ��� Ŭ������ ����. (�������� �ʾƵ� ��.)
	 * */
	
	public static double calc(double num1, double num2, char op) throws RuntimeException{
		double res;
		if((op == '/' || op == '%') && num2 == 0) { // ���� �߻���Ȳ
			throw new RuntimeException("Num2�� 0�� �� �� �����ϴ�.");
		}
		if(num1 < num2) {
			int tmp = (int) num1;
			num1 = num2;
			num2 = tmp;
		}
		switch(op) {
		case'+': res = num1 + num2; break;
		case'-': res = num1 - num2; break;
		case'*': res = num1 * num2; break;
		case'/': res = (double) num1 / num2; break;
		case'%': res = num1 % num2; break;
		default : throw new RuntimeException(op + "�� ��������ڰ� �ƴմϴ�.");
		}
		return res;
	}

}
