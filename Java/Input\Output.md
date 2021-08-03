# InputStream과 메소드

![메소드](https://github.com/JangHyoGwang/TIL/blob/main/Java/12.JPG)

## InputStream은 바이트 기반 입력 스트림의 최상위 추상 클래스다.   
- 모든 바이트 기반 입력 스트림은 InputStream 클래스를 상속받아서 만들어진다.   
- InputStream 클래스의 주요 메소드는 다음과 같다.

|리턴타입|메소드|설명|
|--------|-------|------|
|int|read()|입력 스트림으로부터 1 byte를 읽고 읽은 바이트를 리턴|
|int|read(byte[]b)|입력 스트림으로부터 읽은 바이트들을 매개값으로 주어진 바이트 배열 b에 저장하고 실제로 읽은 바이트 수를 리턴|
|int|read(byte[]b, int off, int len)|입력 스트림으로부터 len 개의 바이트만큼 읽고 매개값으로 주어진 바이트 배열 b[off]부터 len 개까지 저장하고 실제로 읽은 바이트 수를 리턴|
|void|close()|사용한 시스템 자원을 반납하고 입력 스트림 닫음 (InputStream을 더 이상 사용하지 않을 경우에 호출)|

## read() 메소드   
- 입력 스트림으로부터 1 byte를 읽고 int 타입으로 리턴한다.   
리턴된 4 byte(int) 중 끝의 1 byte에만 데이터가 들어 있다.   
예를 들어 입력 스트림에서 10개의 바이트가 들어올 때, while 문 조건 안에 read() 메소드가 있다면 read() 메소드가 1 byte씩 10번을 읽는다.   

- 더 이상 입력 스트림으로부터 바이트를 읽을 수 없다면 read() 메소드는 -1을 리턴한다.
(아래의 read(byte[] b) 메소드와 read(byte[] b, int off, int len) 메소드도 동일함)
이를 이용해 다음과 같이 read 메소드를 사용할 수 있다.

-                                                           사용법                      
``` Java
InputStream is = new FileInputStream("C:/input.txt");
int readByte;
while ((readByte = is.read()) != -1) { ... }
```

## read(byte[] b) 메소드
- 입력 스트림으로부터 매개값으로 주어진 바이트 배열의 길이만큼 바이트를 읽고 배열에 저장한 후 읽은 바이트 수를 리턴.
예를 들어 입력 스트림에서 50개의 바이트가 들어올 때, while 문 조건 안에 길이가 3인 바이트 배열을 인수로 받은 read(byte[] b) 메소드가 있다면 read(byte[] b) 메소드가 3 byte 씩 17번을 읽는다.
마지막 17번째로 읽을 때에는 앞에서 이미 3*16 = 48 byte를 읽어서 2 byte만 남기 때문에 2 byte를 마저 읽은 후 2를 리턴한다.

- 많은 양의 바이트를 읽을 때 1 byte 씩 읽는 read() 메소드보다 매개값으로 주어진 배열 길이만큼 읽는 read(byte[] b) 메소드를 쓰는 것이 루프를 도는 횟수를 현저히 줄이는 방법이다.


-                                                           사용법                      
``` Java
InputStream is = new FileInputStream("C:/input.txt");
int readByte;
byte [] byteArray = new byte[100];
while ((readByte = is.read()) != -1) { ... }
```

## read(byte[] b, int off, int len) 메소드

- 입력 스트림으로부터 len 개의 바이트만큼 읽고, 매개 값으로 주어진 바이트 배열 b의 off 인덱스부터 len 개까지 저장한 후 읽은 바이트 수를 리턴.
예를 들어, 입력 스트림에서 50개의 바이트가 들어올 때, while 문 조건 안에 길이가 5인 byte 배열과 2(off), 2(len)을 매개변수로 받은 read(byte[] b, int off, int len) 메소드가 있다면 byte 배열의 인덱스 2(off)부터 길이(len) 만큼 바이트를 저장 즉, 인덱스 2와 3에만 값을 저장하며, 25번을 읽는다.
만약 off를 0으로, len을 배열의 길이로 준다면 read(byte[] b)와 동일하다.
따라서 read(byte[] b)메소드와 거의 동일한 방식으로 사용하여도 무방하다.

# 《 OutputStream과 메소드 》














