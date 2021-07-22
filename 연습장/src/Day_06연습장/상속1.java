package Day_06연습장;

public class 상속1 {

	public static void main(String[] args) {
		/* 클래스의 상속: 부모클래스의 멤버 변수와 메서드를 물려주느 것.
		 * 상속하는 이유: 재사용성, 코드의 중복제거
		 * 부모클래스: A 자식클래스: B
		 * class B extends A{
		 * }
		 * 상속을 받으려면 보모의 멤버변수와 메서드를 사용할 수 있다.
		 * 단, 접근제어자가 private 접근 불가.
		 * */
		B b = new B();
		b.num = 10;
		b.setA(50);
		b.print();
		System.out.println(b.getA());
	}

}

class A{
	private int a, b, c; // 나만 접근 가능
	protected int num; // 자식도 접근 가능
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public void setA(int a) {
		this.a = a;
	}
}
	
class B extends A{
	private int d, e, f;
	public void print() {
		System.out.println(num);
		System.out.println(getA());
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getF() {
		return f;
	}
	public void setF(int f) {
		this.f = f;
	}
	
	
	}
	
	
