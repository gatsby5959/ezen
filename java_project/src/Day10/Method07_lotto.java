package Day10;

public class Method07_lotto {
   
   public static void main(String[] args) {
      /* 로또 번호 생성 (1~45 랜덤으로 생성)
       * 당첨 확인
       * */
      int lotto[] = new int[7]; //당첨번호+보너스번호 => 랜덤생성
      int user[] = new int[6];  //사용자번호

      randomArray(lotto);
      randomArray(user);
      
      printArray(lotto);
      printArray(user);
      
      //매개변수의 자리에 다른 값이 들어가도 자료형만 맞으면 에러가 나지 않음.
      int rank = lottoRank(lotto, user);
      //랭크 확인
      if(rank==-1) {
         System.out.println("꽝");
      }else {
         System.out.println(lottoRank(lotto, user)+"등입니다~!");
      }
      
      
      
   }
   
   /* 1. 번호를 랜덤으로 생성하는 기능.
    * 1~45까지 랜덤생성
    * 매개변수 : x
    * 리턴타입 : x => void
    * 메서드명 : random
    * */
   public static int random() {
      return (int)(Math.random()*9)+1;
   }
   
   /* 2. 배열에 1번의 랜덤번호를 저장하는 기능.
    * 매개변수 : 배열 => int arr[]
    * 리턴타입 : x => void
    * 메서드명 : randomArray
    * */
   
//   public static void randomArray(int arr[]) {
//      for(int i = 0; i < arr.length; i++) {
//         arr[i] = random();
//      }
//   }
   
   //선생님 풀이
   public static void randomArray(int arr[]) {
      int cnt = 0; //i를 의미
      while(cnt < arr.length) {
         int r = random();
         if(!isContain(arr, r)) { //true = 중복된다
            arr[cnt] = r;
            cnt++;
         }
      }
   }
   
   /* 3. 배열을 콘솔에 출력하는 기능
    * 매개변수 : 
    * 리턴타입 :
    * 메서드명 : printArray
    * */
   public static void printArray(int arr[]) {
      for(int a : arr) {
         System.out.print(a+" ");
      }
      System.out.println();
   }
   
   /* 4. 같은 값이 있는지 확인하는 기능
    * 매개변수 :
    * 리턴타입 :
    * 메서드명 : isContain
    * */
   
//   public static boolean isContain(int arr[]) {
//      for(int i=0; i<arr.length; i++) {
//         for(int j=i+1; j<arr.length; j++) {
//            if(arr[i] == arr[j]) {
//               return true;
//            }
//         }
//      }
//      return false;
//   }
   
   //선생님 풀이
   public static boolean isContain(int arr[], int random) {
      for(int i=0; i<arr.length; i++) {
         if(arr[i] == random) {
            return true;
         }
      }
      return false;
   }
   
   
   /* 5. 등수를 알려주는 메서드
    * 매개변수 :
    * 리턴타입 : int => 등수
    * 메서드명 : lottoRank
    * 
    * -- 당첨기준
    * 6개일치 : 1등
    * 5개일치+보너스 : 2등
    * 5개일치 : 3등
    * 4개일치 : 4등
    * 3개일치 : 5등
    * 나머지는 꽝
    * */
   public static int lottoRank(int lotto[], int user[]) {
      //lotto=7개, user=6개
      //lotto와 user는 개수가 다르기 때문에 바뀌어서 들어오면 error
      if(lotto.length <= user.length) {
         return -1;
      }
      
      int cnt = 0; //당첨번호와 일치하는 번호 개수
      int rank;
      
      //보너스번호를 제외한 번호 일치 개수 확인
//      for(int i=0; i<lotto.length-1; i++) {
//         for(int j=0; j<user.length; j++) {
//            if(lotto[i]==user[j]) {
//               cnt++;
//            }
//         }
//      }//for end
      //선생님 풀이
      for(int i=0; i<lotto.length; i++) {
         if(isContain(user, lotto[i])) {
            cnt++;
         }
      }//for end
      
      //번호 일치 개수에 따른 등수 (보너스 제외)
//      switch(cnt){
//      case 6: rank = 1; break;
//      case 5: rank = 3; break;
//      case 4: rank = 4; break;
//      case 3: rank = 5; break;
//      default:
//         rank = 0;
//      }//switch end
//      
//      //번호 5개가 일치할 경우, 보너스 번호 일치 여부 확인
//      if(cnt==5) {
//         for(int i=0; i<user.length; i++) {
//            if(lotto[6]==user[i]) {
//               rank = 2;
//            }
//         }
//      }//if end
      //선생님 풀이
      switch(cnt){
      case 6: return 1;
      case 5:
         if(isContain(user, lotto[lotto.length-1])){
            return 2;
         }else {
            return 3;
         }
      case 4: return 4;
      case 3: return 5;
      default:
         return -1;
      }//switch end
      
   }//lottoRank end

}