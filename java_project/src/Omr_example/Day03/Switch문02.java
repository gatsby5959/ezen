package Omr_example.Day03;

import java.util.Scanner;
public class Switch문02 {
	public static void main(String[] args) {
		/* 숙제 (클럽에 제출)
		 * 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력
		 * 연산자는 + - * / % 중 하나를 입력받기
		 * ex) 3 2 +   => 3 + 2 = 5
		 * ex) 3 2 -   => 3 - 2 = 1
		 * ex) 3 2 *   => 3 * 2 = 6
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요. (정수 2개)");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요. (+ - * / %)");
		char op = scan.next().charAt(0); //한글자만 받음
		
		/* 숫자 = 그냥 입력  int num = 3;
		 * char (한글자) '' 값을 입력받음.
		 * String (문자열) " " 값을 입력받음.
		 * */
		int result=0;
		switch(op) {
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
				System.out.println("잘못된 연산자 입니다.~!!");
				break;
		}
		//op char 형태 : 정수 자료형
		// + : 더하기, + : 연결연산자 (피연산자가 문자일경우)
		// 3 + 5 = 8 => 의미 없는 문자를 삽입하여 연산이되지 않게함.
		System.out.println(num1+"" + op + num2 + "="+result);
	}
}

