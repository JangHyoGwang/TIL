package Day_07������;

public class �������̽� {

	public static void main(String[] args) {
		Animal2 b = new Dog2();
		b.name = "������";
		b.category = "����";
		b.info();
		b.howl();

		Animal2 c = new Tiger2();
		c.name = "ȣ����";
		c.category = "����̰�";
		c.info();
		c.howl();
	}

}
// �߻� �޼��带 �����ϴ� �߻� Ŭ���� ����
abstract class Animal2{
	public String name;
	public String category;
	public void info() {
		System.out.println("-------------------");
		System.out.println("�̸� : " + name);
		System.out.println("�з� : " + category);
		System.out.println("-------------------");
	}
	// �����ΰ� ���� �߻�޼���
	public abstract void howl(); //�߻�޼���� ;�� ������.
}
// �߻� Ŭ������ ��ӹ��� Ŭ������ �߻�Ŭ������ �ƴ϶� �ݵ�� ����.
// �θ��� �߻� �޼��带 �ݵ�� �������̵� �ؾ��Ѵ�. (����)
class Dog2 extends Animal2{

	@Override
	public void howl() {
		System.out.println("�۸�~!!");
		
	}
	
}
class Tiger2 extends Animal2{

	@Override
	public void howl() {
		System.out.println("����~!!");
		
	}
	
}





