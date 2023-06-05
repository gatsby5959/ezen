package Day08;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner9;

public class StringEx01 {
	public static void main(String[] args) {
		/*
		 * 5개인 파일명이 주어졌을 때, 검색어를 입력하면 해당단어를 포함하는 파일을 출력
		 */
		String[] fileName = { "java의 정석.txt", "이것이 자바다.java", "String.jpg", "String 메서드.txt", "String 함수.jpg" };
		// ex) java => java의 정석.txt, 이것이자바다.java
		// ex) String => String.jpg, String 메서드.txt, String 함수.jpg
		// ex) jpg => String.jpg, String 함수.jpg
		// ex) 없으면 없다고...하기

		System.out.println("검색좀 해볼께 입력해봐~");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int k = 0;
		for (int i = 0; i < fileName.length; i++) {
			if (fileName[i].contains(input)) { // 조건식은 true/ false
				System.out.print(fileName[i] + "  ");
				k++;

			}
		}
		if (k == 0) {
			System.out.println("검색된게 0개야 관련된거 없어");
		}
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어를 입력하세요.");
		String s= scan.next();
		int cnt=0;
		System.out.print("검색어 : " + s +" -- ");
		for(String temp : fileName) {
			if(temp.contains(s)) {
				System.out.println(temp);
				cnt++;
			}
		}
		if(cnt==0) {
			System.out.println("검색 결과가 없습니다~!");
		}
		
	}
}
