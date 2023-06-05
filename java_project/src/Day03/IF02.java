package Day03;

import java.util.Scanner;

public class IF02 {
	public static void main(String[] args) {
		/*
		 * 국어 영어 수학 을 입력받아서 합계 평균을 내세요 평균이 90이상이면 A 평균이 80이상이면 B 평균이 70이상이면 C 나머지는 D
		 * 입력값이 0보다 작거나 100보다 크면 잘못된 값입니다 처리
		 */
//		int kor, eng, math;
//		double sum, avg;
//		
		Scanner scan = new Scanner(System.in);
//		System.out.println("국어 영어 수학 을 입력받아서 합계 평균을 내겠습니다.");
//		System.out.println("점수를 입력(0~100점)국어점수를 입력하세요");
//		kor = scan.nextInt();
//		if(kor < 0 || kor >100) {
//			System.out.println("잘못된 국어점수를 입력 하셨습니다. 0미만 100초과입니다.");
//			System.out.println("kor을 0점 처리하겠습니다.");
//			kor = 0; 
//		}
//		System.out.println("영어점수를 입력하세요");
//		eng = scan.nextInt();
//		if(eng < 0 || eng >100) {
//			System.out.println("잘못된 영어점수를 입력 하셨습니다. 0미만 100초과입니다.");
//			System.out.println("어쨋든 Sanner클래스를 닫겠습니다.");
//			scan.close();
//		}
//		
//		System.out.println("수학점수를 입력하세요");
//		math = scan.nextInt();
//		if(math < 0 || math >100) {
//			System.out.println("잘못된 영어점수를 입력 하셨습니다. 0미만 100초과입니다.");
//			System.out.println("어쨋든 Sanner클래스를 닫겠습니다.");
//			scan.close();
//		}
//		
//		sum = kor+eng+math;
//		avg = sum/3;
//		System.out.println("평균은 "+avg);
//		if(avg>=90) {
//			System.out.println("A");
//		}else if(avg>=80){
//			System.out.println("B");
//		}else if(avg>=70){
//			System.out.println("C");
//		}else {
//			System.out.println("D");
//		}

		System.out.println("점수를 입력(0~100) : 국영수 순으로...");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		if (kor < 0 || kor > 100) {
			System.out.println("국어점수가 입력범위를 벗어났습니다.(error)");
		}
		if (eng < 0 || eng > 100) {
			System.out.println("영어점수가 입력범위를 벗어났습니다.(error)");
		}
		if (math < 0 || math > 100) {
			System.out.println("수학점수가 입력범위를 벗어났습니다.(error)");
		}

		int sum = kor + eng + math;
		double avg = (double)sum/3;
		System.out.println("합계:"+sum);
		System.out.println("평균:"+avg);
		
		char ch = 'F';
		if(avg > 100 || avg < 0) {
			System.out.println("잘못된 성적입니다.");
		}else if(avg>=90) {
			ch = 'A';
		}else if(avg>=80) {
			ch ='B';
		}else if(avg>=70) {
			ch = 'C';	
		}else {
			ch = 'D';
		}
		System.out.println("평가: "+ ch);
		
	
		
		
		
		scan.close();
	
	
	} //메인끝
}
