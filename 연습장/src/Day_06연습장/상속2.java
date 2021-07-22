package Day_06������;

public class ���2 {

	public static void main(String[] args) {
		/* �������̵�: �θ� Ŭ������ �������� �޼��带 ������
		 * �θ� Ŭ������ �޼��� ����ο� ��ġ�ؾ� �Ѵ�.
		 * ������������ ������ ����� �� ����.
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
		System.out.println("�̸� : " + name);
		System.out.println("�з� : " + category);
		System.out.println("---------------");
		
	}
	public void howl() {
		System.out.println("�����Ҹ�");
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
	// ������
	public Animal(String name, String category) {
		super();
		this.name = name;
		this.category = category;
	}
	// �⺻ ������
	public Animal() {}
}
  
class Tiger extends Animal{
	public Tiger() {
		// super�� �θ� ����Ű�� ��������, super() �θ��� ������
		super("ȣ����" , "����̰�");
	}

	@Override
	public void howl() {
		System.out.println("�����Ҹ� : ����");
	}
	
}

class Dog extends Animal{
	public Dog() {
		super("������", "����");
	}

	@Override
	public void howl() {
		super.howl(); // �θ��� ���� ȣ��
		System.out.println("�����Ҹ� : �۸�");
	}
	
}



