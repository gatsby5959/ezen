package Day03;

import java.util.Scanner;

public class IF03 {
	public static void main(String[] args) {
		/*
		 * 정수를 입력 받아서 2의 배수가 되는지 체크 맞다면 2배수입니다 출력 이후? 3의 배수가 맞다면 3의배수입니다. 출력
		 */
		System.out.println("정수하나 입력하세요 2의 배수인지 3의 배수인지 확인해 드릴꼐영");
		Scanner sc = new Scanner(System.in);

		int testnum1;
		double testnum2;

		testnum1 = sc.nextInt();
		System.out.println("입력하신 값이 " + testnum1 + " 이시군요");

		if (testnum1 % 2 == 0 && testnum1 % 3 == 0) {
			System.out.println("6의배수입니다.");
		} else if (testnum1 % 2 == 0) {
			System.out.println("2의 배수군요");
		} else if (testnum1 % 3 == 0) {
			System.out.println("2의 배수군요");
		} else {
			System.out.println("2의 배수나 3의 배수 모두 아닌것 같아요 나머지가 0이 아니네요 2개다");
		}
		sc.close();
		
	
//		if (testnum2 % 1.0 != 0)
//
//		{
//			System.out.println("제발 정수를 입력하세요");
//		}
//		;

	}
}
