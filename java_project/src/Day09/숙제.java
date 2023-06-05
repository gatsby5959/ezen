package Day09;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 계산기 만들기 --메뉴-- 1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료 
		 * >> 메뉴선택 1 
		 * >> 숫자1> 입력받기(5) 
		 * >> 숫자2> 입력받기(3) 
		 * 결과 : 5+3=8 
		 * 더하기 메서드를 호출하여 연산(5+3) 
		 * 
		 *  연산에 따른 switch 구문으로 메서드 호출
		 */

		// 덧셈 뺼셈 곱셈 나눗셈 나머지 종료
		System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료 입니다. 숫자만 입력하세용 ");
		System.out.print("메뉴선택 : ");
		Scanner sc = new Scanner(System.in);
//		int num0 = sc.nextInt();

		char op = sc.next().charAt(0);
//		char op = scan.next().charAt(0);
		int num1, num2;
		System.out.print("숫자 1> ");
		num1 = sc.nextInt();
		System.out.print("숫자 2> ");
		num2 = sc.nextInt();
		
		switch (op) {
		case '1':
//			System.out.print("숫자 1> ");
//			num1 = sc.nextInt();
//			System.out.print("숫자 2> ");
//			num2 = sc.nextInt();
			int sum = sum(num1, num2);
			System.out.println("결과 : "+num1+ "+"+num2+"="+ sum);
			break;
		case '2':
//			System.out.print("숫자 1> ");
//		    num1 = sc.nextInt();
//		    System.out.print("숫자 2> ");
//			num2 = sc.nextInt();
			int sub = sub(num1, num2);
			System.out.println(sub);
			System.out.println("결과 : "+num1+ "-"+num2+"="+ sub);
			break;
		case '3':
//			System.out.print("숫자 1> ");
//			num1 = sc.nextInt();
//			System.out.print("숫자 2> ");
//			num2 = sc.nextInt();
			int mul = mul(num1, num2);
			System.out.println(mul);
			System.out.println("결과 : "+num1+ "*"+num2+"="+ mul);
			break;
		case '4':
//			System.out.print("숫자 1> ");
//			num1 = sc.nextInt();
//			System.out.print("숫자 2> ");
//			num2 = sc.nextInt();
			double div = div(num1, num2);
			System.out.println(div);
			System.out.println("결과 : "+num1+ "/"+num2+"="+ div);
			break;
		case '5':
//			System.out.print("숫자 1> ");
//			num1 = sc.nextInt();
//			System.out.print("숫자 2> ");
//			num2 = sc.nextInt();
			int mod = sum(num1, num2);
			System.out.println(mod);
			System.out.println("결과 : "+num1+ "%"+num2+"="+ mod);
			break;
		case '6':
			System.out.println("종료입니당");
			break;
		default:
			System.out.println("잘못된 연산자입니다~~!!");
			break;
		} 
		/*
		if (num0 == 1) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = sum(num1, num2);
			System.out.println(sum);
		}

		if (num0 == 2) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sub = sub(num1, num2);
			System.out.println(sub);
		}
		if (num0 == 3) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int mul = mul(num1, num2);
			System.out.println(mul);
		}
		if (num0 == 4) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			double div = div(num1, num2);
			System.out.println(div);
		}
		if (num0 == 5) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int mod = sum(num1, num2);
			System.out.println(mod);
		}
		if (num0 == 6) {
		
			System.out.println("종료입니당");
		}
		*/

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
