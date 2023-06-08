package Omr_example.Day04;

public class 숙제 {
	public static void main(String[] args) {
		// 구구단 2단 출력
		/* 출력 결과 
		 * 2*1=2
		 * 2*2=4
		 * 2*3=6
		 * ...
		 * 2*9=18
		 * */
		int n = 7;  //단에 해당하는 값을 저장
		for(int j=2; j<=9; j++) {  //n에 해당하는 값을 2~9까지 반복
			for(int i=1; i<=9; i++) {
				System.out.println(j+"*"+i+"="+(j*i));
			}
		}
		
	}
}

