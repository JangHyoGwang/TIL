package Day_06������;

public class Ŭ����2 {

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
	/* power, brand => ����, ������ �ʴ� �� (final) 
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
			System.out.println("TV�� �������ϴ�.");
		}else {
			System.out.println("TV�� �������ϴ�.");
		}
	}
	public static void printBrand() {
		System.out.println("������ : " + brand);
	}
	
	
}