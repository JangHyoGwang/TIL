package Day01;
 
public class 연산자 {
 
    public static void main(String[] args) {
        /* 대입연산자 = : =을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
         * a = b : b를 a에 저장(대입)하세요.
         * a 는 무조건 변수여야 합니다.
         * b는 변수/리터럴 상관없음.
         * 
         * */
        int a = 10;
        int b = 20;
        a = a + b; // a = 30
//        10 = a; //에러
        
        /* 산술연산자 : + - * / %(나머지, 모드) 
         * 정수 / 정수 => 정수  소수점을 버림. 자료형변환 필요.
         * 실수 / 정수 => 실수
         * 정수 / 실수 => 실수
         * 실수 / 실수 => 실수
         * */
        double c = a / (double)b; 
        int d = a % b;  //나머지만 저장
        int e = a / b; // 몫만 저장
        
        /* 비교연산자 : >, >=, <, <=, ==, !=
         * */
        System.out.println("---------------");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        
        /* 논리 연산자 : &&, ||, !
         * && : and  (국어>=90 && 영어>=90)  두조건이 모두 만족(true)
         * || : or   (국어>=90 || 영어>=90)  두 조건 중 하나만 만족(true)
         * ! : not  !true
         * */
        
        /* num의 값이 2의 배수인지 확인하는 코드
         * */
        int num = 11;
        System.out.println(num % 2 == 0); // num가 2의 배수 입니까?
        
        /* 증감연산자 : 변수의 값을 1씩 증가 / 1씩 감소 시키는 연산자
         * ++, --
         * 전위형 : ++변수명, --변수명 => 증가하고 동작
         * 후위형 : 변수명++, 변수명-- => 동작하고 증가
         * */
        int i = 1;
        i++; // i의 값을 1 증가
        i = i + 1; // i++
        i = i - 1; // i--
        System.out.println(i);
        ++i;
        
        i--; // i의 값을 1 감소
        System.out.println(i);
        
        /* 조건 선택 연산자 (3항 연산자)
         * (조건식) ? 값1 : 값2 ;  // 조건식이 맞으면 값1, 틀리면 값2
         * 문제 num가 2의 배수이면 짝수, 아니면 홀수
         * */
        // 연산자 중 최우선 연산자는 ()
        System.out.println( (num % 2 == 0) ? "짝수" : "홀수" );
        boolean bool =(num % 2 == 0) ? true : false ;
        System.out.println(num + " 짝수 입니까? " + bool);
    }
 
}
