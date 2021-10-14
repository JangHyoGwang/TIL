package Day01;
 
public class 변수문제 {
 
    public static void main(String[] args) {
        /* 기본 사칙연산자 : + - * / %(나머지)
         * 1. 국어, 영어, 수학 점수를 저장하려고한다.
         * 필요한 변수를 선언하고, 국어, 영어, 수학 점수를 입력하세요.
         * 단, 정수로 저장한다.
         * 1) 자료형 변수명 = 초기화;
         * 2) 자료형 변수명; //선언
         *    변수명 = 초기화;
         * 합계. 평균을 출력
         * */
//        int 국어 = 95; // 1) 자료형 변수명 = 초기화;
//        int 영어;  // 2) 자료형 변수명;
//        영어=85;   // 변수명 = 초기화;
//        
//        int kor = 95, eng = 85, math = 65;
        
        int kor, eng, math; // 자료형 변수명, 변수명2, 변수명3; 같은 자료형이면 가능
        
//        kor = 95, eng = 75, math = 65; // 선언 따로 초기화 같이 불가능 X
        
        kor = 90;
        eng = 70;
        math = 52;
        
        int sum = kor + eng + math;
        double avg = sum/3.0;
        // 정수 / 정수 => 정수
        // 정수 / 실수 => 실수
        // 실수 / 정수 => 실수
        // 자료형변환
        double a = sum / (double)kor;
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println(a);
        
        
 
    }
 
}
