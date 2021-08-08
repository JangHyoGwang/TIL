package Day8;
 
//모든 클래스 임포트
```java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
```

public class CollectionEx1 {

```java
    public static void main(String[] args) {
        /* 프레임웤 : 표준화된 방식
         * 컬렉션 프레임웤 : List, Set, Map 
         * - 데이터를 묶어서 관리할 때 사용
         * - 배열을 효율적으로 사용하기 위한 대체수단
         * List
         * - 값을 하나씩 저장
         * - 순서를 보장
         * - 중복을 허용
         * - 일반적으로 가장 많이 사용
         * Set
         * - 값을 하나씩 저장
         * - 순서를 보장 X
         * - 중복 불가
         * Map
         * - 값을 두개 저장, ,key와 value의 값으로 저장
         * - key는 중복 불가, value는 중복 가능
         * - 중복된 key 값을 쓰게 되면 덮어쓰기 됨.
         * - 아이디/password 같은 상황에서 이용.
         * 
         * List : ArrayList, LinkedList, Stack, Vector 구현 클래스로 구현.
         * */
        /* 컬렉션 프레임워크는 어떤 데이터를 관리할지 클래스를 지정해야 한다.
         * 클래스를 지정하지 않으면 Object가 자동으로 들어간다.
         * list, list1은 클래스를 지정하지 않았기 때문에 object가자동으로 들어간다. 
         * 따라서, 모든 클래스의 객체를 저장할 수 있다. 
         * */
        //List 사용 방법
        //List list = new List(); //불가능
        List list = new ArrayList();
        ArrayList list1 = new ArrayList(); 
        ArrayList<String> list2 = new ArrayList<String>(); //문자만 저장
        //ArrayList<int> list3 = new ArrayList<int>(); // <클래스만 가능>
        ArrayList<Integer> list3 = new ArrayList<Integer>(); //숫자만 저장
        
        // 값을 넣을 때 add, 값을 지울 때 remove, 값을 바꿀 때 set
        list3.add(1);
        for(int i=1; i<=5; i++) {
            list3.add(i); // list3에 값을 추가 1~5까지
        }
        for(int i=1; i<=5; i++) {
            list3.add(i); // list3에 값을 추가 1~5까지
        }
        
        list3.remove(0); //0번지의 값을 지움.
        Integer a = 5;
        list3.remove(a); // 객체로 오게되면 해당 값과 일치하는 첫번째 요소를 삭제
        //set(index, object) : index번지에 object를 저장
        list3.set(0, 10);
        
        for(int temp : list3) {
            System.out.print(temp + " ");
        }
        System.out.println(); //줄바꿈용
        
        /* sort(객체) => 익명클래스를 이용
         * - 객체 : Comparator 인터페이스를 구현한 객체를 넣어줘야 함.
         * - 비교(compare) 메서드를 가진 객체를 이용하여 정렬
         * - compare 메서드의 구현에 따라 오름차순, 내림차순 정렬 가능.
         * */
        list3.sort(new Comparator<Integer>() {
 
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;   // 오름차순,  o2 - o1  //내림차순
            }
            
        });
        
        // size : list의 전체 개수,  배열에서 length와 같은 의미
        
        for(int i=0; i<list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        
        System.out.println();  // 줄바꿈용
        
        /* Iterator를 이용한 list값 확인 (번지가 아닌 값을 이용하여 출력)
         * list는 순서를 보장하기 때문에 get을 이용하여 원하는 번지의 값을 확인가능.
         * set은 순서를 보장하지 않기 때문에 for문으로 접근 불가능.
         * set, map은 Iterator를 이용하여 출력
         * hasnext() : 현재 정보를 기준으로 다음 정보가 있는 확인.
         * next() : 현재 정보를 기준으로 다음 정보를 가져옴.\
         * */
        
        Iterator<Integer> it = list3.iterator();
        while(it.hasNext()) { // it 객체의 다음 요소가 있는지 확인
            Integer tmp = it.next();  // 요소의 값을 tmp에 저장
            System.out.print(tmp + " "); //tmp를 출력
        }
    }
 
}
```