package Day01;
 
import java.util.Scanner;
 
public class 종합문제 {
 
    public static void main(String[] args) {
        /* 국어, 영어, 수학을 입력받아, 합계와 평균을 출력
         * Scanner 이용해서 정수로 입력.
         * 클럽에 제출
         * */
        Scanner scan = new Scanner(System.in);
        System.out.println("국어, 영어, 수학을 입력해주세요.");
        int kor = scan.nextInt();
        int eng = scan.nextInt();
        int math = scan.nextInt();
        
        int sum = kor + eng + math;
        double avg = sum/3.0;
        
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + avg);
        scan.close();
    }
 
}