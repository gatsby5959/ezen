package Day07;

public class 별찍기 {
	public static void main(String[] args) {
		/*
		 * 별찍기 ***** i=1 j=5 ***** i=2 j=5 ***** i=3 j=5 ***** i=4 j=5 ***** i=5 j=5 5*5
		 * 개로 별 찍기
		 * 
		 */
//		for (int i = 1; i <= 5; i++) { // 줄수 5줄
//			for (int j = 1; j <= 5; j++) { // 별한개 총 별 5개
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		
//		System.out.println("---------");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

		/*
		 * * i=1, j=1 ** i=2, j=2 *** i=3, j=3 **** j=4, j=4 ***** j=5, j=5
		 */
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) { 
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");

		for (int i = 1; i <= 5; i++) {
			for (int j = 6 - i; j >= 1; --j) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 5 - i; j >= 1; --j) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		for (int i = 1; i <= 5; i++) {
			// 공백
			for (int k = 1; k <= 5 - i; k++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		/*
		 * 1 2 3 i = 줄 
		 * 4 5 6 j = 숫자의 반복 횟수 
		 * 7 8 9
		 */
		// 이중for문을 이용하여 나타내보기

//		for (int i = 1; i <= 9; i++) {
//			System.out.print(i + " ");
//			if (i % 3 == 0) {
//				System.out.println(" ");
//			}
//		}

		int cnt = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				cnt++;
				System.out.print(cnt + " ");

			}
			System.out.println();
		}

//		System.out.print("1 ");
//		System.out.print("2 ");
//		System.out.print("3 ");
//		System.out.println("");
//		System.out.print("4 ");
//		System.out.print("5 ");
//		System.out.print("6 ");
//		System.out.println("");
//		System.out.print("7 ");
//		System.out.print("8 ");
//		System.out.print("9 ");

	}

}
