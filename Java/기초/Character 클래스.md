# Character 클래스
- Character 클래스는 기본형 중 char의 값을 객체로 포장한다. Character 형태의 객체에는 char의 단일 필드가 들어간다.

- 또한 이 클래스는 문자의 형태를 판별해서 문자를 대문자로부터 소문자(또는 그 반대)로 변환하기 위한 각종 매서드도 제공한다.

## 생성자
- Character(char value)
Character 객체를 구축해 기본형 value 인수를 표현할 수 있도록 초기화한다.

## 주요 메서드

|메서드|설명|
|-----|----|
|char charValue()| Character 오브젝트의 값을 리턴한다.|
|int compareTo(Character anotherCharacter)|2개의 Character를 수치로서 비교한다.|
|int compareTo(Object o)|Character 객체를 지정된 객체와 비교한다.|
|static int digit(char ch, int radix)|지정된 기수에서의 문자 ch의 수치로서의 값을 리턴한다.|
|boolean equals(Object o)|현재 객제와 지정된 객체가 같은지 비교한다.|
|static char forDigit(int digit, int radix)|지정된 기수에서의 지정된 숫자의 문자 표현을 판정한다.|
|static int getNumericValue(char ch|)Unicode 문자를 정수로 리턴한다.|
|static int getType(char ch)|문자의 카테고리를 나타내는 값을 리턴한다.|
|int hashCode()|Character의 해시 코드를 리턴한다.|
|static boolean isDefined(char ch)|문자가 Unicode로 정의되어있는지를 판별한다.|
|static boolean isDigit(char ch)|지정된 문자가 숫자인지를 판별한다.|
|static boolean isIdentifierIgnorable(char ch)|지정된 문자가 Java 식별자 또는 Unicode 식별자내 무시할수있는 문자인지 판별|
|static boolean isISOControl(char ch)|지정된 문자가 ISO 제어 문자인지를 판별한다.|
|static boolean isJavaIdentifierPart(char ch)|지정된 문자가 Java 식별자의 선두 이외의 일부로서 사용할수있을지 판별한다.|
|static boolean isJavaIdentifierStart(char ch)|지정된 문자가 Java 식별자의 선두의 문자로서 사용할수있을지 판별한다.|
|static boolean isLetter(char ch)|지정된 문자가 범용 문자인지를 판별한다.|
|static boolean isLetterOrDigit(char ch)|지정된 문자가 범용 문자인지 숫자인지를 판별한다.|
|static boolean isLowerCase(char ch)}지정된 문자가 소문자인지를 판별한다.|
|static boolean isSpaceChar(char ch)|지정된 문자가 Unicode의 스페이스 문자인지를 판별한다.|
|static boolean isTitleCase(char ch)|지정된 문자가 타이틀 케이스 문자인지를 판별한다.|
|static boolean isUnicodeIdentifierPart(char ch)|지정된 문자가 Unicode 식별자의 선두 이외의 일부로서 사용할수있을지 판별한다.|
|static boolean isUnicodeIdentifierStart(char ch)|지정된 문자가 Unicode 식별자의 선두 문자로서 사용할수있을지 판별한다.|
|static boolean isUpperCase(char ch)|지정된 문자가 대문자인지를 판별한다.|
|static boolean isWhitespace(char ch)|지정된 문자가 Java의 기분에 따른 공백인지를 판별한다.|
|tatic char toLowerCase(char ch)|정된 문자를 대응하는 소문자에 매핑한다.|
|tring toString()|자의 값을 표현하는 String 객체를 리턴한다.|
|tatic char toTitleCase(char ch)|의 인수를 대응하는 타이틀 케이스로 변환한다.|
|tatic char toUpperCase(char ch)|자의 인수를 대응하는 대문자로 변환한다.|
