package Omr_example.Day07;

import java.util.Scanner;
public class doWhileEx01 {
	public static void main(String[] args) {
		/* do~while 문을 이용하여 
		 * 값을 입력하면 그대로 출력
		 * 단. y/Y가 입력되면 종료
		 * */
		
		//1~10까지 출력
		int i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		char ch;
		//무한루프
		do {
			System.out.print("한글자를 입력 (y/Y:종료):");
			ch=scan.next().charAt(0);
			System.out.println();
			System.out.println(ch);
//			if(ch=='y'||ch=='Y') {
//				System.out.println("종료");
//				break;
//			}
			
		}while(!(ch=='y'||ch=='Y'));
		System.out.println("종료");
	}
}
