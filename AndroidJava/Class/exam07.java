// Car 클래스 인스턴스로 생성하기
public class exam07 {
	public static void main(String[] args) {
		// myCar 객체 생성
		Car myCar1 = new Car("빨강", 0);
		Car myCar2 = new Car("파랑", 0);
		Car myCar3 = new Car("초록", 0);
		
		
		// myCar1 객체 이용 및 결과 출력
		myCar1.upSpeed(50);
		System.out.println("자동차1의 색상은 " + myCar1.getColor()
				+ "이며, 속도는 "
				+ myCar1.getSpeed() + "km입니다.");
		
		// myCar2 객체 이용 및 결과 출력
		myCar2.downSpeed(50);
		System.out.println("자동차2의 색상은 " + myCar2.getColor()
				+ "이며, 속도는 "
				+ myCar2.getSpeed() + "km입니다.");
		
		// myCar3 객체 이용 및 결과 출력
		myCar3.upSpeed(250);
		System.out.println("자동차3의 색상은 " + myCar3.getColor()
				+ "이며, 속도는 "
				+ myCar3.getSpeed() + "km입니다.");
	}
}
