package Day08;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *   숫자를 입력받아 입력 받은 숫자를 거꾸로 출력
		 *   ex) 11456 => 출력 : 65411 => 6+5+4+1+1 => 결과값 출력
		 *   ex) 19781 => 출력 : 18791 => 1+8+7+9+1 => 결과값 출력
		 */
		
		
		System.out.println("숫자를 한번에 12345 등으로 입력해주세요 입력 받은 숫자를 거꾸로 출력 할 것입니다.");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("입력받은 숫자는 " + number +" 입니다. " );
		
		String st = String.valueOf(number);   //숫자를 string문자로...
		String[] str_arr = st.split("");
		int[] int_arr = new int[str_arr.length];
		for(int i = 0 ; i<str_arr.length; i++) {
			System.out.print(str_arr[i] + " ");
		}
		System.out.println();
		System.out.println("위에보고 String으로 했고 쪼개기 완료");
		
//		System.out.println(str_arr[0]);
//		System.out.println(Integer.parseInt(str_arr[0]));
		
		 for (int i = 0; i < str_arr.length; i++) {
			 int_arr[i] = Integer.parseInt(str_arr[i]);
			 System.out.println(int_arr[i]);
	        }
		 
		
//		for(int i=0; i<arr0.length; i++) {
//			for(int j=i+1; j<arr0.length; j++) {
//				if(arr0[i]>arr0[j]) {  //오름차순        내림차수는'<'로부등호 바꿈
//					//교환코드
//					int tmp = arr0[i];
//					arr0[i] = arr0[j];
//					arr0[j] = tmp;
//				}
//			}
//		}//end for
//		
//		System.out.println();
//		System.out.println("--정렬 후--");
//		for(int tmp : arr0) {
//			System.out.print(tmp + " ");
//		}

		
		
		
		
		
		
		
		
		

		
		
	}


}
