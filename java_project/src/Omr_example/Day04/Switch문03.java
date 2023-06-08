package Omr_example.Day04;

public class Switch문03 {
	public static void main(String[] args) {
		/* 랜덤으로 1부터 7까지의 숫자를 발생시켜
		 * 1=일요일, 2=월요일, 3=수요일.... 7=토요일
		 * */
		
		int random = (int)(Math.random()*7)+1;  //1~7까지의 랜덤수 발생
		
		switch(random) {
		case 1: System.out.println("일"); break;
		case 2: System.out.println("월"); break;
		case 3: System.out.println("화"); break;
		case 4: System.out.println("수"); break;
		case 5: System.out.println("목"); break;
		case 6: System.out.println("금"); break;
		case 7: System.out.println("토"); break;
		}
	}
}