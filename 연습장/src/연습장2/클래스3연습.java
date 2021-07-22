package 연습장2;

public class 클래스3연습 {

	public static void main(String[] args) {
		
		EzenComputerStudent std = new EzenComputerStudent();
		std.setName("영이");
		std.setGroup("JAVA");
		std.setPhone("123-1234");
		std.printOne();

	}

}

class  EzenComputerStudent{
	private final String gigum = "강남";
	private String name;
	private String phone;
	private String group;
	
	public void printOne(){
		System.out.println("지점 : " + gigum);
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("반 : " + group);
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