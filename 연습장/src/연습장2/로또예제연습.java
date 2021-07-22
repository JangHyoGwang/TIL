package 연습장2;

public class 로또예제연습 {

	public static void main(String[] args) {
		int size = 6;
		int max = 45;
		int min = 1;
		int[] user = new int[6];
		int[] lotto = new int[7];
//		int arr[] = new int[size];
		System.out.print("랜덤 생성한 값 : ");
		System.out.print(random(45, 1));
		
		randomArray(user, max, min);
		randomArray(lotto, max, min);
		System.out.println();
		System.out.println("====사용자 번호====");
		printArray(user);
		System.out.println("====로또 당첨번호====");
		printArray(lotto);
		
		int rank = lottoRank(user, lotto);
		if(rank == -1) {
			System.out.println("꽝입니다~!! 다음기회에");
		}else {
			System.out.println("축하합니다 " + rank+ "등입니다.");
		}
		

	}
	/* 기능: 원하는 범위 랜덤 값을 1개 생성해서 알려주는 메서드
	 * 매개변수: int max, int min (범위 조절을 위해서...)
	 * 리턴타입: int
	 * 메서드명: random
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
	
	
	/* 기능: 주어진 배열(사용자 번호, 당첨번호)에 모든 번지에 있는 값을 랜덤으로 설정하는 메서드
	 * 매개변수: int[] arr, int max, int min
	 * 리턴타입: void
	 * 메서드명: randomArray
	 * */
	
	public static void randomArray(int[] arr, int max, int min) {
		if((max-min+1) < arr.length) {
			System.out.println("범위가 작습니다.");
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
	
	
	
	
	
	/* 기능: 배열의 특정값의 유무를 확인하는 기능
	 * 매개변수: 배열 int arr[], 특정 값 int num
	 * 리턴타입: boolean 특정갑이 있으면 true 특정값이 없으면 false
	 * 메서드명: isContain
	 * */
	
	public static boolean isContain(int arr[], int num) {
		for(int tmp : arr) {
			if(tmp == num) {
				return true;
			}
		}
		return false;
	}
	
	
	/* 기능: 배열을 출력하는 메서드
	 * 매개변수: 배열 int[] arr
	 * 리턴타입: void => 출력
	 * 메서드명: printArray
	 * */
	
	public static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	
	
	/* 기능: 배열에 대한 순위를 결정하는 메서드 (등수에 없으면 -1을 리턴)
	 * 매개변수: 사용자 번호 => int[] user, int[] lotto
	 * 리턴타입: int
	 * 메서드명: lottoRank
	 * */
	
	public static int lottoRank(int[] user, int[] lotto) {
		if(lotto.length <= user.length) {
			return -1;
		}
		int cnt = 0; // user와 lotto가 일치하는 개수
		for(int i=0; i<user.length; i++) { // 6개만 보기 위해서 user를 사용
			// 해당번호가 배열에 있는지 확인
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
