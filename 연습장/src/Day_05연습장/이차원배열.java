package Day_05������;

public class �������迭 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][3];
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++ ) {
				arr[i][j] = cnt;
				cnt++;
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}
