package Day05;

import java.util.Scanner;

public class For문04 {
	/*
	 * 최대공약수 찾기 두 정수 num1, num2를 입력받아 최대 공약수를 출력 공약수 : 두 정수의 약수 중 공통적으로 있는 약수(공약수)
	 * 최대공약수 : 공약수 중 가장 큰 값 8 , 12 공약수 8 : 1 2 4 8 12 : 1 2 4 6 12 공약수 : 1 2 4 ====>
	 * 최대공약수 4
	 * 
	 * 넘 2개를 입력 받아서 최대 공약수를 찾아보려고 합니다. 가장 큰 공약수를 찾아봅시다
	 */

	public static void main(String[] args) {
		int a = 8;
		int b = 12;

		int i2 = 0;
		int i = 1;
		for (i = 1; i <= b; i++) {

			if ((a % i == 0) && (b % i == 0)) {

//				System.out.print(i + " ");
				i2 = i;
			}

		}

		System.out.println(i2 + " 입니다.");

	}
}
