package Day05;

import java.util.Scanner;

public class For문강사님버전 {
	/*
	 * num를 입력 받아 num의 약수를 출력 약수 : 나우어서 떨어지는 수 12의 약수 : 12를 1부터 12까지 나눠봐서 그 나머지가 0이
	 * 되는수(나누어 떨어지는수) 그수를 약수 1과 자신의 수는 무조건 약수가 되어야함 1,2,3,4,6,12(자신의수)
	 */
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("정수를 입력해주세요.");
			int num = sc.nextInt();// 단에 해당하는 값을 저장

			for (int i = 1; i <= num; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println(" 입니다.");
			sc.close();
		
	}
}
