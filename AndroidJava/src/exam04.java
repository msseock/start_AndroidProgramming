// for, while
public class exam04 {
	public static void main(String[] args) {
		// one 배열 선언 및 초기화
		int one[] = new int[3];
		for (int i = 0; i < one.length; i++) {
			one[i] = 10 * i;
		}
		
		// two 배열 선언과 대입 한 번에, for문을 사용해서 출력
		String two[] = { "하나", "둘", "셋" };
		for (String str:two) { // 배열을 지원하는 for문의 형식
			System.out.println(str);
		}
		
		// one 배열 while문으로 출력
		int j = 0;
		while (j < one.length) {
			System.out.println(one[j]);
			j++;
		}
	}

}
