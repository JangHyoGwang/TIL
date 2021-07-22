package 연습장3;

public class String메서드1 {

	public static void main(String[] args) {
		
		String str = "Ezen Computer";
		
		System.out.println("-----charAt(0)----");
		System.out.println(str.charAt(0));

		System.out.println("-----compareTo----");
		System.out.println("b".compareTo("c"));
		System.out.println("b".compareTo("b"));
		System.out.println("b".compareTo("a"));
		
		System.out.println("-----concat----");
		System.out.println("Hello".concat(" world"));
		
		System.out.println("-----equals---");
		System.out.println("Hello".equals("Hello"));
		System.out.println("Hello".equals("hello"));
		
		System.out.println("-----indexOf---");
		char serch = 'C';
		int index = str.indexOf(serch);
		System.out.println(index);
		
		String serch2 = "Computer";
		int index2 = str.indexOf(serch2,3);
		System.out.println(index2); // 시작번지를 알려줌.
		
		System.out.println("-----replace---");
		System.out.println("Hello World".replace("World", "JAVA"));
		
		System.out.println("-----split---");
		String Animal[] = "Dog,cat,tiger".split(",");
		for(String tmp : Animal) {
			System.out.println(tmp);
		}
		
		System.out.println("-----join---");
		System.out.println(String.join(",", Animal));
		
		System.out.println("-----substring---");
		String fileName = "String메서드.java";
		int index3 = fileName.indexOf(".");
		String suffix = fileName.substring(index3+1);
		System.out.println(fileName + "의 확장자 : " + suffix);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
