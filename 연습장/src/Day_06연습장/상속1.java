package Day_06������;

public class ���1 {

	public static void main(String[] args) {
		/* Ŭ������ ���: �θ�Ŭ������ ��� ������ �޼��带 �����ִ� ��.
		 * ����ϴ� ����: ���뼺, �ڵ��� �ߺ�����
		 * �θ�Ŭ����: A �ڽ�Ŭ����: B
		 * class B extends A{
		 * }
		 * ����� �������� ������ ��������� �޼��带 ����� �� �ִ�.
		 * ��, ���������ڰ� private ���� �Ұ�.
		 * */
		B b = new B();
		b.num = 10;
		b.setA(50);
		b.print();
		System.out.println(b.getA());
	}

}

class A{
	private int a, b, c; // ���� ���� ����
	protected int num; // �ڽĵ� ���� ����
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
	
	
