package Day09;

public class Method01 {

	// 메서드 작성위치! //매서드는 간단하게 작성하는 것이 일반적이다.


	
	public static void main(String[] args) { // 요건 메인메서드
		/*
		 * Method(메서드) : 기능(함수) , function 메서드 선언 및 구현 접근제한자 리턴타입 메서드명(매개변수){ 기능구현; }
		 * -접근제한자 : 접근할수 있는 주체의 제한범위 -리턴타입 : 반환값(메서드 실행 후 결과로 알려주는 값의 자료형) -메서드명 : 소문자로
		 * 작성 -매개변수 : 기능을 수행하기위해 필요한 값 (외부에서 들어와야 하는 값) -void : 리턴할 것이 없다.
		 * 
		 * -메서드의 위치(메서드만들때 사용할 떄 말고...) 클래스안, 다른메서드 밖 메서드의 위치는 순서가 상관없다. 순서대로 실행되진
		 * 않음(호출이 되어야 실행됨)
		 */
		int a = sum(1, 21);
		System.out.println("10+20 해봅시다");
		System.out.println(sum(10, 20));
		System.out.println("");
		System.out.println("22-10 해봅시다");
		System.out.println(minus(22, 10));
		
		System.out.println(minus(2, 10));
	
		sum1(20,30);
//		System.out.println(sum1(20,30)); 리턴 값이 없으니 main에서 찍을것이 없어서 에러
	
	}// main함수 끝

	
	

	
	//두 정수가 주어지면 두 정수의 합을 알려주는(리턴하는) 메서드
	//리턴타닙 : int(합계)
	//메서드명 : sum
	//매개변수 : int num1, int num2, (두 정수)
	public static int sum(int num1, int num2) {
		// 매개변수 = 자료형 변수명, 자료형 변수명
		return num1 + num2;
	}

	
	
	
	// 두 정수가 주어지면 두 정수의 차를 알려주는(리턴하는) 메서드
	// 리턴타입 : int(num1에서 num2뺸값)
	// 메서드명 : minus   (sub)
	//매개변수 : int num1, int num2
	public static int minus(int num1, int num2) {
		// 매개변수 = 자료형 변수명, 자료형 변수명
//		if(num1 < num2) {
//			System.out.println("큰수에서 작은수 뺄께요 아라서 교체할꼐요");
//			 int tmp = num1;
//			 num1 = num2;
//			 num2 = tmp;
//		}
//		int min = num1 - num2;
//		
		
		//int sub = num1 - num2
		//Math.abs(값) :절대치
		//return Math.abs(sub);
		if(num1<num2) {
			return num2-num1;
		}else {
			return num1-num2;	
		}

//		return min;
	
	
	
	}
	//두 정수가 주어지면 두 정수의 합을 출력하는 메서드
			//리턴타입 : 없음. => void
			//매개변수 : 두정수(int num1, int num2)
			//매서드명 : sum1
	public static void sum1(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	
	
	// 메서드 작성위치!

	
	
	
	
}
