package Day02;

public class 숙제 {
//클럽에 제출
//	클럽에서 미란쌤 확인
//	숙제는 끝나는 시간에 제시하고 클럽에 제출
	/*
	 * 국어 영어 수학 점수의 합계와 평균을 출력 평균이 80이상이면 결과 : 합격 아니면 결과 : 불합격 띄우기 (if문 사용하여 출력)
	 */

	public static void main(String[] args) {
		int kor, eng, math;
		double sum, avg;

		kor = 90;
		eng = 80;
		math = 69;

		sum = kor + eng + math;
		avg = sum / 3.0;
		System.out.println("원점수평균 " + avg +" 합계"+sum);
		if (Math.round(avg) >= 80) {
			System.out.println(Math.round(avg) + " 정수반올림 결과 : 합격");
		} else {
			System.out.println(Math.round(avg) + " 정수반올림 결과 : 불합격");
		}
		
//		int kor2 = 80;
//		int eng2 = 78;
//		int math2 = 60;
//		
//		int sum2 = kor+eng+math;
//		double avg2 = sum /3.0;
//		
//		System.out.println("합계:"+sum2+"평균"+avg2 );
//		if(avg >= 80) {
//			System.out.println("결과 합격");
//			
//		}else {
//			System.out.println("불합격");
//		}
		
		//평균이 80이상이면 상 60미만이면 중 나머지는 하
		System.out.println("상중하는 '원점수'로 평가합니다.");
		if(avg >= avg) {
			System.out.println("상");
		}else if(avg>=60) {
			System.out.println("중");
		}else {
			System.out.println("하");
		}
	

	
	}//end of main

}//클래스 끝
