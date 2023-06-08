package Day10;

<<<<<<< HEAD
import java.util.Random;
import java.util.Scanner;

import Day03.Switch문01;

public class 가위바위보게임 {
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
		System.out.println();

		int random = (int) (Math.random() * 3);
		System.out.println("0가위   1바위    2보 중에 1개 입력하세요");
		Scanner sc = new Scanner(System.in);
		int myhand = sc.nextInt();

		if (random == 0) {
			System.out.println("컴퓨터 가위 " + random);
		} else if (random == 1) {
			System.out.println("컴퓨터 바위 " + random);
		} else {
			System.out.println("컴퓨터 보 " + random);
		}

		/*
		 * 숫자 = 그냥 입력 int num = 3; char (한글자)' '를 입력해서 입력받음. String (문자열)
		 */

		switch (myhand) {
		case 0:
			System.out.print("나 가위 " + myhand+"   ");
			break;
		case 1:
			System.out.print("나 바위 " + myhand+"   ");
			break;
		case 2:
			System.out.print("나 보 " + myhand+"   ");
			break;
		default:
			System.out.println("내가 낸 가위바위보가 잘못된 상황입니당~");
			break;
		} // end of 스위치

		if(myhand>=0 && myhand<=2) {
		if ((myhand > random) && !(myhand == 2 && random == 0)) {
			System.out.println("이겼습니다.");
			
		} else if(myhand == 2 && random ==0) {
			System.out.println("졌습니다. ");
		} 
		else if (myhand == random) {
			System.out.println("무승부입니다.");
		} else {
			System.out.println("졌습니다");
		}
		}
	}
}
=======
import java.util.Scanner;
public class 가위바위보게임 {
	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위바위보중 하나를 선택해서 입력
		 * 승패무의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 * 
		 * com = 1(바위)
		 * user = 가위 => 졌습니다. 
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가위, 바위, 보 게임시작>");
		int comNum = (int)(Math.random()*3); //0 1 2 중 하나
		System.out.println("컴퓨터 결정 완료~!!");
		System.out.println("가위/바위/보 중 하나 선택 > ");
		String myChoice = scan.next(); //가위, 바위, 보 중 하나
		
		//컴퓨터 상태를 String 변환
		String comChoice = (comNum==0? "가위" : comNum==1? "바위" : "보");
		System.out.println("comChoice > "+ comChoice);
		
		//비교
		if(comChoice.equals(myChoice)) {
			System.out.println("무승부");
		}else {
			if(comChoice.equals("가위")) {
				System.out.println(myChoice.equals("바위")? "승" : "패");
			}else if(comChoice.equals("바위")) {
				System.out.println(myChoice.equals("보")? "승" : "패");
			}else {
				//컴선택 = "보"
				System.out.println(myChoice.equals("가위")? "승" : "패");
			}
		}
		
		System.out.println("종료~!!");
	}
}
>>>>>>> 1f79ec77ed0d00f1aab2af77788ea759628a3dde
