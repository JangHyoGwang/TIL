package ������2;

public class Ŭ����2���� {

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
	/* power, brand => ����, ������ �ʴ� �� (final) 
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
			System.out.println("TV�� �������ϴ�.");
		}else {
			System.out.println("TV�� �������ϴ�.");
		}
	}
	public static void printBrand() {
		System.out.println("������ : " + brand);
	}
	
	
}