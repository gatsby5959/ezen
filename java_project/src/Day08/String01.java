package Day08;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String 클래스 = 문자열을 다루는 클래스 => 참조변수
		 * String str = new String(); //정석
		 * String str = "홍길동"; //워낙 자주 써서 일반자료형처럼 이용가능(하지만 일반자료형은 아님)
		 */
		String str = "Hello World~!!"; //한글자마다 배열 처럼 이용
		System.out.println(str);
		
		//length : 전체 글자의 길이
		System.out.println("--length--");
		System.out.println(str.length());
		
		//charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("--charAt(0)--");
		System.out.println(str.charAt(10));
		
		//subString : 문자열을 추출
		System.out.println("--substring--");
		System.out.println(str.substring(0)); //3번지부터 끝까지
		System.out.println(str.substring(3, 10)); //3번지부터 10번지(10번지는 포함X)까지

		//str.compareTo(str) : str문자열과 비교하여 같으면 0, 사전순으로 앞이면 -1, 뒤면 1
		System.out.println("--compareTo--");
		System.out.println("b".compareTo("a")); //b가 a보다 1칸뒤에 있다는 뜻
		System.out.println("a".compareTo("c")); //a를 기준으로 c랑 비교하면 -2가 나옴(2칸 앞에 있다는 뜻)
		System.out.println("a".compareTo("a")); // 같다는 뜻
		
		//concat : 이어붙이기(+ 연산자와 같은 의미) (나중에 디비에서도 쓰임)
		System.out.println("--concat--");
		System.out.println("Hello".concat(" Apple~!!"));
		System.out.print("Hello "+"Apple~!!");
		
		//equals : 두 문자열(내용)에 같은지 확인(대소문자 구분) 같으면 true
		//문자는 == 로 같은지 비교가 안됨
		//참조 변수를 == 로 비교하면 주소가 같은지 비교함
		System.out.println("--equals--");
		System.out.println("abc".equals("def")); //false
		System.out.println("abc".equals("abc")); //true
		
		//indexOf : 문자의 위치(인덱스 번지)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		//lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("---indexOf--");
		System.out.println(str.indexOf("l")); //Hello World~!!  //번지수를 줌 //앞에서부터 찾음
		System.out.println(str.lastIndexOf("l")); // 뒤에서부터 찾아나가다가 처음 걸리는 내용의 인덱스를 반환
		String email = "hello1234@naver.com";
		//아이디를 추출 -> 출력
		System.out.println(email.substring(0, 9));
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1 ));
		
		//trim : 불필요한 공백 제거
		System.out.println("---trim---");
		System.out.println("    Hello   ".trim());	
		
		//toLowerCase(), toUpperCase() : 대소문자 변환
		System.out.println("--toLowerCase()--");
		System.out.println("--toLowerCase()--".toLowerCase());	//소문자 변환
		System.out.println("--toLowerCase()--".toUpperCase());	//대문자 변환

		//isEmpty() : 객체가 비어 있는지 체크 비었으면 true
		System.out.println("--isEmpty()--");
		System.out.println(str.isEmpty());
		
		//replace : 글자를 치환(변환)
		System.out.println("--replace--");
		System.out.println("Hello World".replace("World", "JAVA"));
		
		//split : 특정 값을 기준으로 나누기   리턴을 배열로 리튼
		System.out.println("--split--");
		String str1 = "dog,cat,tiger";
		String[] arr = str1.split(",");
		for(String tmp : arr) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		String[] arr2 = str1.split("");
		for(String tmp : arr2) {
			System.out.print(tmp + " ");
		}
		System.out.println();
		String num1 = "1";
		String num2 = "2";
		String sum = num1 + num2;
		System.out.println(sum);
		
		// parseInt : 문자를 숫자로 변환
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		// String.valueOf() : 숫자를 문자로 변환
		// instanceof : 객체의 형이 일치하는지 체크
		int a = 12345;
		String s = String.valueOf(a);
		System.out.println(s instanceof String); //객체자료형만 가능
		
	}
}
