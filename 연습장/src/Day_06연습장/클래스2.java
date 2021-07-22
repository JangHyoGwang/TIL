package Day_06연습장;

public class 클래스2 {

	public static void main(String[] args) {
		
		SamsungTV tv = new SamsungTV();
		tv.trunOM();
		tv.printPower();
		tv.trunOff();
		tv.printPower();
		tv.printBrand();
		
		SamsungTV tv2 = new SamsungTV();
		tv2.trunOM();
		tv2.printPower();
	}

}

class SamsungTV{
	/* power, brand => 고정, 변하지 않는 값 (final) 
	 * */
	private boolean power = false;
	public final static String brand = "Samsung";
	
	public void trunOM() {
		power = true;
	}
	
	public void trunOff() {
		power = false;
	}
	public void printPower() {
		if(power) {
			System.out.println("TV가 켜졌습니다.");
		}else {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	public static void printBrand() {
		System.out.println("제조사 : " + brand);
	}
	
	
}