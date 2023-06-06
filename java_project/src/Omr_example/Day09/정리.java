package Omr_example.Day09;

public class 정리 {



	public static void main(String[] args) {

		/* 정리~!!

		 * 1. 변수

		 * - 일반변수(기본형) : 값을 저장하는 기본 메모리 공간 

		 * 	 1. 정수형 : int(기본형), byte, short, long(접미사:L l), char

		 * 	 2. 실수형 : double(기본형), float(접미사:F f)

		 *   3. 불리언 : boolean 

		 * - 참조변수 : 객체의 주소를 저장하는 변수(객체명) : new 키워드를 통해 객체를 생성

		 * - 대표적인 참조변수 배열, String

		 * - 자료형변환 : 변수, 상수, 리터럴값들을 일시적으로 다른 자료형으로 변환

		 *   - 자동형변환 : 정수 -> 실수, 작은바이트 -> 큰바이트

		 *   - 명시적형변환 : 자동으로 형변환이 일어나지 않으면 error 발생

		 *   	(자료형)변수명 => 명시적으로 형변환을 해줘야 한다.

		 * 

		 * 2. 연산자

		 *  - 대입연산자(=)

		 *   - 오른쪽의 값을 왼쪽 변수에 저장

		 *   - 왼쪽에는 반드시 저장이 가능한 변수 / 객체가 와야한다.

		 *   - 왼쪽과 오른쪽의 자료형은 반드시 같아야한다.

		 *  - 산술연산자(+ - *  / % )

		 *   - 정수 / 정수 = 정수, 0으로 나눌 수 없음.

		 *  - 비교연산자(>=, <=, >, <, ==, !=)

		 *   - 결과는 항상 true / false로 표현됨 

		 *  - 논리연산자( &&, ||, ! )

		 *   - && : and => 여러개의 조건이 모두 맞아야 true, ~이고, ~면서

		 *   - || : or => 여러개의 조건 중 하나만 맞아도 true, ~이거나, ~또는

		 *   - !  : not => 현재 조건의 반대

		 *  - 증감연산자( ++ , -- ) : 1씩증가, 1씩감소

		 *  - 조건선택연산자 (조건식 ? true : false)

		 *   - 조건식이 참이면 true, 아니면 false를 리턴

		 * 

		 * 3. 조건문 : 조건식을 이용하여 참이면 실행문을 실행 (if문, switch문)

		 * - if(조건식) {

		 * 	실행문;

		 * }else{

		 * 	실행문;

		 * }

		 * 

		 * if(조건식){

		 * 	실행문;

		 * }else if(조건식){

		 * 실행문;

		 * }else{

		 * 실행문;

		 * }

		 * 

		 * -switch(식/변수) {

		 * //break;를 적지 않으면 해당 케이스 이후 모든 케이스가 실행됨.

		 * case 값1 : 실행문; break; 

		 * case 값2 : 실행문; break;

		 * case 값3 : 실행문; break;

		 * ...

		 * default:

		 * 실행문;

		 * (break;) => 선택

		 * }

		 * 

		 * 4. 반복문 : 규칙적인 반복

		 * - for, while, do~while 

		 * - for(초기화 ; 조건식 ; 증감식){

		 * 	실행문;

		 * }

		 * 

		 * - while(조건식){ //참이되어야 반복이됨.

		 * 실행문; //실행문에는 조건식 변수의 증감이 일어나야 함.

		 * }

		 * 

		 * -do{ // 조건식이 맞지 않더라도 1번은 실행

		 * 실행문;

		 * }while(조건식); //참이여야 반복

		 * 

		 * - break; 

		 *  - 반복문을 빠져나가는 키워드 / switch 문을 빠져나오는 역할

		 *  - if문을 같이 동반

		 * - continue;

		 *  - skip, pass 하는 역할

		 *  - 조건이 맞을 때 실행하지 않고 pass

		 * 

		 * 5. 배열 

		 *  - 동일한 자료형을 가지는 데이터를 모아놓은 형태

		 *  - 배열선언

		 *   자료형 배열명[];

		 *   자료형[] 배열명;

		 *   - 자료형 배열명[] = new 자료형[개수];

		 *   - 배열의 index 는 0부터 시작 ~ 배열.length-1까지

		 *   - 배열.length : 배열의 총길이

		 *   - 배열에 값 저장 : 배열명[번지] = 값;

		 *   - 배열의 값 추출 : 변수 = 배열명[번지];

		 * */



	}



}