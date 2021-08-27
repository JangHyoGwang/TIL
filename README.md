# HG-TIL

## 작성법

1.제목과 본문을 한 줄 띄워 분리하기   
2.제목은 영문 기준 50자 이내로 작성하기    
3.제목 첫글자를 대문자로   
4.제목 끝에 . 금지   



# Language

#### - [Java](https://github.com/JangHyoGwang/TIL/blob/main/Java/Java.md)
    
#### - [Python](https://github.com/JangHyoGwang/TIL/blob/main/Python/Python.md)

``` Python
h, m, s = map(int, input().split())
oven = int(input())

h += oven // 3600
m += (oven % 3600) // 60
s += ((oven % 3600) % 60) 

if s >= 60:
  m += 1
  s -= 60

if m >= 60:
  h += 1
  m -= 60

if h >= 24:
  h -= 24

print('%d %d %d' % (h,m,s))

```
