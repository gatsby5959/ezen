package Omr_example.Day05;

import java.util.Scanner;
public class 숙제 {
	public static void main(String[] args) {
		/* up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * 예) 컴퓨터가 랜덤 생성 수 : 45
		 * 컴퓨터가 랜덤수를 생성하였습니다.
		 * 입력> 10
		 * up~!!
		 * 입력> 20
		 * up~!!
		 * 입력> 50
		 * down~!!
		 * 입력> 45
		 * 정답~!! 종료!!
		 * 클럽에 제출
		 * */
		
		Scanner scan = new Scanner(System.in);
		//1~50까지의 랜덤수 생성
		int random = (int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다.~!!");
		System.out.println("회차제한 : 5회~!!");
		//while문을 사용할 경우
		int num=0;
		int count=0;
		while(num != random) {
			System.out.println("입력> ");
			num = scan.nextInt();
			count++;
			if(num > random) {
				System.out.println("down~!! " + count+"회");
			}else if(num < random) {
				System.out.println("up~!! " + count+"회");
			}else {
				System.out.println("정답~!!");
			}
		}
		
		
		
		
		
		//for문 사용
//		for(int i=1;i<=5;i++) {  //무한루프
//			System.out.println("입력 > ");
//			int num = scan.nextInt(); //내가 맞추는 정답
//			
//			if(random == num) {
//				System.out.println("정답~!!");
//				System.out.println("컴퓨터수:"+random);
//				break;
//			}else if(random > num) {
//				System.out.println("up~!! " + i+"회");
//			}else if(random < num) {
//				System.out.println("down~!! "+ i+"회");
//			}
//		}
		
		
		
		
		scan.close();
	}
}
