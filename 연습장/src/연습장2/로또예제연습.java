package ������2;

public class �ζǿ������� {

	public static void main(String[] args) {
		int size = 6;
		int max = 45;
		int min = 1;
		int[] user = new int[6];
		int[] lotto = new int[7];
//		int arr[] = new int[size];
		System.out.print("���� ������ �� : ");
		System.out.print(random(45, 1));
		
		randomArray(user, max, min);
		randomArray(lotto, max, min);
		System.out.println();
		System.out.println("====����� ��ȣ====");
		printArray(user);
		System.out.println("====�ζ� ��÷��ȣ====");
		printArray(lotto);
		
		int rank = lottoRank(user, lotto);
		if(rank == -1) {
			System.out.println("���Դϴ�~!! ������ȸ��");
		}else {
			System.out.println("�����մϴ� " + rank+ "���Դϴ�.");
		}
		

	}
	/* ���: ���ϴ� ���� ���� ���� 1�� �����ؼ� �˷��ִ� �޼���
	 * �Ű�����: int max, int min (���� ������ ���ؼ�...)
	 * ����Ÿ��: int
	 * �޼����: random
	 * */
	
	public static int random(int max, int min) {
		if(min > max) {
			int tmp = min;
			min = max;
			max = tmp;
		}
		int random = (int)(Math.random()*(max-min+1)+min);
		return random;
		
	}
	
	
	/* ���: �־��� �迭(����� ��ȣ, ��÷��ȣ)�� ��� ������ �ִ� ���� �������� �����ϴ� �޼���
	 * �Ű�����: int[] arr, int max, int min
	 * ����Ÿ��: void
	 * �޼����: randomArray
	 * */
	
	public static void randomArray(int[] arr, int max, int min) {
		if((max-min+1) < arr.length) {
			System.out.println("������ �۽��ϴ�.");
			return;
		}
	
		int cnt = 0;
		while(cnt < arr.length) {
			int b = random(max, min);
			if(!isContain(arr, b)) {
				arr[cnt] = b;
				cnt++;
			}
		}
	}
	
	
	
	
	
	/* ���: �迭�� Ư������ ������ Ȯ���ϴ� ���
	 * �Ű�����: �迭 int arr[], Ư�� �� int num
	 * ����Ÿ��: boolean Ư������ ������ true Ư������ ������ false
	 * �޼����: isContain
	 * */
	
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	
	/* ���: �迭�� ����ϴ� �޼���
	 * �Ű�����: �迭 int[] arr
	 * ����Ÿ��: void => ���
	 * �޼����: printArray
	 * */
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	/* ���: �迭�� ���� ������ �����ϴ� �޼��� (����� ������ -1�� ����)
	 * �Ű�����: ����� ��ȣ => int[] user, int[] lotto
	 * ����Ÿ��: int
	 * �޼����: lottoRank
	 * */
	
	public static int lottoRank(int[] user, int[] lotto) {
		if(lotto.length <= user.length) {
			return -1;
		}
		int cnt = 0; // user�� lotto�� ��ġ�ϴ� ����
		for(int i=0; i<user.length; i++) { // 6���� ���� ���ؼ� user�� ���
			// �ش��ȣ�� �迭�� �ִ��� Ȯ��
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		switch(cnt) {
		case 6: return 1;
		case 5: return (isContain(user, lotto[lotto.length-1])) ? 2 : 3;
		case 4: return 4;
		case 3: return 5;
		default: return -1;
		}
		
	}
	
		
	
	
	
}
