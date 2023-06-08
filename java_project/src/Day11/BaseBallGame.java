package Day11;

import java.util.Scanner;

import Day10.Method07_lotto;

public class BaseBallGame {
	public static void main(String[] args) {
		/*
		 * 야구게임 메서드화
		 * 사용자번호는 직접 입력
		 * 컴퓨터번호는 랜덤생성 (1~9, 중복X)
		 */
		 
		
		Scanner scan = new Scanner(System.in);
		int comNum[] = new int[3]; //컴퓨터 숫자 배열
		int myNum[] = new int[3]; //내 배열
		int max =9, min =1;
		int s = 0, b = 0;
		
		random_arr(comNum,1,9);
		System.out.println("숫자를 입력하세요 컴퓨터는 랜덤수 입력 되어잇습니다.");
		System.out.print("---------->------->>---------우측끝에 컴퓨터가 생성한 랜덤값 있음----->>>----------------------------->>>------------------------------------ ");
		printArray(comNum);
		int str_conut=0;
		do {
			
		
		String myStr = scan.next(); // 숫자를 문자로 받음
		String[] myNumStr = myStr.split(""); // 한글자 마다 잘라서 배열로 저장
		for(int i = 0; i<myNum.length; i++) {
			//문자를 숫자로 변환해서 myNum에 저장
			myNum[i] = Integer.parseInt(myNumStr[i]);
		}
		System.out.print("입력된 숫자는 ");
		printArray(myNum);
		System.out.println("입니다.");
		
		str_conut =str_count(myNum,comNum);
		bal_count(myNum,comNum);
		
		System.out.println("스트라익"+ str_count(myNum,comNum));
		System.out.println("볼"+ bal_count(myNum,comNum));
		if(bal_count(myNum,comNum)==3) {
			System.out.println("볼" +bal_count(myNum,comNum)+ "아웃");
		}
		} while (str_conut!=3);
		System.out.println("3스트라익 종료");
	}
	
	
	/*
	 * 랜덤 배열 생성 메서드
	 * 범위를 주지 않고 -- min, max를 이용하여 범위를 설정
	 * min = 1, max = 9 
	 */
	public static int random(int min, int max){
		if(max < min) { //min max가 바뀌었다면...
			int tmp = max;
			max = min;
			min = tmp;
		}
		return (int)(Math.random()*(max-min+1))+min; // 개수)+시작
	}
	
	/*
	 * 랜덤 배열 중복되지 않게 생성
	 * isContain을 Method07_lotto 가져와서 사용
	 * 매개변수 : 배열, int min , int max
	 * 리턴 X = void
	 */
	public static void random_arr(int[] intarr, int min , int max){
	      int cnt = 0; //i를 의미
	      while(cnt < intarr.length) {
	         int r = random(min,  max);
	         if(!isContain(intarr, r)) { //true = 중복된다
	        	 intarr[cnt] = r;
	            cnt++;
	         }
	      }
	}
	   //선생님 풀이 중복되면 true
	   public static boolean isContain(int arr[], int random) {
	      for(int i=0; i<arr.length; i++) {
	         if(arr[i] == random) {
	            return true;
	         }
	      }
	      return false;
	   }

	
	
	/*
	 * 스트라이크 개수를 카운트하는 메서드
	 * comNum, myNum 주고, 번호와 위치가 일치하면 count하는 메서드
	 * 리턴타입 => int
	 */
	public static int str_count(int[] my_arr, int[] com_random_arr) {
		int stk = 0;
//		System.out.println("숫자 입력 > ");

		// 숫자 비교
		for (int i = 0; i < com_random_arr.length; i++) {
			for (int j = 0; j < my_arr.length; j++) {
				if (com_random_arr[i] == my_arr[j] && i == j) { // 값 + 자리수도 같은 경우
					stk++;
				}
			}
		}
		return stk;
	}
	
	/*
	 * 볼 개수 카운트하는 메서드
	 * comNum, myNum 주고, 번호만 일치하면 count하는 메서드
	 */
	public static int bal_count(int[] my_arr, int[] com_random_arr) {
			int ball = 0;
//			for(int i = 0; i<my_arr.length; i++) {
				//문자를 숫자로 변환해서 myNum에 저장
//				my_arr[i] = Integer.parseInt(my_arr[i]);
//				my_arr[i] = my_arr[i]);
//			}
			
			for(int i = 0; i<com_random_arr.length; i++) {
				for(int j = 0; j< my_arr.length; j++) {
					if(com_random_arr[i] == my_arr[j] && i != j) { //값만 같은 경우(자리 수는 다른경우)
						ball++;
					}
				}
			}
			return ball;
	
	}
	/*
	 * 배열 출력 메서드 
	 */
	   public static void printArray(int arr[]) {
		      for(int a : arr) {
		         System.out.print(a+" ");
		      }
		      System.out.println();
		   }


	
	
	
	
	
	
	
}
