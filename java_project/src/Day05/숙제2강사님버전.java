package Day05;

import java.util.Scanner;

public class 숙제2강사님버전 {
	public static void main(String[] args) {
		/*
		 * up/down 게임 1~50사이의 랜덤수를 생성하여 맞추는 게임 포문으로 무한으로 계속 돌리고 예를 들어 컴퓨터가 랜덤으로 인식한 수가
		 * 45 컴퓨터가 랜덤수를 생성하였습니다 입력> 내가 10 이라고 입력하면 up~!! 입력> 20 up~!! 입력> 50 down~!! 입력>
		 * 45 정답~!! 종료!!
		 * 
		 * 일치하면 for문 break 입력한 작으면 업 이라 띄우고 더 크면 다운 이라고 띄우면 됩니다.
		 * 
		 * 클럽에 제출
		 */

		Scanner scan = new Scanner(System.in);
		// 1~50까지의 랜덤수 생성
		int random = (int) (Math.random() * 50) + 1;
		System.out.println("컴퓨터가 랜덤수를 생성하였습니다.");
		System.out.println("5회차안에 맞추세요 횟수제한 있습니다.");
		System.out.print("정답은 오른쪽 끝에 있습니다. 보고싶으면 보세요");
		for (int i = 0; i < 170; i++) {
			System.out.print("-");
		}
		System.out.println("---> " + random);
		// While문을 사용할 경우 경환 버전
//		int j = 1;
//		while (j <= 5) {
//			int num = scan.nextInt(); // 내가 맞추는 정답
//			if (random == num) {
//				System.out.println("정답~!!");
//				System.out.println("컴퓨터수:" + random);
//				break;
//			} else if (random > num) {
//				System.out.println("up~!! " + j + " 회");
//			} else if (random < num) {
//				System.out.println("down~!! " + j + " 회");
//			}
//			if (j % 2 == 0) {
//				System.out.print(j + " ");
//			}
//			j = j + 1;
//			if (j > 5) {
//				System.out.print("기회5번을 다 소모 했습니다. 끝났습니다. 정답은 오른쪽 끝에 있습니다. 보고싶으면 보세요");
//				for (int i = 0; i < 160; i++) {
//					System.out.print("-");
//				}
//				System.out.println("---> " + random);
//			}
//		}
		
		// While문을 사용할 경우 강사님 버전
		int num = 0;
		int count = 0;
		while (num != random) { //무한일 떄는 이것이 계속 트루가 되기에 이게 true반복이 된다... !=이 true반복됨
			System.out.println("입력> ");
			num = scan.nextInt();
			count++;
			if(num > random) {
				System.out.println("down~!!" + count + "회");
			}else if(num < random) {
				System.out.println("up~!!"+ count + "회");
			}else {
				System.out.println("정답~!!");
			}
		}

// for문 사용		
//		for(int i=1;i<=5;i++) {//무한루프
//			System.out.println("입력 > ");
//			System.out.println("");
//			int num = scan.nextInt(); //내가 맞추는 정답
//			if(random == num) {
//				System.out.println("정답~!!");
//				System.out.println("컴퓨터수:"+random);
//				break;
//			}else if(random > num) {
//				System.out.println("up~!! "+ i +" 회");
//			}else if(random < num) {
//				System.out.println("down~!! "+ i +" 회");
//			}		
//		}//end for

		scan.close();

	}
}
