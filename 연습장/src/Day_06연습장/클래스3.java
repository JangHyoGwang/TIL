package Day_06연습장;

public class 클래스3 {

	public static void main(String[] args) {
		 
		EzenComputerStudent std = new  EzenComputerStudent();
		std.setName("영이");
		std.setGroup("JAVA");
		std.setPhone("123- 134");
		std.printOne();
	}

}
/*  EzenComputerStudent 클래스 생성
 * 멤버변수: 지점(gigum), 이름(name), 반(group), 전화번호(phone)
 * 메서드: printOne
 * */

class EzenComputerStudent{
	private final String gigum = "강남";
	private String name;
	private String group;
	private String phone;
	
	/* 멤버 변수 출력
	 * 매개변수:
	 * 리턴타입: void
	 * 메서드명: printOne
	 * */
	
	public void printOne() {
		System.out.println("지점 : " + gigum);
		System.out.println("이름 : " + name);
		System.out.println("반 : " + group);
		System.out.println("전화번호 : " + phone);
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