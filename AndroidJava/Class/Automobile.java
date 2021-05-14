// Car 클래스를 상속받는 서브클래스(subclass) Automobile
public class Automobile extends Car {
	int seatNum;
	
	int getSeatNum() {
		return seatNum;
	}
	
	// Car 클래스의 upSpeed() 메소드를 오버라이딩
	void upSpeed(int value) {
		if (speed + value >= 300) {
			speed = 300;
		}
		else
			speed = speed + (int)value;
	}
}
