package Day08;

import java.util.Scanner;
public class 숙제 {
	public static void main(String[] args) {
		//230606 전경환 집에서 수정후 깃허브에 올린자료
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
		System.out.println("위에 String으로 했고 쪼개기 완료");
		
		
		 for (int i = 0; i < str_arr.length; i++) {
			 int_arr[i] = Integer.parseInt(str_arr[i]);
			 System.out.println(int_arr[i]);
	        }
		 System.out.println("위에 int 배열로 다시 넣기 완료");
		
		for(int i=0; i<int_arr.length; i++) {
			for(int j=i+1; j<int_arr.length; j++) {
				if(int_arr[i]<int_arr[j]) {  //오름차순'>'        내림차수는'<'로부등호 바꿈
					//교환코드
					int tmp = int_arr[i];
					int_arr[i] = int_arr[j];
					int_arr[j] = tmp;
				}
			}
		}//end for
		System.out.println("숫자배열안에 내림차순으로 변경 ");
		for(int i=0; i<int_arr.length; i++) {
			System.out.print(int_arr[i]+ " ");
		}
		System.out.println();
		System.out.println("숫자배열안에 내림차순으로 변경완료 ");
		int sum = 0;
		for(int i=0; i<int_arr.length; i++) {
			System.out.print(int_arr[i]);
			
			sum = sum + int_arr[i];
			if(i!=int_arr.length-1) {
				System.out.print("+");
			}else {
				System.out.print("=");
				System.out.println(sum);
			}
			
		}
		System.out.println("합산완료");
		
	}
}


