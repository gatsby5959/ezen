package Day07;

import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {

		int arr[] = new int[] {10,54,57,62,58,63,98,87};
		/*
		 * arr 배열의 합계, 평균, 최대값, 최소값을 출력
		 */
		int arr_sum=0;
		double avg = 0;
		int arr_max = arr[0];  
		int arr_min = arr[0];
		System.out.println("arr의 합계입니다");
		for(int i = 0 ; i < arr.length ; i++) {
			 //합계
			 arr_sum = arr_sum + arr[i];
			 avg = (double)arr_sum/arr.length;
		}
		System.out.println(arr_sum); 
		
		System.out.println();
		
		System.out.println("arr의 평균입니다.");
		System.out.println(avg);
		System.out.println();
		
		
		
		
		
		System.out.println("arr의 최대값입니다.");
		for(int i = 0 ; i < arr.length-1 ; i++) {
			if(arr_max < arr[i]) {
				arr_max = arr[i];	//max = Math.max(max,arr[i]); 된다고 함 (컨펌은 안함)
			}
		}
		System.out.println(arr_max);
		System.out.println();
		
		
		
		
		
		
		System.out.println("arr의 최소값입니다.");
		for(int i = 0 ; i < arr.length ; i++) {
			arr_min = Math.min(arr_min,arr[i]); //된다고 함
//			if(arr_min > arr[i]) {  //min = Math.min(min,arr[i]); 된다고 함
//				arr_min = arr[i];
//			}
		}
		System.out.println(arr_min);
		
		
		
	}
}
