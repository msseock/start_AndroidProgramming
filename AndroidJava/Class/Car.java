// 기본구조
public class Car {
	// 필드 선언
	String color;
	int speed = 0;
	static int carCount = 0; 			// 정적 필드
	final static int MAXSPEED = 200;	// 상수 필드
	final static int MINSPEED = 0;		// 상수 필드
	
	// 정적 메소드 currentCarCount()
	static int currentCarCount() {
		return carCount;
	}
	
	// Car 생성자
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
		carCount++;
	}
	
	// 메소드 오버로딩 추가
	Car(int speed) {
		this.speed = speed;
	}
	
	Car() {
		
	}
	
	// speed 반환 메소드
	int getSpeed() {
		return speed;
	}
	
	// speed 조정 메소드 upSpeed(), downSpeed()
	void upSpeed(int value) {
		if(speed + value >= 200)
			speed = 200;
		else
			speed = speed + value;
	}
	
	void downSpeed(int value) {
		if (speed - value <= 0)
			speed = 0;
		else
			speed = speed - value;
	}
	
	// color 반환 메소드 getColor()
	String getColor() {
		return color;
	}
}
