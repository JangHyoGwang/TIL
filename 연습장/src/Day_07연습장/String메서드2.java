package Day_07������;

public class String�޼���2 {

	public static void main(String[] args) {
		/* 5��¥�� ���ڹ迭�� ������ ��, 5���� ���ϸ��� �Է¹޴� �ڵ��ۼ�
		 * �Է� ���� ���� �� �̹��� ���ϵ鸸 �����ϴ� �ڵ� �ۼ�
		 * 
		 * */
		
		int size = 5;
//		Scanner scan = new Scanner(System.in);
		String[] arr = new String[size];
		String[] fileName = {"�̰����ڹٴ�.java", "String�޼���.java", "java�� ������ǥ��.jpg", "java.gif", "String.png"};
		String[] img = {"png", "gif", "jpg", "bmp"};
		
		System.out.println("---�̹��� ���� ����Ʈ---");
		// ���ϸ� Ȯ���� .�� �������� Ȯ���ڸ� ����
		for(String tmp : fileName) {
			int index = tmp.lastIndexOf(".");
			String suffix = null;
			if(index == -1) {
				continue;
			}
			suffix = tmp.substring(index+1);
			if(contains(img,suffix)) {
				System.out.println(tmp);
			}
		}
//		scan.close();
	}
	/* ��� : �迭�� ã�� ���ڿ��� �־����� �迭���� ã�� ���ڿ��� �ִ��� �������� Ȯ���Ͽ� �˷��ִ� �޼���
	 * �Ű����� : 
	 * ����Ÿ�� : 
	 * �޼���� : contains
	 * */

	public static boolean contains(String[] arr, String serch) {
		// ������ ������ ���
		if(arr==null || arr.length == 0) {
			return false;
		} if(serch == null) {
			return false;
		}
	for(String tmp : arr) {
		if(serch.equals(tmp)) {
			return true;
			}
		}
	return false;

	}

}
