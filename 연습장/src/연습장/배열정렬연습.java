package ������;

public class �迭���Ŀ��� {

	public static void main(String[] args) {
		
		int size = 10;
		int min = 1;
		int max = 45;
		int[] arr = new int[size];
		System.out.print("���� �� : ");
		
		for(int i=0; i<arr.length; i++) {
			int random = (int) (Math.random()*max-min+1)+1;
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		

		
		
		
		
	}

}
