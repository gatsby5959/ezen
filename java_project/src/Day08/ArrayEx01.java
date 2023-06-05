package Day08;

public class ArrayEx01 {
	public static void main(String[] args) {

		/*
		 * 1~10까지 담고 있는 배열을 생성 => 출력
		 */
		int arr0[] = new int[10];

		for (int i = 0; i < arr0.length; i++) {
			arr0[i] = i+1; // arr1로 arr의 값을 복사
			System.out.print(arr0[i] + " ");
		}
		System.out.println();
		
		//배열을 섞는 코드
		//랜덤 번지를 선택해서 순차적으로 하나씩 교환
//		int random = (int)(Math.random()*9)+1;
//		System.out.println(random);
		/*
		 * 교환 코드
		 * tmp개념 씀  temp
		 * int tmp = arr[i];
		 * arr[i] = arr[j];
		 * arr[j] = tmp;
		 */
		//(int)(Math.random()*개수)+시작
		//범위를 min=0, max=9
		//범위를 min = 0, max=arr.length //10개...
		//범위로 나온다면 min = 1, max = 15까지
		//개수=(max - min +1) 시작 = min
		// 0~9까지 10개 (9-0+1) 0
		int min = 0;
		int max = arr0.length;
		for(int i=0; i<arr0.length; i++) {
			int random = (int)(Math.random()*max)+min;
			int tmp = arr0[i];
			arr0[i] = arr0[random];
			arr0[random] = tmp;
		}
		System.out.println();
		System.out.println("--섞은 후--");
		for(int tmp: arr0) {
			System.out.print(tmp+ " ");
		}
		
		
		// 오름차순 정렬 : 작은 수 부터 정렬
		// 내름차순 정렬 : 큰 수부터 정렬  
		//6 4 10 1 2 7 8 3 9 5 ....         총 10개 있음  
		//1 6 10 4 2 7 8 3 9 5 ....1차 9번 비교
		//1 2 10 6 4 7 8 3 9 5 ....2차 8번 비교
//		                           3차 7번 비교
//								   4차 6번 비교
//		                           5차 5번 비교
//		                           6차 4번 비교
//		                           7차 3번 비교
//		                           8    2
//		                           9   1번 비교 끝
		//2중 포문으로 해야함...
		
		for(int i=0; i<arr0.length; i++) {
			for(int j=i+1; j<arr0.length; j++) {
				if(arr0[i]>arr0[j]) {  //오름차순        내림차수는'<'로부등호 바꿈
					//교환코드
					int tmp = arr0[i];
					arr0[i] = arr0[j];
					arr0[j] = tmp;
				}
			}
		}//end for
		
		System.out.println();
		System.out.println("--정렬 후--");
		for(int tmp : arr0) {
			System.out.print(tmp + " ");
		}
		
		
		
		
	}
}
