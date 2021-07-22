package 연습장;

public class 배열복사연습 {

	public static void main(String[] args) {
		int[] arr = new int[] {9 ,6, 0, 1, 1, 7};
		int[] arr1 = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.arraycopy(arr, 0, arr1, 3, arr.length);
		
		System.out.println();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}

	}

}
