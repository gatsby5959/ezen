package Day08;

//import java.util.Scanner;

public class Array04 {
	public static void main(String[] args) {
		/*
		 * 국어 영어 수학이라는 글자를 담을 배열을 생성 후
		 * 글자를 입력 ===> 출력
		 */
		
		String arr[] = new String[3];
//		Scanner sc = new Scanner(System.in);
		
		arr[0] = "국어";
		arr[1] = "영어";
		arr[2] = "수학";
		
//		arr[0] = sc.next();
//		arr[1] = sc.next();
//		arr[2] = sc.next();
//		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
		System.out.println("--------------------------------------------------------");
//		for(int i = 0 ; i<3 ; i++) {
//			arr[i] = sc.next();
//		}
		for(int i = 0; i<3; i++) {
			System.out.println(arr[i]);
		}
		//향상된 for문
		//한번에 하나씩 객체의 전체 탐색시 사용
		for(String s : arr) { //처음부터 끝까지 확인시 가용(중간에 뭐 하나 뺼순 없음)(건너뛰면서 확인불가)
			System.out.println("arr " + s);
		}
		
		
		
		
		
		
		
		
	}//end main
}//class
