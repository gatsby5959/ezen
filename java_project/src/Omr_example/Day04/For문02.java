package Omr_example.Day04;

public class For문02 {
	public static void main(String[] args) {
		/* 1~10까지의 홀수의 합과 짝수의 합을 출력
		 * */
		int evenSum = 0; //짝수의 합계
		int oddSum =0; //홀수의 합계
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) { //짝수일때
				evenSum+=i;  // == evenSum = evenSum + i;
			}else {
				oddSum+=i;
			}
		}
		System.out.println("짝수 합:"+evenSum);
		System.out.println("홀수 합:"+oddSum);
		
		
	}
}
