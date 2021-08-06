# StringTokenizer

## 기본 및 사용법

- StringTokenizer 클래스는 문자열을 구분자를 이용하여 쪼갤 때 사용할 수 있다. (쪼갠다. = 파싱한다.)

- 예를 들어 "Hi I'm Yangs!!" 라는 문자열을 " "(공백)을 구분자로 "HI", "I'm", "Yangs!!" 이렇게 3개로 쪼개는 것이 가능하다.

- Token을 구분자에 의해 쪼개진 단어라고 생각하면 된다.

## StringTokenizer 생성

- StringTokenizer(String str) : 파싱 할 문자열을 인자로 받는다. 구분자를 지정하지 않았으므로 스페이스, 탭, 줄바꿈, 캐리지 리턴 등 기본 구분자가 적용된다.

- StringTokenizer(String str, String delim) : 파싱할 문자열과 구분자를 인자로 받는다.

- StringTokenizer(String str, String delim, boolean flag) : flag는 구분자 자체도 토큰으로 인식하게 할지 여부를 정한다. 예를 들어 true라면 "Hi I'm Yangs!!"는 공백을 포함하여"HI", " ", "I'm", " ", "Yangs!!" 이렇게 5개의 토큰으로 파싱 된다.

``` Java
String source = "Hi I'm Yangs!!"; StringTokenizer tokenizer1 = new StringTokenizer(source); 
while(tokenizer1.hasMoreTokens()){ 
System.out.println("tokenizer1's token : " + tokenizer1.nextToken()); 
} 

StringTokenizer tokenizer2 = new StringTokenizer(source, " "); 
while(tokenizer2.hasMoreTokens()){ System.out.println("tokenizer2's token : " + tokenizer2.nextToken()); 
} 
StringTokenizer tokenizer3 = new StringTokenizer(source, " ", true); 
while(tokenizer3.hasMoreTokens()){ System.out.println("tokenizer3's token : " + tokenizer3.nextToken()); 
}

```

```
// 출력결과
tokenizer1's token : Hi
tokenizer1's token : I'm
tokenizer1's token : Yangs!!

tokenizer2's token : Hi
tokenizer2's token : I'm
tokenizer2's token : Yangs!!

tokenizer3's token : Hi
tokenizer3's token :  
tokenizer3's token : I'm
tokenizer3's token :  
tokenizer3's token : Yangs!!

``` 
## 사용법

### StringTokenizer를 이용하여 문자열 -> 배열로 파싱하기

- 가장 많이 사용되는 문자열을 파싱하여 배열에 담는 예제이다.

- hasMoreTokens()로 총토큰의 개수를 구하고, nextToken()으로 한 토큰씩 꺼낼 수 있다.

- StringTokenizer는 구분자에 의해서 파싱 후 빈 토큰은 버리는 동작을 확인할 수 있다.

``` Java
String source = "|문자열||에서|배열로|갑니다|"; 

// StringTokenizer 생성
StringTokenizer tokenizer = new StringTokenizer(source, "|"); 
System.out.println("총 토큰 갯수 : " + tokenizer.countTokens()); // 총 토큰 갯수 : 4 
String[] arr = new String[4]; // 결과 배열 
int idx = 0; 
while (tokenizer.hasMoreTokens()){ 
arr[idx] = tokenizer.nextToken(); // 배열에 한 토큰씩 담기 idx++; 
} System.out.println(Arrays.toString(arr)); // [문자열, 에서, 배열로, 갑니다]
```
### 여러 구분자로 파싱하기

- StringTokenizer 생성자 구분자를 여러 개 지정하면 된다. > new StringTokenizer(source, ",|;!")

``` Java
String source = "|문자열,,에서|배열로;갑니다!"; 
StringTokenizer tokenizer = new StringTokenizer(source, ",|;!"); 
System.out.println("총 토큰 갯수 : " + tokenizer.countTokens()); // 총 토큰 갯수 : 4 
String[] arr = new String[4]; int idx = 0; 
while (tokenizer.hasMoreTokens()){ 
arr[idx] = tokenizer.nextToken(); idx++; } System.out.println(Arrays.toString(arr)); // [문자열, 에서, 배열로, 갑니다]

```










