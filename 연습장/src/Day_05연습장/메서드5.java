package Day_05연습장;

public class 메서드5 {

	public static void main(String[] args) {
		int arr[] = new int[] {1, 9, 4, 3, 6, 8, 7, 0, 2, 5};
		
		System.out.print("배열의 값 : ");
		printArray(arr);
		System.out.println();
		System.out.print("오름차순 값 : ");
		sortArray(arr);
		printArray(arr);

	}

	static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				}
			}
		}
	}
	
	
	
	
	
}
