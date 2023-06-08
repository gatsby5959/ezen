package Day09;

public class Method02 {

	public static void main(String[] args) {
		// + - * % 의 결과를 알려주는 메서드를 생성
		// main에서 호출해서 확인
		System.out.println(sum(1, 2));
		System.out.println(sub(2, 3));
		System.out.println(mul(4, 5));
		System.out.println(div(6, 7));
		System.out.println(mod(7, 5));
	}

	// 합계 : sum
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int sub(int num1, int num2) {
//		return a-b;

		if (num1 < num2) {
			return num2 - num1;
		} else {
			return num1 - num2;
		}
	}

	public static int mul(int a, int b) {
		return a * b;
	}

	public static double div(int a, int b) {
		if (a < b) {
			return (double) b / a;
		} else {
			return (double) a / b;
		}
	}
	
	public static int mod(int a, int b) {
		return a % b;
	}

}
