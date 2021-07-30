package Day02;
 
public class 연산자2 {
 
    public static void main(String[] args) {
        /* 문자열 : 문자는 1글자만 (' '), 문자열은 0글자 이상("").
         * 문자 : char 자료형 이용하여 1글자를 저장하는 변수를 생성
         * 문자열 : String 클래스를 이용하여 문자열을 저장하는 변수를 생성
         * 문자는 기본적으로 유니코드표에 등록이 되어 있음. 
         * A, 가 
         * */
        char ch ='a'; // 비교할 때 == 가 가능.
        System.out.println((int)ch);
        char ch1 ='B';
        System.out.println(ch +" "+ ch1); //연결연산자로 사용된게 아니라 +의 의미로 사용된경우.
        
        String str = "안녕하세요~!!"; // == 사용 불가능.
        System.out.println(str);
    }
 
}
