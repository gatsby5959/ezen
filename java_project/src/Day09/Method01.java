package Day09;

public class Method01 {

	
	
	
	
	
	
	
	
	// 메서드 작성위치!

	
	
	
	
	
	
	
	
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
		System.out.println(sum(10, 20));
	}// main함수 끝

	
	
	
	
	
	
	
	
	
	
	public static int sum(int num1, int num2) {
		// 매개변수 = 자료형 변수명, 자료형 변수명
		return num1 + num2;
	}

	
	
	
	
	
	
	
	
	
	
	
	// 메서드 작성위치!

	
	
	
	
	
	
	
	
}
