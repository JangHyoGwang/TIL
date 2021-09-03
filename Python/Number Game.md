# Number Game

# 문제

- 창영이는 심심해서 혼자 재미 없는 게임을 하나 생각해냈다. 숫자 N을 먼저 정하고, 이 숫자를 2진법, 3진법, 4진법, ..., 100만진법, 100만 1진법 등등으로 바꾸어 보면서, 마지막자리에 연속된 0의 개수를 모두 더하는 것이다.
  - 예를 들어 N=5라면, 2진법 101, 3진법 12, 4진법 11, 5진법 10, 6진법 5, 7진법 5, ... 등과 같으므로 답은 1이 된다. 
    - 여러분이 할 일은 주어진 N에 대해서 창영이가 구한 답을 찾는 것이다. 정확히 설명하기 위해 수학식으로 쓰자면, f(N, b)를 N을 b진법으로 나타냈을 때 마지막에 따르는 연속된 0의 개수로 정의 할 때를 구하는 것이다.

## 입력

- 첫 줄에 테스트 케이스의 수 T가 주어진다. 다음 T줄에 걸쳐서 N이 주어진다.

## 풀이

``` Python
from sys import stdin

def func(n, i):
  if n % i == 0:
    return 1 + func(n//i, i)
  else:
    return 0

for i in range(int(stdin.readline())):
  n = int(stdin.readline())
  cnt = 0
  for i in range(2, n+1):
    cnt += func(n, i)
  print(cnt)
```
 

