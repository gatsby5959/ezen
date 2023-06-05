package Day02;

public class IF01 {
	public static void main(String[] args) {
		/*
		 * if(조건식){실행문;} 실행문이 1줄인경우 생략가능합니다 권장안해요 조건문(if) 조건문이 참이면 실행문을 실행해라~~~~~~~
		 * 
		 */
		int num = 10;
		// num가 0보다 크면 양수입니다.
		if (num > 0) {
			System.out.println("양수입니다.");
		}

		// num가 0보다 작으면 음수입니다.
		if (num < 0) {
			System.out.println("음수입니다.");
		}

		num = 11;
		// num가 0보다 크면 양수 아니면 음수
		if (num > 0) {
			System.out.println("양수");
			if (num > 10) {
				System.out.println("10보다 커여");
			}
		} else {
			System.out.println("음수");
		}

		num = 15;
		// num가 0보다 크면 양수, 0과 같으면 0, 0보다 작으면 음수
		if (num > 0) {
			System.out.println("양수");
		} else if (num == 0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}

		// num2의 변수에 값을 지정하고, num2가 짝수면 짝수 아니면 홀수면 홀수라고 출력하세요
		int num2 = 4;

		if (num2 % 2 == 0) {
			// 나머지가 0이니 짝수얌 근데 0도 짝수니 그럼?... 짝수로 치자....
			System.out.println(num2 + " 는(은) 짝수");
		} else {
			// 짝수 아니면 어자피 다 홀수얌
			System.out.println(num2 + " 는(은) 홀수");
		}

	}
}
