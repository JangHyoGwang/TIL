package Day_06������;

public class Ŭ����3 {

	public static void main(String[] args) {
		 
		EzenComputerStudent std = new  EzenComputerStudent();
		std.setName("����");
		std.setGroup("JAVA");
		std.setPhone("123- 134");
		std.printOne();
	}

}
/*  EzenComputerStudent Ŭ���� ����
 * �������: ����(gigum), �̸�(name), ��(group), ��ȭ��ȣ(phone)
 * �޼���: printOne
 * */

class EzenComputerStudent{
	private final String gigum = "����";
	private String name;
	private String group;
	private String phone;
	
	/* ��� ���� ���
	 * �Ű�����:
	 * ����Ÿ��: void
	 * �޼����: printOne
	 * */
	
	public void printOne() {
		System.out.println("���� : " + gigum);
		System.out.println("�̸� : " + name);
		System.out.println("�� : " + group);
		System.out.println("��ȭ��ȣ : " + phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGigum() {
		return gigum;
	}
	
	
}