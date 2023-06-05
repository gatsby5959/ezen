package Day03;

import java.util.Scanner;

public class 입력 {
	public static void main(String[] args) {
		/*
		 * 콘솔입력 : 콘솔에서 값을 입력 받는 것을 의미 Scanner : 클래스 이용 콘솔에서 값을 입력받을 수 있게 해주는 클래스 값을 콘솔에서
		 * 입력받아서 그 값이 짝수인지 홀수인지 출력
		 */
		Scanner scan = new Scanner(System.in); // 이건 인포트 해야 사용가능
		
		
//		System.out.println("숫자(정수)를 입력해주세요");
//		int num = scan.nextInt(); // 값을 숫자의 형태로 받겠다.
//		System.out.println(">>내가입력한 문자 : " + num);
//
//		if (num % 2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}

		// 숫자(num1) 숫자를 입력받아 양수인지 음수인지 0인지 판별하여 출력
//		System.out.println();
		System.out.println("양수인지 음수인지 0인지 확인해볼께요");
		int num1 = scan.nextInt();
		if (num1 > 0) {
			System.out.println(num1 + " => 양수 입니다.");
		} else if (num1 < 0) {
			System.out.println(num1 + " => 음수 입니다");
		} else if (num1 == 0) {
			System.out.println(num1 + " => 0 입니다");
		} else {
			System.out.println(num1 + " => 양수도 음수도 0도 아닌 수입니다.");
		}
		
		System.out.println("--------------------------------------------");
		System.out.println("한글자만 입력해주세요");
		
		//문자 입력 : 1글자만 입력받기
		char ch = scan.next().charAt(0); //abc 에서 0번 째 (index번지) 것만 가져옴
		System.out.println("확인 > "+ch);
		
		//문자열 입력 : 여러글자 입력받기 (공백을 포함하지 않음) ==>scan.next();
		System.out.println("한 단어만 입력해주세요.");
		String s = scan.next();
		System.out.println("확인 > "+s);
		scan.nextLine(); //앞의 Enter공백을 날리는 역할을 함.
		//문자열 입력 : 공백포함 scan.nextLine();
		System.out.println("공백포함 여러단어입력");
		String s2 = scan.nextLine();
		System.out.println("확인 > "+s2);
		
		

		scan.close();// 닫기 전에 입력 받아야함 안해줘도 상황은 없음 다만 계속 스켄이 노란밑줄뜰꺼임

	}// 메인끝
}// 클래스끝
