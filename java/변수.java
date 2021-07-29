package Day01;
 
public class 변수 {
 
    public static void main(String[] args) {
        // 주석 : 코드에 영향을 미치지 않는 문구, 설명을 위해서 사용
        // 한줄 주석.
        /* 여러줄 
         * 주석입니다.
         * 변수 : 값을 담는 메모리 공간의 이름
         * 리터럴 : 변수안에 담기는 값
         * 리터럴의 종류 : 정수, 문자, 실수(소수점), 논리값
         * 변수를 선언하는 방법 
         * - 변수타입 변수명;
         * - 변수타입 
         * 1. 정수형
         *    - int(가장 일반적으로 쓰는 정수 형태변수) : 4byte 
         *    - byte : 1byte
         *    - short : 2byte
         *    - long : 8byte
         * 2. 문자형
         *    - char : 2byte 
         * 3. 실수형
         *    - float : 4btye
         *    - double(일반적으로 사용하는 실수 형태 변수) : byte
         * 4. 논리형
         *    - boolean : true, false      
         *     
         * */
        System.out.println(); //sysout => ctrl+space
        System.out.println("Hello World"); //문자열 
        System.out.println('A'); //한문자
        System.out.println(123+123);
        
        int num; // 정수형 변수 선언
        num = 12345; // 변수의 초기화. 12345 숫자를 저장
        // + 연결연산자, = 대입연산자, == 같다
        System.out.println("num는 " + num + " 입니다."); //num를 출력
        double num2 = 1.5; // 선언과 동시에 초기화
        int kor, eng, math; // 동일한 자료형을 가지는 여러 변수 선언.
        kor = 85;
        eng = 78;
        math = 56;
        boolean bool = true;  // 논리형
        char ch = 'A'; // 1문자만 저장 가능. ''
        String str = "Hello World"; // 문자열 저장가능. String = 클래스
        System.out.println("str은 "+str+" 입니다");
        // 문제 국어점수 : 85, 영어점수 : 78, 수학점수 : 56 출력
        System.out.println("국어점수 : " + kor + ", 영어점수 : " + eng + 
        
