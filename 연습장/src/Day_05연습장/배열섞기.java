package Day_05연습장;

public class 배열섞기 {

	public static void main(String[] args) {
		int size = 10;
		
		int[] arr = new int [size];
		for(int i =0; i<arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int min = 0;
		int max = arr.length-1;
		
		for(int i=0; i<arr.length; i++) {
			int j = (int) (Math.random()*(max-min+1)+min);
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		System.out.println();
		for(int tmp : arr) {
			System.out.print(tmp + " ");
		}
		
		
		
		
	}

}
