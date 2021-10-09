package Day02;
 
import java.util.Scanner;
 
public class IF문4 {
 
    public static void main(String[] args) {
        /* 정수를 입력받아서 정수가 6의 배수인지 확인하는 출력문.
         * 6의 배수 => num % 6 == 0 
         * 2의 배수이면서 3의 배수가 되는 값.
         * */
        Scanner scan = new Scanner(System.in); // 스케너 열기
        int num;  //입력받을 변수 선언
        System.out.println("정수를 입력해주세요.");
        num = scan.nextInt(); //스케너를 이용해서 정수를 입력받아서 num 넣어줌.
        
        if(num % 2 == 0 && num % 3 == 0) {
            System.out.println(num + "는 6의 배수입니다.");
        }else {
            System.out.println(num + "는 6의 배수가 아닙니다.");
        }
        
        scan.close();
    }
 
}
