package Day_07������;

public class String�޼���1 {

	public static void main(String[] args) {
		String str = "Ezen Computer";
		// charAt(index) : index������ �ִ� ���ڸ� ��ȯ
		 System.out.println("---chatAt(0)---");
		 System.out.println(str.charAt(0));
		 
		 //compareTo(str) : str���ڿ��� ���Ͽ� ������ 0 ���������� ���̸� -1, ��
		 System.out.println("---compareTo---");
		 System.out.println("b".compareTo("b"));
		 System.out.println("b".compareTo("a"));
		 System.out.println("b".compareTo("c"));
		 
		 // concat �̾������ (+ <= ���� �����ڿ� ���� ���)
		 System.out.println("---concat---");
		 System.out.println("Hello".concat(" world"));
		 System.out.println("Hello" + " world");
		 
		 // equals : == �� ���ڿ��� ������ Ȯ�� (��ҹ��� ����) ���� �����.
		 System.out.println("---equals---");
		 System.out.println("hello".equals("hello"));
		 System.out.println("hello".equals("Hello")); // H �빮�� ����� false
		 
		 // indexOf : �ش� ���ڿ��� ��ġ�� ��� �ִ��� Ȯ��
		 System.out.println("---indexOf---");
		 String str1 = "Hello World";
		 char serch1 = 'W';
		 int index = str1.indexOf(serch1);
		 System.out.println(index);
		 
		 String serch2 = "World";
		 int index2 = str1.indexOf(serch2,6); // ã������ �ϴ� ���� ���� ã���� �ϴ� ������ġ�� ������ �� ����.
		 System.out.println(index2); // ���۹����� �˷���.
		 
		 // replace : ã�ƹٲٱ�
		 System.out.println("---replace---");
		 System.out.println("Hello world".replace('w', 'W'));
		 System.out.println("Hello world".replace("world", "JAVA"));
		 
		 //split : ������
		 System.out.println("---split---");
		 String[] arr = "dog,cat,tiger".split(",");
		 for(String tmp : arr) {
			 System.out.println(tmp);
		 }
		 
		 // join : ������
		 System.out.println("---join---");
		 System.out.println(String.join(",", arr));
		 
		 // substring : ������ �κ� ����
		 System.out.println("---substring---");
		 String fileName = "String�޼���.java";
		 int index3 = fileName.indexOf(".");
		 String suffix = fileName.substring(index3+1);
		 System.out.println(fileName + "�� Ȯ���� : " + suffix);
	}

}
