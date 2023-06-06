package Omr_example.Day08;

import java.util.Scanner;
public class 숙제 {
	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 거꾸로 출력, 각자리의 합계 출력
		 * ex) 11456 => 출력 : 65411 => 6+5+4+1+1 => 결과값 출력
		 * ex) 19781 => 출력 : 18791 => 1+8+7+9+1 => 결과값 출력 
		 * /, % 이용
		 *  
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요~!!");
		int num = scan.nextInt();
		int sum = 0;
		
		
		
		// num % 10 나머지값을 저장  => 마지막 자리
		// num = num / 10; int 형으로 나머지를 버린 몫만을 가지고 다시 나누기
		while(num > 0) {
			int b = num % 10; // 마지막 자리 추출
			sum += b;
			num = num / 10; 
			System.out.print(b+" ");
		}
		System.out.println(" => 자리 합 : "+sum);
	}
}
