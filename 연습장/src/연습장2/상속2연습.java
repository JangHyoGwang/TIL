package 연습장2;

public class 상속2연습 {

	public static void main(String[] args) {
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
	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	// 기본생성자
	public Animal() {}
}

class Tiger extends Animal{
	public Tiger() {
		super("호랑이", "고양이과");
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
		super.howl();
		System.out.println("울음소리 : 멍멍");
	}
	
}



