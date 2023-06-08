package Omr_example.Day07;

import java.util.Scanner;
public class Array02 {
	public static void main(String[] args) {
		/* 5개짜리 배열을 생성하여 1~5까지의 값을 입력하고 출력
		 * */
//		int size = 5; //배열 길이 값 저장
//		int arr[] = new int[size];
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = i+1;
//			//System.out.printf("%d", arr[i]);
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
		
		
		/* 5명의 점수를 입력받아서 배열에 저장하고,
		 * 점수의 합계와 평균을 출력
		 * */
		Scanner scan = new Scanner(System.in);
		int size = 5;
		int sum=0;
		int arr[] =new int[size];
		System.out.println("5명의 점수를 입력해주세요.(0~100)");
		for(int i=0; i<arr.length; i++) {
			//값을 입력받기
			arr[i] = scan.nextInt();
			//합계
			sum = sum+arr[i];
		}
		System.out.println("5명의 합계:"+sum);
		double avg = (double)sum/arr.length;
		System.out.println("5명의 평균:"+avg);
		
	}
}
