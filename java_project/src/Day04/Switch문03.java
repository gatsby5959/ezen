package Day04;

public class Switch문03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 램덤으로 1부터 7까지의 숫자를 발생시켜
		 * 1 = 일요일, 2월요일, 3=수요일,.... 7=토요일
		 * 랜덤으로 발생시키는 것을 만들어보세영
		 */
		int r_num;
		
		r_num = (int) (Math.random()*7)+1 ;
		
//		System.out.println(r_num);
//		char op = scan.next().charAt(0);
		switch (r_num) {
		case 1:
			System.out.print("일");
			break;
		case 2:
			System.out.print("월");
			break;
		case 3:
			System.out.print("화");
			break;
		case 4:
			System.out.print("수");
			break;
		case 5:
			System.out.print("목");
			break;
		case 6:
			System.out.print("금");
			break;
		case 7 :
			System.out.print("토");
			break;
		default:
			System.out.print("오류에러");
			break;
		} //end of switch
		System.out.println("요일");
		
	}//end of main

}
