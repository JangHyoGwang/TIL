package ������2;

public class �޼���7_�������ڿ��� {

	public static void main(String[] args) {
		System.out.println(sum(5, 7, 8));
		System.out.println(sum(5, 7, 8, 9 ,5, 10));

	}
	public static int sum(int...num) {
		int res = 0;
		for(int tmp : num) {
			res+=tmp;
		}
		return res;
	}
	
}
