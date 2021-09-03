# HG-TIL

## 작성법

1.제목과 본문을 한 줄 띄워 분리하기   
2.제목은 영문 기준 50자 이내로 작성하기    
3.제목 첫글자를 대문자로   
4.제목 끝에 . 금지   



# Language

#### - [Java](https://github.com/JangHyoGwang/TIL/blob/main/Java/Java.md)
    
#### - [Python](https://github.com/JangHyoGwang/TIL/blob/main/Python/Python.md)

n = int(input())
a = (2*n)-1

for i in range(a, -1, -1):
  if i % 2 == 1:
    print(' ' * int((a-i) // 2) + '*' * i + ' ' * int((a-i) // 2))

for i in range(2, a+1):
  if i % 2 == 1:
    print(' ' * int((a-i) // 2) + '*' * i + ' ' * int((a-i) // 2))
