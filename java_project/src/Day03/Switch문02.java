package Day03;

import java.util.Scanner;

public class Switch문02 {

	public static void main(String[] args) {
		/*
		 * 숙제(클럽에 제출) 정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력 연산자는 + - * / % 중 하나를 입력받기 ex) 3 2
		 * + => 3 + 2 = 5 ex) 3 2 - => 3 - 1 = 1 ex) 3 2 * => 3 * 2 = 6
		 */
		int inta, intb;
		char cha;

		System.out.println("자~ 숙제를 시작하지.");
		System.out.println("정수 2개와 연산자 하나를 입력받아 두 정수의 연산을 출력할것이다");
		System.out.println("* 연산자는 + - *  / % 중 하나를 입력받기");
		System.out.println("* ex) 3 2 +   =>   3 + 2 = 5 ");
		System.out.println("* ex) 3 2 -   =>   3 - 1 = 1 ");
		System.out.println("* ex) 3 2 *   =>   3 * 2 = 6 ");
		System.out.println("자~ 입력해라");

		Scanner sc = new Scanner(System.in);
		inta = sc.nextInt();
		intb = sc.nextInt();
		cha = sc.next().charAt(0);

		System.out.println("첫번째 숫자 " + inta);
		System.out.println("두번째 숫자 " + intb);
		System.out.println("세번째 문자 " + cha);

		switch (cha) {
		case '+':
			System.out.println(inta + " + " + intb + " = " + (inta + intb) + " 입니다.");
			break;
		case '-':
			System.out.println(inta + " - " + intb + " = " + (inta - intb) + " 입니다.");
			break;
		case '*':
			System.out.println(inta + " * " + intb + " = " + (inta * intb) + " 입니다.");
			break;
		case '/':
			System.out.println(inta + " / " + intb + " = " + Math.round(((double)inta / intb)*1000.0)/1000.0 + " 입니다.");
			break;
		case '%':
			System.out.println(inta + " % " + intb + " = " + Math.round(((double)inta % intb)*1000.0)/1000.0 + " 입니다.");
			break;
		default:
			System.out.println("모르겠다. 계산 못함");
			break;
		}
	}

}
