package Day_07연습장;

public class 예외처리1 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			// 예외가 발생할 수 있는 구문
			System.out.println(3);
			System.out.println(0/0); // 예외가 발생하는 구문
			System.out.println(4); // 예외문제가 발생하면 그 다음부터는 출력이 되지 않음.
		}catch(Exception e) {
			e.printStackTrace(); // 스택에 입력된 예외 메세지를 출력
			System.out.println("예외 메세지 : " + e.getMessage());
		}
		System.out.println(5);
	}
}


