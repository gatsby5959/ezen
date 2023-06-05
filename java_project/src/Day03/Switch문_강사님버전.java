package Day03;

import java.util.Scanner;

public class Switch문_강사님버전 {

	public static void main(String[] args) throws Exception {
		/*
		 * 숙제(클럽에 제출) 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력 연산자는 + - * / % 중 하나를 입력받기 ex) 3 2
		 * + => 3 + 2 = 5 ex) 3 2 - => 3 - 1 = 1 ex) 3 2 * => 3 * 2 = 6
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 정수2개");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요. + - * / %");
		char op = scan.next().charAt(0); // 한글자만 받음.

		/*
		 * 숫자 = 그냥 입력 int num = 3; char (한글자)' '를 입력해서 입력받음. String (문자열)
		 */
		int result = 0;

		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		case '%':
			result = num1 % num2;
			break;
		default:
			System.out.println("잘못된 연산자입니다~~!!");
			break;
		} // end of 스위치
			// op char 형태
			// + : 더하기, +:연결연산자 (피연사자가 문자일경우)앞뒤값중 하나만 문자여도 연결연산자로 바뀌어여~
			// 3+5=8 의미없는 문자를 삽입하여 연산이 되지 않게 함.
		System.out.println("" + num1 + op + num2 + "=" + result);
	}

}
