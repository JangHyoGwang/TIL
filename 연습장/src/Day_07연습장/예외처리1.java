package Day_07������;

public class ����ó��1 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// ���ܰ� �߻��� �� �ִ� ����
			System.out.println(3);
			System.out.println(0/0); // ���ܰ� �߻��ϴ� ����
			System.out.println(4); // ���ܹ����� �߻��ϸ� �� �������ʹ� ����� ���� ����.
		}catch(Exception e) {
			e.printStackTrace(); // ���ÿ� �Էµ� ���� �޼����� ���
			System.out.println("���� �޼��� : " + e.getMessage());
		}
		System.out.println(5);
	}
}


