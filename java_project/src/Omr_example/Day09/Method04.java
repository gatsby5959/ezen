package Omr_example.Day09;

public class Method04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime(7));
		//int num = 10;
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(isPrime(i)) { // true
				System.out.println(i+"는 소수입니다.");
				sum+=i;
			}
//			else {
//				System.out.println(i+"는 소수가 아닙니다.");
//			}
			//2~100까지 소수의 합계 (isPrime을 활용하여...)
		}
		System.out.println("소수합계 : "+sum);
	}
	
	/* 정수가 주어지면 이 정수가 소수인지 아닌지 판별(true / false)
	 * 소수 : 1과 자기자신의 수 외에는 나누어 떨어지지않는 수
	 * 리턴타입 : boolean
	 * 매개변수 : int num
	 * 메서드명 : isPrime
	 * */
	public static boolean isPrime(int num) {
		//소수인지 판별할 수는 num
		int cnt = 0; //약수의 개수를 세기위한 변수 (약수가 2개인 수가 소수)
		//나누려는 수를 반복해서 돌립니다.
		for(int i=1; i<=num; i++) {
			if(num % i == 0) { //약수다.
				cnt++;  //약수발생 개수를 누적
			}
		}
		if(cnt == 2) {
			return true;
		}
		return false;
		
	}
}

