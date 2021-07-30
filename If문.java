package Day02;
 
public class IF문 {
 
    public static void main(String[] args) {
        /* 변수 : 리터럴 값을 담을 수 있는 저장공간
         * 기본 자료형 8가지 : int, char, double, boolean
         * 산술연산자 (+-* /%), 비교연산자(>, >=, <, <=, == ,!=)
         * 증감연산자 (++, --), 논리연산자(&& And의미, || Or의미, ! Not)
         * */
        /* 조건문 : if, switch
         * if문 : 조건식이 참이면 실행하라.
         * if(조건식){
         * 실행문
         * }
         * ~하면 ~해라
         * ~ 조건문  ~ 실행문
         * */
        /* num가 0이면 0이라고 출력
         * 조건식 : num가 0이다. => num == 0
         * 실행문 : 0이라고 출력 => syspout
         * */
        int num =1; //아래 조건문에서도 num를 사용.
        
        if(num==0) {
            System.out.println("num는 0입니다.");
        }
        num=3;
        /* num가 0이 아니면 0이 아닙니다라고 출력
         * 클럽에 제출  != : 같지않다.
         * */
        if(num !=0) {
            System.out.println("num는 0이 아닙니다.");
        }
        
        /* num가 양수면 양수라고 출력 ( 0보다 큰수 0은 포함하지 않음)
         * if(조건문){
         * 실행문
         * }
         * */
        if(num > 0) 
            System.out.println("num는 양수 입니다.");
        
            System.out.println("num는 0이 아닙니다.");
            
        
    }
 
}
 
