// 익명 내부 클래스 예제
interface clickListener {
	public void print();
}

public class exam13 {
	public static void main(String[] args) {
		
		// 익명 내부클래스를 생성하는 형식
		clickListener listener =
				(new clickListener() {
					public void print() {
						System.out.println("클릭 리스너입니다.");
					}
				});
		
		listener.print();
	}
}
