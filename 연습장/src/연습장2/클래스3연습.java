package ������2;

public class Ŭ����3���� {

	public static void main(String[] args) {
		
		EzenComputerStudent std = new EzenComputerStudent();
		std.setName("����");
		std.setGroup("JAVA");
		std.setPhone("123-1234");
		std.printOne();

	}

}

class  EzenComputerStudent{
	private final String gigum = "����";
	private String name;
	private String phone;
	private String group;
	
	public void printOne(){
		System.out.println("���� : " + gigum);
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("�� : " + group);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGigum() {
		return gigum;
	}
	
	
	
	
}