package Day09;

public class Method03 {
	public static void main(String[] args) {

		printMulti(2);
//		System.out.println(printMulti(2));
	}
	// 정수(2~9까지중 하나)를 주면 해당 단의 구구단이 출력되는 메서드
	// 매개변수 : 메서드를 실행하기 위해서 외부에서 받아오는 값
	// 리턴타입 : 메서드를 처리 후 메인에게 다시 돌려주는 값
	// 매서드명 : printMulti

	public static void printMulti(int num) {
		// dan은 메인에서 주는 값 int dan = 2;
		for (int i = 1; i <= 9; i++) {
			System.out.println("2*" + i + " = " + (2 * i));
		}

//		return Integer.toString(num) + " test중";
	}
}
