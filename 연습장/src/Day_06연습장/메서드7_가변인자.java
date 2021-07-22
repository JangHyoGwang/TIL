package Day_06연습장;

public class 메서드7_가변인자 {

	public static void main(String[] args) {
		System.out.println(sum(1, 2));
		System.out.println(sum(1, 5, 6, 7, 9));
		System.out.println(sum(5, 8, 70, 15));
	}
	public static int sum(int...num) {
	int res = 0;
	for(int tmp : num) {
		res = res + tmp;
		}
	return res;
	}
}
