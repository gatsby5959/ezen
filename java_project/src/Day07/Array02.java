package Day07;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
		/*
		 * 5개 짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 */
		int size = 5;
		int arr[] = new int[size];
		
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = i+1;
//			System.out.printf("%d ", arr[i]);
			System.out.print(arr[i]+ " ");
//			System.out.printf("%d=%d%n ", arr[i], i+1);			
		}
		System.out.println();
		
		/*
		 * 5명의 점수를 입력 받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 */
		
		int size2 = 5;
		int arr2[] = new int[size2];
		Scanner scan = new Scanner(System.in);
		int inputint = 0; 
		int arr_sum = 0;
		System.out.println("5명의 점수를 입력해주세요.(0~100)");
		for(int i = 0 ; i < arr2.length ; i++) {
			//값을 입력받기 
			inputint = scan.nextInt();
			 arr2[i] = inputint;
			 //합계
			 arr_sum = arr_sum + arr2[i];
		}
		double avg = (double)arr_sum/arr2.length;

		System.out.println("array에 있는 값의 총합 " + arr_sum);
		System.out.println("array에 있는 값의 평균 " + avg);
//		System.out.println("array에 있는 값의 평균 " + (double)arr_sum/size2);
		
	}
}
