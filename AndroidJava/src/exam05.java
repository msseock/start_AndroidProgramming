// 메소드와 전역변수, 지역변수
public class exam05 {
	static int var = 100;
	public static void main(String[] args) {
		int var = 0;
		System.out.println(var); // 지역변수 우선 출력
		
		int sum = addFunction(10, 20);
		System.out.println(sum);
	}
	
	static int addFunction(int num1, int num2) {
		int hap;
		hap = num1 + num2 + var;
		return hap;
	}

}
