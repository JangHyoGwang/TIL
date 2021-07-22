package Day_07������;

public class �������̽�2 {

	public static void main(String[] args) {
		Tv2 tv2 = new Tv2();
		
		tv2.turnOn();
		tv2.channelUp();
		tv2.turnOff();
		System.out.println(tv2.power);

	}

}
interface Power{ // �������̽��� ��ü�� ������ �� ����.
	public abstract void turnOn(); // �߻�޼���
	public abstract void turnOff(); // �߻�޼���
}

interface Remocon{
	void channelUp(); 
	void channelDown();
}

class Tv2 implements Power, Remocon {
	boolean power;
	int channel = 3;

	@Override
	public void channelUp() {
		if(power) {
			channel++;
			System.out.println("ä�� : " + channel);
		}else {
			System.out.println("Tv�� �����ֽ��ϴ�.");
		}
		
	}

	@Override
	public void channelDown() {
		if(power) {
			channel--;
			System.out.println("ä�� : " + channel);
		}else {
			System.out.println("Tv�� �����ֽ��ϴ�.");
		}
		
	}

	@Override
	public void turnOn() {
		power = true;
		System.out.println("Tv�� �������ϴ�.");
		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("Tv�� �������ϴ�.");
		
	} // ���� Ŭ����
	
	
}