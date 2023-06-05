package Day02;

public class 문제 {

	public static void main(String[] args) {
		/*
		 * 국어(kor) 영어(eng), 수학(math)
		 * 세값의 합계와 평균을 구하고자 한다.
		 * 필요한 변수와 값을 넣고 출력
		 */
//		int kor = 92;
//		int eng = 80;
//		int math = 69;
//		double sum, avg;
//		
//		sum = kor+eng+math;
//		avg = (sum)/3;
//				
//				System.out.println("합계는 " + sum + " 입니다");
//				System.out.println("평균은 "+ avg + " 입니다");
		

		int kor, eng, math;
		kor = 77;
		eng = 49;
		math = 98;
		int sum = kor+eng+math;
		double avg = (double)sum / 3; //int일떄는 0으로 나누면 예외나지만 double은 인피니티가 나옴
		//자료형이 double이고 나누는 값이 0이면 => 예외발생( infinity)
		//자료형이 int이고 나누는 값이 0이면 => 예외발생(Exception)
		System.out.println("합계:"+sum+"  평균:"+avg);
		
		//반올림 Math.method
		//반올림 (Math.round)
		System.out.println(Math.round(avg));
//		Math.ceil 올림 Math.floor 버림
		System.out.println(Math.ceil(5.1234)); // 무조건 올림
		System.out.println(Math.floor(5.9234)); // 무조건 내림
		
		//Math.max : 큰값, Math.min : 작은값
		System.out.println(Math.max(10, 30)); // 둘중 무조건 큰거 찍어주세요
		System.out.println(Math.min(10, 30)); // 둘중 무조건 작은거 찍어주세요
		
		//Math.random : 0~1 사이에 아무값이나 찍으세요
		// 0 <= random < 1
		//1~10까지의 랜덤수르 추출
		//(int)(Math.random()*n)+start;
		int random = (int)(Math.random()*10)+1;
		//1~6까지의 랜덤수르 추출
		int random2 = (int)(Math.random()*6)+1;
		System.out.println(random);
		System.out.println(random2);
		
	}

}
