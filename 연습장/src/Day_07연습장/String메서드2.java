package Day_07연습장;

public class String메서드2 {

	public static void main(String[] args) {
		/* 5개짜리 문자배열을 생성한 후, 5개의 파일명을 입력받는 코드작성
		 * 입력 받은 파일 중 이미지 파일들만 추출하는 코드 작성
		 * 
		 * */
		
		int size = 5;
//		Scanner scan = new Scanner(System.in);
		String[] arr = new String[size];
		String[] fileName = {"이것이자바다.java", "String메서드.java", "java의 정석앞표지.jpg", "java.gif", "String.png"};
		String[] img = {"png", "gif", "jpg", "bmp"};
		
		System.out.println("---이미지 파일 리스트---");
		// 파일명 확장자 .을 기준으로 확장자만 추출
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
	/* 기능 : 배열과 찾는 문자열이 주어지면 배열에서 찾을 문자열이 있는지 없는지를 확인하여 알려주는 메서드
	 * 매개변수 : 
	 * 리턴타입 : 
	 * 메서드명 : contains
	 * */

	public static boolean contains(String[] arr, String serch) {
		// 만약의 에러에 대비
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
