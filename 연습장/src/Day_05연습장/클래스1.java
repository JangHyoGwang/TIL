package Day_05연습장;

public class 클래스1 {
	// 멤버변수
	public static void main(String[] args) {
		Point p = new Point();

		p.x = 10;
		p.y = 20;
		
		p.setX1(40);
		p.setY1(50);
		
		p.print();

	}

}

class Point {
	
	public int x;
	public int y;
	private int x1;
	private int y1;
	
	public void print() {
		System.out.println("("+x+","+y+")");
		System.out.println("("+x1+","+y1+")");
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}
	
	
	
	
}