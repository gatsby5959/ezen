package Omr_example.Day03;




/*
import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
*/

		/* 국어, 영어, 수학을 입력받아서 합계, 평균

		 * 평균이 90이상이면 A

		 * 평균이 80이상이면 B

		 * 평균이 70이상이면 C

		 * 나머지는 D

		 * 입력값이 0보다 작거나, 100보다 크면 잘못된값입니다.

		 * */

/*
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력(0~100) : 국,영,수 순으로...");

		int kor = scan.nextInt();

		int eng = scan.nextInt();

		int math = scan.nextInt();

		if(kor<0 || kor>100) {

			System.out.println("국어점수가 입력범위를 벗어났습니다. (error)");

		}

		if(eng<0 || eng>100) {

			System.out.println("영어점수가 입력범위를 벗어났습니다. (error)");

		}

		if(math<0 || math>100) {

			System.out.println("수학점수가 입력범위를 벗어났습니다. (error)");

		}


		int sum = kor+eng+math;

		double avg = (double)sum/3;

		System.out.println("합계:"+sum);

		System.out.println("평균:"+avg);


		char ch='F';

		if(avg >100 || avg <0) {

			System.out.println("잘못된 성적입니다.");

		}else if(avg>=90) {

			ch='A';

		}else if(avg>=80) {

			ch='B';

		}else if(avg>=70) {

			ch='C';

		}else {

			ch='D';

		}

		System.out.println("평가:"+ch);

		scan.close();



	}



}






*/

//package Day03;
import java.util.Scanner;
public class IF03 {
	public static void main(String[] args) {
		/* 정수를 입력받아서 2의 배수가 되는지 체크 (2의배수입니다.)
		 * 3의 배수가 되는지 체크 (3의 배수입니다.)
		 * */
		//ctrl + shift + o : import 단축키
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		int num = scan.nextInt();
		if(num %2==0) {
			System.out.println("2의 배수입니다.");
		}
		if(num % 3==0) {
			System.out.println("3의 배수입니다.");
		}
	}
}

