package Day05;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
		/*
		 * break문 : 반복문을 빠져나오게 하는 키워드 - 반복문에서 조건문(if)을 동반하여 조건에 맞을 때 반복문을 벗어나는 역할
		 */
		/*
		 * 1~10까지 출력 조건식을 생략하고, break를 이용하여 1부터10까지 출력 초기값 증감식은 그대로 있고
		 */
		for (int i = 1;; i++) {
			System.out.print(i + " ");
			if (i == 10) {
				break;
			}
		}

		System.out.println("");
		System.out.println("---------------------");

		/*
		 * 한글자를 입력 받아 글자를 출력 (반복하여 출력) 
		 * y를 입력 받으면 종료
		 * a->a   b->b   c->c   y-->종료
		 */
		System.out.println("잘못짜서... 일단 String 방식으로 입력하세요     y는 입력 탈출입니다.");
		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			System.out.println(str);
			if (str.equals("y")|| str.equals("Y")) {
				break;
			}
		}
		System.out.println("종료");
		System.out.println("String while탈출 입력중단완료");

		System.out.println("string이 아니라 char로 재시작 첫 한글자만 인식합니다.    y는 입력 탈출입니다.");
		for(;;) { //무한루프
			System.out.println("한글자 입력 > ");
			char ch = scan.next().charAt(0);
			System.out.println(ch);
			if (ch == 'y' || ch =='Y') {
				break;
			}
		}
		System.out.println("char while탈출 입력중단완료");
		System.out.println("종료~!!");
		System.out.println("완전종료");
		scan.close();

//		a: for (int i = 1;; i++) {
//			System.out.print(i+" ");
//			if (i == 10) {
//				break a;
//			}
//		}
//		System.out.println();
//		for (int i = 1;; i++) {
//			System.out.print(i+" ");
//			if (i == 10) {
//				break;
//			}
//		}

	}
}
