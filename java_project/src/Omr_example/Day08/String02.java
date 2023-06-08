package Omr_example.Day08;

public class String02 {
	public static void main(String[] args) {
		//자바의정석.java 파일명과 확장자명을 분리하여 출력
		//파일명 : 자바의정석
		//확장자 : java
		String file = "자바의정석.java";
		String fileName = file.substring(0, file.indexOf("."));
		System.out.println(fileName);
		String sufix = file.substring(file.indexOf(".")+1);
		System.out.println(sufix);
		
		//file에서 java가 포함되어있으면 자바파일 이라고 출력
		//contains : 해당글자가 포함되어있는지를 체크 boolean
		if(file.contains("java")) { //조건식은 true / false
			System.out.println("자바파일 입니다.");
		}
	}
}

