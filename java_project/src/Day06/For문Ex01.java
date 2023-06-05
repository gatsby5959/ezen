package Day06;

public class For문Ex01 {
	public static void main(String[] args) {
		/*
		 * 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
		 * 
		 * 1부터 30까지 짝수만 출력 5개씩 한줄로 출력
		 */
		System.out.println("1번쨰 경환 버전");
		for (int i = 2; i <= 30; i = i + 2) {
//			System.out.print(i + " ");
			System.out.printf("%3d",i);
			if (i % 10 == 0) {
				System.out.println("");
			}
		}

		System.out.println("2번쨰 경환 버전");
		for (int i = 1; i <= 30; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			if (i % 10 == 0) {
				System.out.println("");
			}
		}

		System.out.println("3번째 경환 버전.. ");
		int i2 = 1;
		while (i2 <= 30) {
			if (i2 % 2 == 0) {
				System.out.print(i2 + " ");
				if (i2 % 10 == 0) {
					System.out.println(i2 + " ");
				}
			}
			i2++;
		}

		System.out.println("----------");
		System.out.println("ln이 있으면 줄바꿈----------");
		System.out.println("print 는 그냥 계속 옆으로...----------");
		System.out.println("printf 는 지시자를 통해서 값을 표현");
		/*
		 * 서식 지정자를 통해 출력할 데이터의 서식을 지정할 수 있음. %n(\n줄바꿈), %d(정수형), %f(실수형), %c(문자),
		 * %s(문자열) escape sequence \n(줄바꿈), \r(캐리지 리턴), \t(탭),
		 */
		int num1 = 5;
		int num2 = 3;
		// 5 + 3 = 8;
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		System.out.printf("%2d+%2d=%2d%n", num1, num2, (num1 + num2));
		
		double num3 = 5;
		double num4 = 12;
		System.out.println(num3+"/"+num4+"="+(num3/num4));
		System.out.printf("%.0f+%.0f=%.1f",num3,num4,(num3/num4));

	}
}
