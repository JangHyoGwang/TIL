# N-Queen

## 문제

- N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
  - N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

## 입력

- 첫째 줄에 N이 주어진다. (1 ≤ N < 15)

## 출력

- 첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.

## 풀이

``` Python
# x번째 행에 놓은 queen 검증
def check(x):
    # 이전 행에서 놓았던 모든 queen 확인
    for i in range(x):
      # 위쪽 혹은 대각선 확인
      if row[x] == row[i] or abs(row[x] - row[i]) == x - i:
        return False
    return True

# x번째 행에 대하여 처리
def DFS(x):
    global res
    if x == n:
        res += 1
    else:
        # x번째 행의 각 열에 queen을 둔다고 가정
        for i in range(n):
            row[x] = i
            # 해당 위치에 queen을 둬도 괜찮은 경우
            if check(x):
              # 다음 행으로 넘어가기
              DFS(x + 1)

n = int(input())
row = [0] * n
res = 0
DFS(0)
print(res)
```
