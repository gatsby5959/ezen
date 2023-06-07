package Day10;

public class Method06 {
	public static void main(String[] args) {
		/*
		 * 메서드를 활용해서 배열을 활용
		 * 
		 */
		int arr[] = new int[] { 11, 3, 5, 7, 4, 8, 9, 6, 2, 10, 1, 15, 16, 12, 14, 13 };

		printArray(arr);
		System.out.println();

		sortArray(arr); //정렬해주는 역할
		System.out.println();
	
		System.out.println("-----정렬후 확인-----");
		printArray(arr); //프린트 하는 역할
		System.out.println();
		
		int[] arr2 =  sortArray1(arr); //배열을 리턴
		System.out.println();
		printArray(arr); //배열출력
		System.out.println();
		
	
		System.out.println("--arr2--");
		printArray(arr2);  //굳이 리턴 까지 받을 필요는 없음.
		
	}

	/*
	 * 주어진 정수 배열을 콘솔에 출력하는 메서드 
	 * 매개변수 : 정수 배열(arr)받아옴 (arr[]) 
	 * 리턴타입 : 출력 = > 없음 void
	 * 메서드명 : printArray 5개씩 한줄로 나열
	 */
	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {


			if (i != 0 && (i % 5 == 0)) {
//			System.out.println("i값 출력 "+i+" 출력완료"); //줄맞추기
				System.out.println();
			}
			System.out.printf("%2d ", a[i]); // 줄맞추기
//			System.out.print(a[i]+" ");
		}
	}
	
	/*
	 * 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매개변수 : 정수 배열(int arr[])
	 * 리턴타입 : ?
	 * 메서드명 : sortArray
	 */
	
	public static void sortArray(int arr0[]) { //배열정렬
		for(int i=0; i<arr0.length-1; i++) {
			for(int j=i+1; j<arr0.length; j++) {
				if(arr0[i]>arr0[j]) {  //오름차순        내림차수는'<'로부등호 바꿈 
					//교환코드
					int tmp = arr0[i];
					arr0[i] = arr0[j];
					arr0[j] = tmp;
				}
			}
		}//end for
		/*
		for(int tmp : arr0) {
//			System.out.print(tmp + " "); //배열정렬
			System.out.printf("%2d ", arr0[tmp]); // 줄맞추기 
		}*/
	}
	
	
	/*
	 * 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매개변수 : 정수 배열(int arr[])
	 * 리턴타입 : 배열 자료형(int[])
	 * 메서드명 : sortArray1
	 */
	public static int[] sortArray1(int arr0[]) { //배열정렬
		for(int i=0; i<arr0.length-1; i++) {
			for(int j=i+1; j<arr0.length; j++) {
				if(arr0[i]>arr0[j]) {  //오름차순        내림차수는'<'로부등호 바꿈 
					//교환코드
					int tmp = arr0[i];
					arr0[i] = arr0[j];
					arr0[j] = tmp;
				}
			}
		}//end for
		return arr0;

	}
	
}
