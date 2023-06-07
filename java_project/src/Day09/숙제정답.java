package Day09;
import java.util.Scanner;
public class 숙제정답 {
	public static void main(String[] args) {
		/* 계산기 만들기
		 *  --메뉴--
		 *  1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 * >> 메뉴선택 1
		 * >> 숫자1> 입력받기(5)
		 * >> 숫자2> 입력받기(3)
		 * 결과 : 5+3=8
		 * 더하기 메서드를 호출하여 연산 (5+3)
		 * 
		 * 연산에 따른 switch 구문으로 메서드 호출
		 * */
		Scanner scan = new Scanner(System.in);
		int menu=0;
		do {
			System.out.println("--menu--");
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.println(">> 선택 > ");
			menu = scan.nextInt();
			int num1=0, num2=0;
			if(menu <= 5) {
				System.out.println(">> 숫자1  숫자2 >");
				num1 = scan.nextInt(); //숫자1
				num2 = scan.nextInt(); //숫자2
			}
			
			switch(menu) {
			case 1: sum(num1, num2);  break;
			case 2: sub(num1, num2);  break;
			case 3: mul(num1, num2);  break;
			case 4: div(num1, num2);  break;
			case 5: mod(num1, num2);  break;
			case 6:   break;
			default:
				System.out.println("잘못입력된 메뉴입니다.");
				break;
			}
			
		}while(menu != 6);
		System.out.println("프로그램 종료");
	}
	/* 더하기, 빼기, 곱하기, 나누기, 나머지 메서드를 별도 구성
	 * */
	public static void sum(int num1, int num2) {
		System.out.println(num1+"+"+num2+"="+(num1+num2));
	}
	public static void sub(int num1, int num2) {
		System.out.println(num1+"-"+num2+"="+(num1-num2));
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1+"*"+num2+"="+(num1*num2));
	}
	public static void div(int num1, int num2) {
		System.out.println(num1+"/"+num2+"="+(num1/num2));
	}
	public static void mod(int num1, int num2) {
		System.out.println(num1+"%"+num2+"="+(num1%num2));
	}
}

