package Day02;

public class 연산자 {

	public static void main(String[] args) {

		// 연산자정리
		/*
		 * 대입연산자 : =, +=, -= =을 기준으로 오른쪽에 있는 값을 왼쪽에 저장 a = b : b를 a에 넣어라 (저장해라, 덮어써라) a는
		 * 반드시 변수여야만 한다. 왼쪽은 무조건 변수여야만한다. a+=b : 기존 a의 값과 현재 b의 값을 더해서 a에 자장 a = a + b
		 * == a+=b
		 */

		int a = 10;
		System.out.println("a : " + a);
		// syso 컨트롤+spacebar(코드에 대한 빠른 타이핑 : 자동완성)
		System.out.println();

		int b = 20;
		a = b;
		System.out.println("a : " + a);

		int c = 1;
		c = c + a; // c=1+20
		System.out.println("c: " + c);
		c += a; // 21+20
		System.out.println("c: " + c);
		c -= a;
		System.out.println("c: " + c);
		// 증감연산자 : ++ 1증가 / --1감소
		c++;
		System.out.println("32번줄 c: " + c);
		// (++c) : 증가하고 값을 찍는다. (c++)값을 찍고 증가
		System.out.println("33번줄 c: " + c++); // 찍는게 먼저고 나중에 증가시켜서 일단 증가시키기 전의 값이 보임
		System.out.println("34번줄 c: " + c);

		/*
		 * 산술연산자 : + - * / %(나머지) 나누기(/) 정수 / 정수 = 정수 (10 / 3 = 3) 소수점 버림 정수 / 실수 = 실수
		 * 실수 / 정수 = 실수 실수 / 실수 = 실수 값 / 0 => 예외발생 오미란曰:에러와 예외는 달라요 나중에 예외처리할거에영
		 */
		System.out.println("3+2=" + 3 + 2); // 앞에서 문자라서 모두 문자로 처리해서 그냥 붙여써버림
		System.out.println("3+2=" + (3 + 2));
		System.out.println("3*2=" + (3 * 2));
		System.out.println("3-2=" + (3 - 2));
		System.out.println("3/2=" + (3 / 2)); // 소수점 짤림
		System.out.println("3/2=" + (3 / 2.0)); // 하나를 실수형으로 바꾸면 자동으로 실수형으로 계산
//		System.out.println("3/0="+(3/0)); //아래처럼 예외생김 예외 이후 코드실행 안됨 so 주석처리
//		Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at Day02.연산자.main(연산자.java:51)
		System.out.println("(3%2)" + (3 % 2));

		/*
		 * 비교연산자 : 비교연산자의 결과는 true / false >=(이상), <=(이하), >(초과), <(미만) ==(같다), !=(같지않다)
		 * () && () => and (둘다 true 이야 true 리턴) () || () => or (둘 중 하나만 true라도 true
		 * return)
		 */

		System.out.println("3>2 ? " + (3 > 2));
		System.out.println("3<2 ? " + (3 < 2));
		System.out.println("3==2 ? " + (3 == 2));
		System.out.println("3!=2 ? " + (3 != 2));

		System.out.println(" && 연산자 결과 : " + (3 > 2 && 4 < 3));
		System.out.println(" || 연산자 결과 : " + (3 > 2 || 4 < 3));

		/*
		 * 조건선택 연산자 : 3항연산자 (조건식)?true : false
		 */
		System.out.println(3 > 2 ? "참입니다" : "거짓입니다.");

		/*
		 * 문제 num가 짝수 인지 홀수 인지 출력
		 */
		int num = 123456;
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
//		System.out.println(
//				(num / 2.0 == 1) || (num / 2.0 == 2) || (num / 2.0 == 3) || 
//				(num / 2.0 == 4) || (num / 2.0 == 5) || (num / 2.0 == 6) || 
//				(num / 2.0 == 7) || (num / 2.0 == 8) || (num / 2.0 == 9) 
//				? "짝수다" : "홀수다");
//		
//		System.out.println(
//				(num / 2.0 != 1.0) && (num / 2.0 != 2.0) && (num / 2.0 != 3.0) && 
//				(num / 2.0 != 4.0) && (num / 2.0 != 5.0) && (num / 2.0 != 6.0) && 
//				(num / 2.0 != 7.0) && (num / 2.0 != 8.0) && (num / 2.0 != 9.0) 
//				? "홀수다" : "짝수다"); 뻘짓 하지 말것...

		//문자열을 저장하는 자료형은 String
		String result = (num % 2 == 0)? "짝수" : "홀수";
		System.out.println(result);
	} // end of main

} // end of class
