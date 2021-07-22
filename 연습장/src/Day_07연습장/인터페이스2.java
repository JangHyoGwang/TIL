package Day_07연습장;

public class 인터페이스2 {

	public static void main(String[] args) {
		Tv2 tv2 = new Tv2();
		
		tv2.turnOn();
		tv2.channelUp();
		tv2.turnOff();
		System.out.println(tv2.power);

	}

}
interface Power{ // 인터페이스는 객체를 생성할 수 없음.
	public abstract void turnOn(); // 추상메서드
	public abstract void turnOff(); // 추상메서드
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
			System.out.println("채널 : " + channel);
		}else {
			System.out.println("Tv가 꺼져있습니다.");
		}
		
	}

	@Override
	public void channelDown() {
		if(power) {
			channel--;
			System.out.println("채널 : " + channel);
		}else {
			System.out.println("Tv가 꺼져있습니다.");
		}
		
	}

	@Override
	public void turnOn() {
		power = true;
		System.out.println("Tv가 켜졌습니다.");
		
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("Tv가 꺼졌습니다.");
		
	} // 구현 클래스
	
	
}