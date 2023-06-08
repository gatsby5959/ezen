package Day10;

import java.util.Scanner;

public class 숙제정답 {
	public static void main(String[] args) {
		
		/*
		 * 야구게임
		 * 컴퓨터가 3자리 숫자를 생성 (각자리 수는 1~9까지의 수)
		 * 유저는 3자리의 숫자를 맞추는 게임입니다. ?????????????????????????????????????????
		 * 자리와 숫자가 일치하면 strike   자리 + 숫자 => strke
		 * 숫자만 맞으면 ball, 아무것도 안맞으면 out  자리 X 숮자 O ===> ball
		 * 
		 * ex)컴퓨터 생성번호 : 1 2 3
		 * 사용자 번호 : 1 7 8  => 1s
		 * 사용자 번호 : 1 3 2  => 1s 2b
		 * 사용자 번호 : 7 8 9  => out
		 * 사용자 번호 : 1 2 3  => 3s 종료
		 */
		/*
		 * 각자리의 숫자를 배열로 넣고 시작
		 */		
		 
		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3]; //컴퓨터 숫자 배열
		int myNum[] = new int[3]; //내 배열
	
//		//앞에서 썼던 메서드 호출방식
//		System.out.println("--comNum--");
//		// static 의 특징 객체를 만들지 않고 클래스명으로 호출가능.
//		// 객체 생성 후 메서드 호출 (일반적인 방법)
//		Method07_lotto me = new Method07_lotto();
//		me.randomArray(comNum);
//		me.printArray(comNum);
//		
//		System.out.println("--myNum--");
//		Method07_lotto.randomArray(myNum);
//		Method07_lotto.printArray(myNum);
		
		// comNum 중복되지 않게 랜덤수를 추출 저장
		for(int i=0; i<comNum.length; i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(comNum[j] == comNum[i]) {
					i--;
					break;
				}
			}
		}
		
		//결과 체크
		for(int a : comNum) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		while(true) {
			int stk = 0;
			int ball = 0;
			System.out.println("숫자 입력 > ");
			//문자로 입력받기
			String myStr = scan.next(); // 숫자를 문자로 받음
			String[] myNumStr = myStr.split(""); // 한글자 마다 잘라서 배열로 저장
			for(int i = 0; i<myNum.length; i++) {
				//문자를 숫자로 변환해서 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
			
//			for(int temp : myNum) {
//				System.out.println(temp+ " ");
//			}
			
			//숫자 비교
			for(int i = 0; i<comNum.length; i++) {
				for(int j = 0; j< myNum.length; j++) {
					if(comNum[i] == myNum[j] && i == j) {
						stk++;
					}else if(comNum[i] == myNum[j] && i != j) {
						
					}
				}
			}
			
		}
		

	}
}
