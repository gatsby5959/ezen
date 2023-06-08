package Day10;

import java.util.Random;
import java.util.Scanner;

import Day03.Switch문01;

public class 가위바위보게임2 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위,1.바위, 2보) 
		 * 내가 가위바위보 중 하나를 선택하여 입력 
		 * 승패무의 결과를 출력 
		 * 
		 * ex)
		 * com = 0 (가위) 
		 * user = 가위 = 우승부입니다. 
		 * 
		 * com = 1(바위) 
		 * user = 가위 => 졌습니다
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임시작");
		
		int comNum = (int)(Math.random()*3);
		System.out.println("컴퓨터 결정 완료~!!");
		System.out.println("가위/바위/보 중 하나 선택 >");
		String myChoice = scan.next();
		
		//컴퓨터 상태를 String으로 변환
		String comChoice = (comNum ==0? "가위" : comNum==1?"바위" :"보");
		System.out.println("comChoice > " + comChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")){
				System.out.println(myChoice.equals("바위")?"승":"패");
			}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")?"승":"패");
			}else {
				//컴선택 = "보"
				System.out.println(myChoice.equals("가위")?"승":"패");
			}
		}
		
		System.out.println("종료~!!");
		
	
	}
}
