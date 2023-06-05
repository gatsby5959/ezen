package Day08;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 배열은 길이를 가지고 있음
		 * 한번 정해진 배열의 길이는 이후에 추가하거나 삭제가 불가능함
		 * 배열의 길이를 늘리거나 줄이고 싶으면 배열 복사를 이용
		 * 이럴때 arraycopy라는 기능 있음
		 * System.arraycopy(이전배열, 시작번지, 새배열, 시작번지, 개수);
		 */
		
		//배열 복사를 이용하여 배열을 복사하는 경우
		int arr[] = new int[] {1,2,3,4};
		int arr1[] = new int[10];
		for(int i = 0; i<arr.length; i++) {
			arr1[i] = arr[i]; //arr1로 arr의 값을 복사
		}
		System.out.println("----");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		System.out.println("--arr1배열 출력--");
		for(int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		int arr2[] = new int[arr.length*2]; // 보통은 배열을 늘리는 경우는 이전 배열이 꽉찾으니 거기서 늘릴떄는 기존 길이의 2배로 늘린다.
											//이후에 새 배열을 기존배열에 넣어준다.(기존 배열은 사라지고)
		//arr = > arr2 배열복사
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		
	}//main end

}//class end
