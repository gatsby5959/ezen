package Day01;

public class 변수 {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		// 주석은 코드의 영향을 미치지 않는 문고, 설명을 위해서 사용

		/*
		 * 한줄 주석은 // 로 쓰며 줄바구면 영향력이 없음 현재 쓰는 주석은 줄바꿔도 계속 처리됨 엔터 쳐보면 계속 따라옴
		 * 
		 * 변수 선언 자료형(타입) 변수명;
		 */

		int num1;
		int num2, num3, num4; // 같은 자료형은 같이 선언할수 잇씁니다
		num1 = 123; // 선언된 변수에 값을 지정
		System.out.println(num1);
		// = 대입연산자 : 왼쪽에 있는 리터럴 값이 오른쪽으로 저장
		num1 = 345; // 기존 값은 지워지고 현재 값으로 덮어씀. 굳이 지우고 할 필요가 없음
		System.out.println(num1);

		int num5 = 111; // 선언과 저장을 동시에 처리 가장 많이 사용한다.
		int num6 = 1, num7 = 2, num8 = 3;
//		int num1 = 1;
		// 중복 변수는 선언 불가능
		// 8개의 자료형변수는 지역변수 범위 {}를 넘어가면 그 효력이 사라짐 이 밖에서는 중복해도 괜찮음.

		// 명령문(구문){ }
		int a;
		if (true) {
			a = 11;
		}
		System.out.println(a);
//		System.out.println(a);//a를 찾을 수 없음 괄호 안에 있는 a를 인식할 수 없음!!!!
//		선언을 괄호 밖에서 하고 안에서 그냥 a만 쓰면 사용할수 있음

		char ch = 'a';// Char자료형에서만 사용 '' 한글자만 저장시... 이건 숫자로 변환되서 인식함
		double dou = 1.5;
		byte b = 1;
		boolean bool = true; // true나 false만 저장 가능

		int appleCount; // 변수명은 의미있게 짓는 것을 추천 카멜표기법으로~낙타표기법
		// 중복선언 불가능
		// long, float은 두개는 접미사가 붙어야 인식됨;
		// long(l, L)대문자로 잘씀, float(f F)소문자로 잘씀

		long l = 123456L; // 큰수를 다룰 때는
		float f = 1.2f; // 

		num2 = 010; // 0으로 시작하면 8진수로 인식
		num3 = 0x10; // 0x로 시작하면 16진법으로 인식
		// 컴퓨터는 2진수로 인식하고 우린 10진수로 인식한다 그 사이에 8진수랑 16진수가 있다

		// 국어점수(kor), 영어점수(eng), 수학점수(math) 변수를 선언하고 값을 저장
		// 세점수의 합을 콘솔에 찍어보기
		// + - * / % 이건 나머지

		int kor = 90;
		int eng = 80;
		int math = 70;
		int sum;
		sum = kor + eng + math;
		System.out.println(sum);
		System.out.println(kor + eng + math);

	}// end_main()

	int num1 = 1;
}// end_class;
