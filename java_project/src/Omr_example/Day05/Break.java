package Omr_example.Day05;

import java.util.Scanner;
public class Break {
	public static void main(String[] args) {
		/* break문 : 반복문을 빠져나오게 하는 키워드
		 * - 반복문에서 조건문(if)을 동반하여 조건에 맞을 때 반복문을 벗어나는 역할
		 * */
		
		/* 1~10까지 출력
		 * 초기값, 증감식 그대로 있고, 
		 * 조건식을 생략하고, break를 이용
		 * */
		for(int i=1; ;i++) {
			System.out.print(i+" ");
			if(i==10) {
				break;
			}
		}
		System.out.println();
		System.out.println("-------------");
		
		/* 한글자를 입력받아 글자를 출력(반복해서 출력)
		 * y를 입력받으면 종료
		 * a->a b->b c->c y->종료
		 * */
		Scanner scan = new Scanner(System.in);
		for(;;) { //무한루프
			System.out.println("한글자 입력 > ");
			char a = scan.next().charAt(0);
			if(a =='y' || a=='Y') {
				System.out.println("종료~!!");
				break;
			}
		}
		
		scan.close();
	}
}
