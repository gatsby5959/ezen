package Day04;

public class For문01 {
	public static void main(String[] args) {
		/*
		 * 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법 
		 * -for, while문은 동작방식이 같다. --> 조건이 맞지 않는다면 한번도 실행안될수도 있음
		 * -do~while문은 두방식과는 조금 --> 반드시 1번은 실행
		 * 다름
		 * 
		 * for(1초기화; 2 5조건식; 4 7증감연산식){ 3 6실행문; } 초기화 : 조건식이나 실행문에서 사용하는 변수를 초기화 처음 실행시
		 * 한번만 실행 생략가능 조건식 : 반복문의 바놉긍ㄹ 결정하는 식(true->반복, false=중지) 생략 가능(무조건 true) 증감연산식
		 * : 조건식에서 사용되는 변수가 증가 / 감소되어 반복횟수를 조절 생략 가능
		 */

		// 1~10까지 출력하는 예제
		// 초기화 사용할 변수 (i) 1부터 --> int i = 1;
		// 조건식 : 변수가 10이 될때까지 --> i <=10(1~10까지)
		// 증감식 : 1씩 증가 --> i = i + 1;
		// 실행문 : i 출력
		for (int i = 1; i <= 10; i = i + 1) {
			System.out.print(i + " ");
		} // end of for
		System.out.println();
		System.out.println("------------------");
		// 10~1까지 출력하는 예제
		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		} // end of for
		System.out.println();
		System.out.println("------------------");
		// 2부터 10까지 2씩 증가(짝수만 출력)
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		} // end of for

		// 지역변수의 범위 {선언 소멸}

		/*
		 * 1부터 10까지 짝수만 출력 if문의 조건을 사용하여 조건이 true일때만 출력
		 */
		System.out.println();
		System.out.println("------------------");
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수" + i + "	");
			} else {
				System.out.println("홀수는 pass~!!!");
			}
		} // end of for

		System.out.println();
		// 1부터 10까지의 합계(1+2+3+4+...+10 = ?)
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}//end of for
		System.out.println(sum);
		
		
		
		
		
	}// end of main
}//클래스끝
