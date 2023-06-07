package Day10;

public class Method07_lotto {
	public static void main(String[] args) {
		/*
		 * 로또 번호 생성 (1~45 랜덤으로 생성)
		 * 당첨 확인
		 */
		int lotto[] = new int [7];	//당첨번호+보너스번호 ===> 랜덤 생성
		int user[] = new int[6];	//사용자번호
		int bonus = 0;
	
		int random45=0;
		random45 = random();
		randomArray(lotto);
//	    bonus = lotto[7]; 
		randomArray(user);
		System.out.println();
		printArray(lotto);
		System.out.println();
		printArray(user);
		System.out.println();
//		isContain(lotto,user);
		System.out.println();
//		isContain(user);
		
		System.out.println();
		int rank = lottoRank(lotto,user);
		if(rank == -1) {
			System.out.println("꽝");
		}else {
			System.out.println(rank + " 등 당첨");
		}
		
	}	
	/*
	 * 1.번호를 랜덤으로 생성하는 기능.
	 * 1~45까지 램덤생성
	 * 매개변수: int
	 * 리턴타입: int 1개
	 * 매서드명 : ramdom
	 */
	public static int random() {
		//1~45까지의 랜덤수 추출
		//(int)(Math.random()*n)+start;
		int random = (int)(Math.random()*45)+1;
		return random;
	}
	
	
	
	
	/*
	 * 2. 방금생성한 랜덤을 배열에 저장
	 * 배열에 1번의 랜덤번호를 저장하는 기능.
	 * 매개변수 :
	 * 리턴타입 :
	 * 메서드명 : randomArray
	 */
	public static void randomArray( int[] arr) {
//		int[] a = null;
//		a = new int[arr.length];
		boolean a= isContatin_OMR1(arr);
		for(int i = 0; i<arr.length; i++) {
			
			if ( a == false){
			arr[i] = random();
			}
		}

//		return a; 
	}
	
	public static void randomArray( int[] arr, int a) {
		int cnt = 0;
		while(cnt < arr.length) {
			int r = random();
			if(!isContain(arr,r)) { //true중복된다.
				arr[cnt] = r;
				cnt ++;
			}
		}
	}
	
	
	/* 3.
	 * 배열을 콘솔에 출력하는 기능
	 * 매개변수 :
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 */
	public static void printArray(int[] arrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr) {
		for(int i = 0; i<arrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr.length; i++) {
		System.out.print(arrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr[i]+ " ");
		}
	}
	
	
	
	
	/*
	 *4. 같은 값이 있는지 확인하는 메서드
	 *매개변수 :
	 *리턴타입 :
	 *메서드명 : isContatin 
	 */
	public static void isContatin_JGH(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 오름차순 내림차수는'<'로부등호 바꿈
					// 교환코드
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

				if (arr[i] == arr[i + 1]) {
					arr[i + 1] = random();
					isContatin_JGH(arr);
					System.out.println("같은값 확인되어서 다른 값으로 교체 후 재귀?호출 겹치는거 안나올때까지 돌것임");
				}
			}
		} // end for

	}
	
	public static boolean isContatin_OMR1(int[] arr) {
		boolean a = true;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // 오름차순 내림차수는'<'로부등호 바꿈
					// 교환코드
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

				if (arr[i] == arr[i + 1]) {
					arr[i + 1] = random();
					isContatin_JGH(arr);
					System.out.println("같은값 확인되어서 다른 값으로 교체 후 재귀?호출 겹치는거 안나올때까지 돌것임");
					a = true;
				}else {
					a = false;
				}
			}
		} // end for
		return a;
	}
	
	public static boolean isContain(int[] arr, int r) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]== random()) {
				return true;
			} //for문과 상관없이 메서드 종료
		}
		return false;
	}
	
	
	
	
	/*
	 *4. 같은 값이 있는지 확인하는 메서드
	 *매개변수 : 배열, 랜덤값
	 *리턴타입 : boolean
	 *메서드명 : isContatin_OMR 
	 */
	public static void isContatin_OMR(int[] arr) {
		
		
	}
	
	
	
	
	/*
	 * 5. 등수를 알려주는 메서드
	 * 매개변수 : lotto[], user[]
	 * 리턴타입 :
	 * 메서드명 : lottoRank
	 * -- 당첨기준
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 :  2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지는 꽝
	 */
	public static void lottoRank_JGH(int[] arr0 , int[] arr1) {
		for(int i=0; i<arr0.length; i++) {
			for(int j=i+1; j<arr0.length; j++) {
				if(arr0[i]>arr0[j]) {  //오름차순        내림차수는'<'로부등호 바꿈
					//교환코드
					int tmp = arr0[i];
					arr0[i] = arr0[j];
					arr0[j] = tmp;
				}
			}
		}//end for
		for(int i=0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i]>arr1[j]) {  //오름차순        내림차수는'<'로부등호 바꿈
					//교환코드
					int tmp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = tmp;
				}
			}
		}//end for
	
		int count = 0;
		
		for(int i=0 ; i<6 ; i++ ) {
			
			for(int j=0; j<6; j++) {
			
				if(arr0[i]==arr1[j]) {
					count++;	
				}
				
			}
		}
		int bonus_count = 0;
		
			
			for(int j=0; j<6; j++) {
			
				if(arr0[j]==bonus_count) {
					bonus_count++;	
				}
				
			}
		
		
		System.out.println(count + " 개 일치 ");

		if (count == 6) {
			System.out.println(" 6개 일치 : 1등");
		} else if (count == 5 && bonus_count == 1) {
			System.out.println("5개 보너스1개 일치 2등");
		} else if (count == 5) {
			System.out.println(" 5개 일치 : 3등");
		} else if (count == 4) {
			System.out.println(" 4개 일치 : 4등");
		} else if (count == 3) {
			System.out.println(" 3개 일치 : 5등");
		} else if (count == 2) {
			System.out.println(" 2개 일치 : 등수없음 꽝");
		} else if (count == 1) {
			System.out.println(" 1개 일치 : 등수없음 꽝");
		} else {
			System.out.println("0개일치 그냥 다 꽝");
		}
	
	}
	
	
	
	/*
	 * 5. 등수를 알려주는 메서드
	 * 매개변수 : lotto[], user[]
	 * 리턴타입 :
	 * 메서드명 : lottoRank
	 * -- 당첨기준
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 :  2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 나머지는 꽝
	 */
	public static int lottoRank(int[] lotto , int[] user) {
		//lotto = 7개
		//user = 6개
		//lotto와 user는 개수가 다르기 떄문에 바뀌어서 들어오면 error
		if(lotto.length <= user.length) {
			return -1;
		}
		int cnt = 0;
		for(int i = 0; i < user.length; i++) {
			if(isContain(user, lotto[i])) {
				cnt++;
			}
		}
		
		//보너스 제외 숫자
		switch(cnt) {
		case 6: return 1;
		case 5: 
			if(isContain(user, lotto[lotto.length-1])) {
				return 2;
			}else {
				return 3;
			}
		
		case 4 : return 4;
		case 3 : return 5;
		default:
			return -1;
	}
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
}
