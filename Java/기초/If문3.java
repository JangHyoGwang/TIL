package Day02;
 
public class IF문3 {
 
    public static void main(String[] args) {
        /* 조건식1이 참이면 실행문1을 실행하고,
         * (조건식1이 거짓이고,) 조건식2가 참이면, 실행문2를 실행하고,
         * (조건식1, 2가 모두 거짓이고), 조건식3이 참이면, 실행문3을 실행해라.
         * if(조건식1){
         * 실행문1
         * }else if(조건식2){
         * 실행문2
         * }else if(조건식3){
         * 실행문3
         * } ...
         * */
        /* num가 0보다크면 양수, 0이면 0, 0보다작으면 음수로 출력
         * */
        
        int num = -5;
        if(num > 0) {
            System.out.println(num + "은 양수");
        }else if(num == 0) {
            System.out.println(num + "은 0");
        }else if(num < 0) {
            System.out.println(num + "은 음수");
        }
        /* 국어, 영어, 수학 값의 합계과 평균을 출력하고, 
         * 평균이 90이상이면 'A', 80이상이면 'B', 나머지는 C
         * */
        int kor, eng, math, sum;
        double avg;
        
        kor = 160;
        eng = 167;
        math = 166;
        sum = kor + eng + math;
        avg = sum / 3.0;
        System.out.println("합계는 : " + sum);
        System.out.println("평균은 : " + avg);
        
        if(kor <0 || kor >100 || eng <0 || eng >100|| math <0 || math > 100) {
            System.out.println("점수 오류입니다.");
        }else if(avg >=90) {
            System.out.println(avg + ": 학점은 A");
        }else if(avg < 90 && avg >=80) {
            System.out.println(avg + ": 학점은 B");
        }else {
            System.out.println(avg + ": 학점은 C");
        }
 
    }
 
}
