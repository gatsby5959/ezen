package Day01;

public class HelloWorld {

	public static void main(String[] args) {
		// println : 줄바꿈이 있는 출력
		// print : 줄바꿈이 없는 출력
		// printf : 형식을 가지는 출력 (c언어에서 주로 사용)
		System.out.println("Hello World~!!");
		//클래스에서 쩜찍으면 메서드임 out이 그래서 매서드임
		//클래스에서 out이라는 메서드 선택
		//그 메서드에서 또 제공하는 메서드들이 있음.... 그중에 println이 있는듯... 아님말고...
//		System.out.println 도 매개변수가 다 달라서.. 이게 오버로딩이래
		//어자피 막 넣어도 되 매개변수?에 따라서 java에서 자동으로 잘 선택해서 보여줌
		//매개변수를 막 고민 할필요가 없음...
		
		//프린트ln은 줄바꿈을 해줌
		
		System.out.println(1234);
		char a = '한';
		char b = 'a';
	}

}
