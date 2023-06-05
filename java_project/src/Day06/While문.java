package Day06;

public class While문 {
	public static void main(String[] args) {
		/*
		 * 반복문중 하나 While문 while(조건식){ 조건식이 true일 때 반복 실행문; 증감식; }
		 */

		// for문을 이용하여 1~10까지 출력
		System.out.println(">> for문을 활용하여 1~10까지 출력");
		int b;
		for (int a = 1; a <= 10; a = a + 1) {
			System.out.print(a + " ");
		}
		System.out.println("");
		System.out.println("---------------------");

		// while문을 이용하여 1~10까지 출력
		System.out.println(">> while문을 활용하여 1~10까지 출력");
		int cnt = 1; // 증가변수의 선언

		while (cnt <= 10) {
			System.out.print(cnt + " ");
			cnt++;
		}

		System.out.println();
		System.out.println("----------------------");

		
		
		System.out.println(">>while문을 활용하여 1~10까지 중 짝수만 출력");
		int cnt2 = 1;
		while (cnt2 <= 10) {
			if (cnt2 % 2 == 0) {
				System.out.print(cnt2 + " ");
			}
			cnt2 = cnt2+1;
		}

	}
}
