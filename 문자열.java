package Day01;
 
public class 문자열 {
 
    public static void main(String[] args) {
        /* 문자는 유니코드라는 코드표에 따라 숫자 형태로 저장
         * 문자를 저장하면 유니코드 표에 있는 값에 따라 저장
         * */
        char ch = 'A';  //자료형 변수명 = '초기화'; 1문자만 저장
        System.out.println(ch);
        System.out.println((int)ch); // 자료형변환 (자료형)변수명
        
        int num1;
        ch = (char)66;
        System.out.println(ch);
        
        
    }
 
}