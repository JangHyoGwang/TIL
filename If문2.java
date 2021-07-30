package Day02;
 
public class IF문2 {
 
    public static void main(String[] args) {
        /* 조건식이 참이면 A를 실행하고, 거짓이면 B를 실행하라
         * if(조건식) {  // 조건식은 항상 참/거짓으로 나와야 한다.
         * 실행문A
         * } else {
         * 실행문B
         * }
         * */
        int num = 1;
        
        /* num가 양수이면 양수(0포함)라고 출력하고, 아니면 음수라고 출력.
         * */
        if(num >= 0 ) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }
        
        /* num가 짝수이면 짝수입니다라고 출력, 아니면 홀수입니다라고 출력
         * */
        if(num % 2 == 0) {
            System.out.println("num는 짝수입니다.");
        }else {
            System.out.println("num는 홀수입니다.");
        }
    }
 
}
 
