package Day_07연습장;

public class String메서드1 {

	public static void main(String[] args) {
		String str = "Ezen Computer";
		// charAt(index) : index번지에 있는 문자를 반환
		 System.out.println("---chatAt(0)---");
		 System.out.println(str.charAt(0));
		 
		 //compareTo(str) : str문자열과 비교하여 같으면 0 사전순으로 앞이면 -1, 뒤
		 System.out.println("---compareTo---");
		 System.out.println("b".compareTo("b"));
		 System.out.println("b".compareTo("a"));
		 System.out.println("b".compareTo("c"));
		 
		 // concat 이어붙히기 (+ <= 연결 연산자와 같은 기능)
		 System.out.println("---concat---");
		 System.out.println("Hello".concat(" world"));
		 System.out.println("Hello" + " world");
		 
		 // equals : == 두 문자열이 같은지 확인 (대소문자 구분) 많이 사용함.
		 System.out.println("---equals---");
		 System.out.println("hello".equals("hello"));
		 System.out.println("hello".equals("Hello")); // H 대문자 적용시 false
		 
		 // indexOf : 해당 문자열의 위치가 어디에 있는지 확인
		 System.out.println("---indexOf---");
		 String str1 = "Hello World";
		 char serch1 = 'W';
		 int index = str1.indexOf(serch1);
		 System.out.println(index);
		 
		 String serch2 = "World";
		 int index2 = str1.indexOf(serch2,6); // 찾으려고 하는 값에 대한 찾고자 하는 시작위치를 지정할 수 있음.
		 System.out.println(index2); // 시작번지를 알려줌.
		 
		 // replace : 찾아바꾸기
		 System.out.println("---replace---");
		 System.out.println("Hello world".replace('w', 'W'));
		 System.out.println("Hello world".replace("world", "JAVA"));
		 
		 //split : 나누기
		 System.out.println("---split---");
		 String[] arr = "dog,cat,tiger".split(",");
		 for(String tmp : arr) {
			 System.out.println(tmp);
		 }
		 
		 // join : 붙히기
		 System.out.println("---join---");
		 System.out.println(String.join(",", arr));
		 
		 // substring : 글자의 부분 추출
		 System.out.println("---substring---");
		 String fileName = "String메서드.java";
		 int index3 = fileName.indexOf(".");
		 String suffix = fileName.substring(index3+1);
		 System.out.println(fileName + "의 확장자 : " + suffix);
	}

}
