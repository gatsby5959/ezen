package Omr_example.Day09;

public class Method02 {
	public static void main(String[] args) {
		// + - * / % 의 결과를 알려주는 메서드를 생성
		//main에서 호출하여  확인
		System.out.println(sum(10,20));
		System.out.println(sub(10,20));
		System.out.println(mul(10,20));
		System.out.println(div(10,20));
		System.out.println(mod(10,20));
		
	}
	//메서드 선언 위치
	//합계 : sum
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
	public static double div(int num1, int num2) {
		return num1 / (double)num2;
	}
	public static int mod (int num1, int num2) {
		return num1 % num2; 
	}
	
}