package Day06;

import java.util.Scanner;

public class 소수구하기 {
	public static void main(String[] args) {
		/*
		 * 소수 : 약수가 1과 자기자식만의 수만 가지는 수를 소수 소수 : 3, 5, 7, 11, 13, 17 .... 소수는 약수가 2개인
		 * 수(1과, 나 자신)
		 */
		/*
		 * num를 입력 받아서 num가 소수인지 아닌지 판별 ex ) num = 13 : 소수입니다. ex ) num = 12 : 소수가 아닙니다.
		 */
//		int num;
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력해주세요~!!");
//		num = scan.nextInt();
//		System.out.println(num);
//		//약수관련 구하기-----------------------------------------S
//		System.out.print(num + " 의 약수는 "); 
//		int numcount = 0; //약수의 개수를 세기 위한 변수
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) { //약수의 조건
//				//약수가 발생되었다.
//				System.out.print(i);
//				numcount = numcount +1;
//				if (i != num) {
//					System.out.print(", ");
//				}
//			}		
//		}
//		System.out.println(" 입니다.");
//		System.out.println("약수가 " + numcount + "개 입니다"); 
//		//약수관련 구하기-----------------------------------------E
//		
//		//---------------------------------------------S
//		if(numcount==2) {
//			System.out.println("소수입니다."); //소수관련 구하기
//		}else {
//			System.out.println("소수가 아닙니다.");
//		}
//		//---------------------------------------------E

		// 2~100까지 소수를 출력 == num
		int cnt = 0;
		for (int i = 2; i <= 100; i++) { // 2~100까지의 수
			cnt = 0; // 다음수의 약수의 개수를 정확히 구하기 위해 초기화
			for (int j = 1; j <= i; j++) { // 나누는 수
				if (i % j == 0) {
					cnt++;
				}
			}
			// 약수개수가 2개인지 체크
			if (cnt == 2) {
				System.out.println(i + " ");
			}
		}

		scan.close();

	}
}
