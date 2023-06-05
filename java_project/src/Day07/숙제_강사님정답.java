package Day07;

public class 숙제_강사님정답 {
	/*
	 * 10개 빠리 배열을 생성 한 후 
	 * 1~50사이의 랜덤수를 생성한 후 배열에 저장 
	 * 배열을 출력 
	 * 합계, 평균, 최대, 최소 값을 출력
	 */

	public static void main(String[] args) {
		int size = 10;
		int arr[] = new int[size]; //arr의 초기값은 0
		int max = 0 ;  //arr[0] == 0
		int min = 50;
		int sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
		}
		
		//완성된 배열에서 탐색 //최대값, sum
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		double avg = (double)sum /arr.length;
		System.out.println();
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		System.out.println(min);
		
	} //end main
}
