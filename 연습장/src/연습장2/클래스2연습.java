package 연습장2;

public class 클래스2연습 {

	public static void main(String[] args) {
		SamsungTV tv = new SamsungTV();
		tv.turnON();
		tv.printPower();
		tv.turnOff();
		tv.printPower();
		tv.printBrand();
		
		SamsungTV tv2 = new SamsungTV();
		tv2.turnON();
		tv.printPower();
		tv2.turnOff();
		tv.printBrand();
		
	}

}
class SamsungTV{
	/* power, brand => 고정, 변하지 않는 값 (final) 
	 * */
	public boolean power = false;
	public final static String brand = "Samsung";
	
	public void turnON(){
		power = true;
	}
	
	public void turnOff() {
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