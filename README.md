# HG-TIL

## 작성법

1.제목과 본문을 한 줄 띄워 분리하기   
2.제목은 영문 기준 50자 이내로 작성하기    
3.제목 첫글자를 대문자로   
4.제목 끝에 . 금지   



# Language

#### - [Java](https://github.com/JangHyoGwang/TIL/blob/main/Java/Java.md)
    
#### - [Python](https://github.com/JangHyoGwang/TIL/blob/main/Python/Python.md)

``` 
import itertools

n = int(input())
card = []
for i in range(n):
  a = list(map(int, input().split()))
  card.append(a)

tmp = []
for i in range(len(card)):
    ans = itertools.combinations(card[i], 3) # 카드 3장을 뽑을 경우의 수 저장
    ans = list(ans)
    tmp.append([])
    for j in range(len(ans)):
      if sum(ans[j]) < 10:
        tmp[i].append(((j) , sum(ans[j])))
      else:
        tmp[i].append(((j) , (sum(ans[j]) % 10))) # 카드 3장의 합의 1의 자리 숫자를 저장

# tmp.sort(key = lambda x : x[1], reverse = True)

for k in range(len(tmp)):
  print(tmp[k])
```   
      



