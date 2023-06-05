package Day05;

import java.util.Scanner;

public class For문04강사님버전 {
	/*
	 * 최대공약수 찾기 두 정수 num1, num2를 입력받아 최대 공약수를 출력 공약수 : 두 정수의 약수 중 공통적으로 있는 약수(공약수)
	 * 최대공약수 : 공약수 중 가장 큰 값 8 , 12 공약수 8 : 1 2 4 8 12 : 1 2 4 6 12 공약수 : 1 2 4 ====>
	 * 최대공약수 4
	 * 
	 * 넘 2개를 입력 받아서 최대 공약수를 찾아보려고 합니다. 가장 큰 공약수를 찾아봅시다
	 */

	public static void main(String[] args) {
		System.out.println("두 정수를 입력해주세요~ 최대공약수 구할꺼에여");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		int gcd = 0;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i; // 공약수가 계쏙 덮어씀. 최대값만 남음.
			}
		}
		System.out.println(num1 + "과" + num2 + "의 최대 공약수 > " + gcd);

		/*
		 * break : 반복문에서 조건이 맞다면 빠져나오는 구문
		 */
		for (int i = num1;; i--) {
			if (num1 % i == 0 && num2 % i == 0) {
				System.out.println("두수의 최대 공약수 > " + i);
				break;
			}
		}
		
		/*
		 * break : if문의 가장 가까운 for문만 벗어 날 수 있음.
		 * for문에 이름표를 붙여 해당 for문을 빠져나갈 수 있음.
		 */
		int i = 1;
		a:for(;;) {
			for(;;) {
				for(;;i++) {
					if(i==10) {
						i++;
						System.out.println("i는 11이지롱");
						break a; //여기서 쩌 위에~ a 포문을 빠져나가겠다고 설정가능
					}
				}
			}
		}

		scan.close();
	}
}
