// Animal 상속받은 클래스, 추상메소드 move 구현!
class Tiger extends Animal{
	int age;
	@Override
	void move() {
		System.out.println("네발로 이동한다");
	}
}