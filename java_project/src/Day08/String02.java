package Day08;

public class String02 {

	public static void main(String[] args) {
		//자바의정석.java   파일명과 확장자명을 분리하여 출력
		//파일명 : 자바의정석
		//확장자 : java
		//contain : 해당글자가 포함되어 있는지 체크 boolean
		
		String file = "자바의정석.java";
		
		System.out.print("파일명 : ");
		System.out.println(file.substring(0, file.indexOf(".")));
		System.out.print("확장자 : ");
		System.out.println(file.substring(file.indexOf(".")+1, file.length()));
		//file에서 java가 포함되어있으면 자바파일 이라고 출력
//		if(file.replace("java", "자바파일").trim().equals("자바파일")) { 자바파일을 제외한 모든 글자를 지우려 하다가... 걍 컨테인 씀 ㅋ
		if(file.contains("java")) { //조건식은 true/ false
			System.out.println("자바파일 입니다.");
		}
		
		
	}//end main

}//end class
