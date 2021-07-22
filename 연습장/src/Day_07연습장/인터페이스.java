package Day_07연습장;

public class 인터페이스 {

	public static void main(String[] args) {
		Animal2 b = new Dog2();
		b.name = "강아지";
		b.category = "개과";
		b.info();
		b.howl();

		Animal2 c = new Tiger2();
		c.name = "호랑이";
		c.category = "고양이과";
		c.info();
		c.howl();
	}

}
// 추상 메서드를 포함하는 추상 클래스 생성
abstract class Animal2{
	public String name;
	public String category;
	public void info() {
		System.out.println("-------------------");
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);
		System.out.println("-------------------");
	}
	// 구현부가 없는 추상메서드
	public abstract void howl(); //추상메서드는 ;로 끝난다.
}
// 추상 클래스를 상속받은 클래스는 추상클래스가 아니라 반드시 구현.
// 부모의 추상 메서드를 반드시 오버라이딩 해야한다. (구현)
class Dog2 extends Animal2{

	@Override
	public void howl() {
		System.out.println("멍멍~!!");
		
	}
	
}
class Tiger2 extends Animal2{

	@Override
	public void howl() {
		System.out.println("어흥~!!");
		
	}
	
}





