package Day01;
 
import java.util.Scanner;
 
public class 콘솔입력 {
 
    public static void main(String[] args) {
        /* 콘솔에서 입력받기
         * */
        Scanner scan = new Scanner(System.in); // 입력받을 때 사용.
        //문자, 정수, 실수, 문자열
        System.out.println("정수를 입력해주세요.");
        int num1 = scan.nextInt();
        System.out.println(num1);
        
        System.out.println("나이를 입력해주세요.");
        int num2 = scan.nextInt();
        System.out.println(num2);
        
        //문자열 입력
        System.out.println("문자열을 입력해주세요.");
        String str = scan.next(); // 공백허용X 
        System.out.println(str);
        
        scan.nextLine(); // 공백을 받아서 버림
        
        String str1 = scan.nextLine(); // 공백허용O
        System.out.println(str1);
        
        // 1문자만 입력
        System.out.println("1글자만 입력해주세요.");
        char ch = scan.next().charAt(0);
        System.out.println(ch);
        
        // 실수 입력
        System.out.println("실수를 입력해주세요.");
        double num3 = scan.nextDouble();
        System.out.println(num3);
        
        scan.close();
 
    }
 
}
