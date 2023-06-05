package Day04;

public class Switch문03강사님버전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 램덤으로 1부터 7까지의 숫자를 발생시켜
		 * 1 = 일요일, 2월요일, 3=수요일,.... 7=토요일
		 * 랜덤으로 발생시키는 것을 만들어보세영
		 */
		int random = (int) (Math.random()*7)+1 ;
		// "1" '1' 1 다 다름 스트링 차 숫자 인식...
		switch (random) {
		case 1: System.out.println('일'); break;
		case 2: System.out.println('월'); break;
		case 3: System.out.println('화'); break;
		case 4: System.out.println('수'); break;
		case 5: System.out.println('목'); break;
		case 6: System.out.println('금'); break;
		case 7: System.out.println('토'); break;
		
		default:
			System.out.print("오류에러");
			break;
		} //end of switch

		
	}//end of main

}
