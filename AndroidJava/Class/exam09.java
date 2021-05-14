// Automobile 클래스를 사용하는 예제
public class exam09 {
	public static void main(String[] args) {
		Automobile auto = new Automobile();
		
		auto.upSpeed(250);
		System.out.println("승용차의 속도는 " + auto.getSpeed() + "km입니다.");
	}
}