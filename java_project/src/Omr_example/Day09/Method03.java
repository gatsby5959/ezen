package Omr_example.Day09;

public class Method03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMulti(9);
	}
	// 정수(2~9까지중 하나) 해당 단의 구구단이 출력메서드
	//매개변수 : 메서드를 실행하기 위해서 외부에서 받아오는 값 (7단 => int dan)
	//리턴타입 : 메서드 처리 후 메인에게 다시 돌려주는 값(void)
	//메서드명 : printMulti
	public static void printMulti(int dan) {
		//dan은 메인에서 주는 값 int dan = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	}
	
	
}
