package Day10;

import java.util.Scanner;

public class 숙제 {
	public static void main(String[] args) {
		
		/*
		 * 야구게임
		 * 컴퓨터가 3자리 숫자를 생성 (각자리 수는 1~9까지의 수)
		 * 유저는 3자리의 숫자를 맞추는 게임입니다. ?????????????????????????????????????????
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball, 아무것도 안맞으면 out
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
		int[] com_random_arr = new int[3];
		int[] user_input_arr = new int[3];
		
		
		System.out.print("컴터숫자배열 : ");
		for(int i=0; i<3 ; i++) {
			com_random_arr[i] = random();
			
			System.out.print(" " + com_random_arr[i]);
		}
		System.out.println();
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int user_input_int = 0 ;
		System.out.println("유저는 3자리의 숫자를 맞추는 게임입니다. 1~9를 입력해주세영");
		for(int i=0; i<3; i++) {
			System.out.println(i+1 + " 번째 값을 입력해주세용");
			user_input_arr[i]= sc.nextInt();
		}
		
		System.out.print("사용자 번호 : ");
		for(int i=0; i<3; i++) {
		System.out.print(+ user_input_arr[i] + " ");
		}
		
		//비교
		if(com_random_arr.equals(user_input_arr)) {
			System.out.println("3s 종료");
		}else {
			System.out.println("3s는 아님");
		}
		
	}
	
	
	
	
	
	public static int random(){
		//1~45까지의 랜덤수 추출
		//(int)(Math.random()*n)+start;
		int random = (int)(Math.random()*9)+1;
		return random;
	}
	
	

	
}
