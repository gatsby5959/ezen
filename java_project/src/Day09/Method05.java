package Day09;

public class Method05 {
	public static void main(String[] args) {
		/*
		 * 최대공약수, 최소공배수 메서드
		 */
		System.out.println(gcd(6, 12)); // 최대공약수
		System.out.println(lcm(10, 15)); // 최대공배수
		System.out.println(lcm2(10, 15));
	}

	
	/*
	 * 두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드 매개변수 : 두정수(int num1, int num2) 리턴타입 : 최대공약수
	 * int 매서드명 : gcd
	 */
	public static int gcd(int num1, int num2) {

		int a = num1;
		int b = num2;

		int result = 0;
		int i = 1;
		for (i = 1; i <= b; i++) {
			if ((a % i == 0) && (b % i == 0)) {
				result = i;
			}
		}
		return result;
	}

	/*
	 * 두정수를 매개변수로 받아 최소공배수를 리턴하는 메서드 매개변수 : 두정수(int num1, int num2) 리턴타입 :
	 * 최소공배수(int) 메서드명 : lcm
	 */
	public static int lcm(int num1, int num2) {
		for (int i = num1;; i = i + num1) {
			if ((i % num1 == 0) && (i % num2 == .0)) {
//				System.out.print("최소공배수" + minnum + " ");
//				break;
				return i; // 처음 만나는 숫자에서 그냥 리턴해버림 최소공배수 이기에....
			}
		}
//		System.out.println(maxnum + " 입니다.");
//		return i;
	}

	// 최소공배수 규칙 : 두수를 곱한 후 최대공약수로 나누기 <--최소공배수 구하는 공식
	// 10*15/5 = 30 <--- 최소공배수 구하는 공식
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}