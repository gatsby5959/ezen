package Day09;

public class ArrayEx03 {
	public static void main(String[] args) {
		/* 1~45 까지 숫자형 랜덤으로 6개 추출하는 로또번호 추출
		 * 오름차순정렬되도록 출력
		 */
		
		int random = (int)(Math.random()*45)+1;
		int[] int_arr = new int[6];
		
		for(int i = 0 ; i<int_arr.length; i++) {
			System.out.print(int_arr[i] + " ");
		}
		System.out.println("     초기화 잘됨");
		
		for(int i = 0 ; i<int_arr.length; i++) {
//		for(int int tmp:arr) {
			int_arr[i] = (int)(Math.random()*45)+1;
			System.out.print(int_arr[i] + " ");
		}
		System.out.println("    값 잘 들어감");
		
		
		for(int i=0; i<int_arr.length-1; i++) {
		for(int j=i+1; j<int_arr.length; j++) {
			if(int_arr[i]>int_arr[j]) {  //오름차순        내림차수는'<'로부등호 바꿈
				//교환코드
				int tmp = int_arr[i];
				int_arr[i] = int_arr[j];
				int_arr[j] = tmp;
			}
		}
	}//end for
		
		
		for(int i = 0 ; i<int_arr.length; i++) {
			System.out.print(int_arr[i] + " ");
		}
		System.out.println("    오름차순으로 완성");
		
		
	}
	

}
