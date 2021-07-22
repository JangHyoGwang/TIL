package Day_06연습장;

public class 상속2 {

	public static void main(String[] args) {
		/* 오버라이딩: 부모 클래스에 물려받은 메서드를 재정의
		 * 부모 클래스의 메서드 선언부와 일치해야 한다.
		 * 접근제어자의 범위를 축소할 수 없다.
		 * */
		Tiger t1 = new Tiger();
		t1.info();
		t1.howl();
		Dog d1 = new Dog();
		d1.info();
		d1.howl();

	}

}
class Animal{
	private String name;
	private String category;
	public void info() {
		System.out.println("---------------");
		System.out.println("이름 : " + name);
		System.out.println("분류 : " + category);
		System.out.println("---------------");
		
	}
	public void howl() {
		System.out.println("울음소리");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	// 생성자
	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	// 기본 생성자
	public Animal() {}
}
  
class Tiger extends Animal{
	public Tiger() {
		// super은 부모를 가르키는 참조변수, super() 부모의 생성자
		super("호랑이" , "고양이과");
	}

	@Override
	public void howl() {
		System.out.println("울음소리 : 어흥");
	}
	
}

class Dog extends Animal{
	public Dog() {
		super("강아지", "개과");
	}

	@Override
	public void howl() {
		super.howl(); // 부모의 값을 호출
		System.out.println("울음소리 : 멍멍");
	}
	
}



