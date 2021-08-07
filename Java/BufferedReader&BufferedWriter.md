# BufferedReader / BufferedWriter

- BufferedReader 클래스는 버퍼를 이용하는 대표적인 I/O(Input/Output) 클래스다

- 입력된 데이터를 바로 전달하는 것이 아닌, 버퍼에 저장해두었다가 전달하는 방법이다

------

- Stream으로 끝나는 클래스 : 바이트 단위로 입출력을 수행하는 클래스

- Reader / Writer로 끝나는 클래스 : 캐릭터 단위로 입출력을 수행하는 클래스

- File로 시작하는 클래스 : 하드디스크의 파일을 사용하는 클래스

- Data로 시작하는 클래스 : 자바의 원시 자료형을 출력하기 위한 클래스

- Buffered로 시작하는 클래스 : 시스템의 버퍼를 사용하는 클래스 
------
 

- 보통 자바에서 입력은 Scanner 클래스를 배워 사용한다

- 두 클래스의 차이점은,
Scanner 클래스는 Space, Enter 모두 경계로 입력값을 인식하고,
BufferedReader 클래스는 Enter만을 경계로 입력값을 인식한다
그래서 가공하는 작업이 추가로 필요하다 (구분하여 나누기 작업)

 

- 데이터의 양이 적을 때는 차이가 미미하겠지만 양이 많을 경우에
하나하나씩 전달하지 않고 버퍼에 한 번에 모아서 전달하는 BufferedReader클래스가
속도면에서 빠르고 효율적이다.<br/><br/>


## 사용방법

``` Java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public static void main(String[] args) throws IOException {
//선언
BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//파일에서 입력받을 경우에는 new BufferedReader(new FileReader("ex.java"));
//라인단위로 입력받기(Enter를 경계로)
String str = bf.readLine();
//정수형 입력이라면, 형변환 필수!
int i = Integer.parseInt(bf.readLine());
//Space를 경계로 끊어야 할 때
String arr[] = str.split(" ");
//또는 StringTokenizer 클래스 이용)
}
```

``` Java
//선언
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
String str = "Print str";
//출력
bw.writer(str);
//개행
bw.newLine();
//남아있는 데이터 모두 출력
bw.flush();
//스트림 닫기
bw.close();

```

## 주요 메서드

|메서드명|기능|
|------|---|
|BufferedReader(Reader rd)|rd에 연결되는 문자입력 버퍼스트림 생성|
|BufferedWriter(Writer wt)|wt에 연결되는 문자출력 버퍼스트림 생성|
|int read()|스트림으로부터 한 문자를 읽어서 int 형으로 리턴|
|int read(char[] buf)|문자배열 buf의 크기만큼 문자를 읽어들임.  읽어들인 문자 수를 리턴|
|int read(char[] buf, int offset, int length)|buf의 offset위치에서부터 length 길이만큼 문자를 스트림으로부터 읽어들임|
|String readLine()|스트림으로부터 한 줄을 읽어 문자열로 리턴|
|void mark()|현재위치를 마킹, 차 후 reset() 을 이용하여 마킹위치부터 시작함|
|void reset() |마킹이 있으면 그 위치에서부터 다시시각, 그렇지 않으면 처음부터 다시시작|
|long skip(int n)|n 개의 문자를 건너 뜀|
|void close()|스트림 닫음|
|void write(int c)|int 형으로 문자 데이터를 출력문자스트림으로 출력|
|void write(String s, int offset, int length)|문자열 s를 offset 위치부터 length 길이만큼을 출력스트림으로 출력|
|void write(char[] buf, int offset, int length)|문자배열 buf의 offset 위치부터 length 길이만큼을 출력스트림으로 출력|
|void newLine()|줄바꿈 문자열 출력|
|void flush() |남아있는 데이터를 모두 출력시킴.|







