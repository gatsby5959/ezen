package Day06;

import java.util.Scanner;

public class 숙제 {
	public static void main(String[] args) {
		/*
		 * 주사위 게임 주사위를 던져서 총 30칸을 이동하는 게임 주사위 수를 랜덤으로 생성(1~6까지 생성) -->1개의 수를 얻을것임 ex)
		 * 주사위 숫자 3 3칸 전진 ==> 27칸 남았습니다. 주사위 : 6 6칸전진 ===> 21칸 남았습니다. .... 도착~!! 총 몇번
		 * 주사위를 던진 횟수 : 10번 ===> 이동횟수 (던지다 보면 30을 넘어갈수도 있음 넘어가도 됨 30까지..)
		 */

		System.out.println("주사위 게임 시작, 아무 글자 숫자를 입력하면 주사위가 던져집니다.");
		Scanner scan = new Scanner(System.in);
		int random = 0;
		String nothing;
		int i = 0;
		int remaintarget = 30;
		for (;;) {
			nothing = scan.next();//중단
			random = (int) (Math.random() * 6) + 1;
			System.out.println("주사위 숫자 " + random);
			
			remaintarget = remaintarget - random;
			System.out.println("남은거리 " + remaintarget);
			
			i++;
			System.out.println("던진 횟수" + i);
			
			if(remaintarget <= 0) {
				System.out.println("도착");
				System.out.println("게임 종료 " + "총 던진 횟수 " + i);
				break;
			}
//			System.out.print("Hello\rWorld");
		}

	}
}
