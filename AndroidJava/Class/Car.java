// 기본구조
public class Car {
	String color;
	int speed = 0;
	
	// Car 생성자
	Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
	
	// 메소드 오버로딩 추가
	Car(int speed) {
		this.speed = speed;
	}
	
	Car() {
		
	}
	
	int getSpeed() {
		return speed;
	}
	
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
	
	String getColor() {
		return color;
	}
}
