# Every Second Counts

## problem

- Meredith runs a taxi service called Ruber which offers rides to clients in small towns in western Pennsylvania. 
  - She wants to get every possible dime out of people who use her taxis, so her drivers charge a flat fee not per minute but per second. '
    - It’s important, therefore, to be able to determine the exact amount of elapsed time between the moment a client enters a cab until the moment they leave. 
    - Trying to write a program to do this has driven Meredith crazy (pun intended) so she’s come to you for some help.

## 입력
- Input consists of two lines: the first contains the start time and the second contains the end time for a single taxi ride. 
  - Each time is of the form hh : mm : ss, giving the hour, minute and seconds. 
    - Meredith uses a 24 hour clock, with 0 : 0 : 0 representing 12 midnight and 23 : 59 : 59 representing one second before midnight. 
    - Note that the end time may have a value less than the start time value if the ride spans midnight (see the last sample test case for an example of this).

## 풀이

- 삽질한 코드
  - 택시를 타고나서 자정을 넘어가는 케이스(3번 케이스)때문에 너무 어렵게 생각한 나머지
  - 간단하게 짤 수 있는 코드를 어렵게 돌아갔다.. 
``` Python
ride = input().split()
arrive = input().split()

# 계산의 편리함을 위해 24 시간제에서 12시간제로 변경.

if 12 < int(arrive[0]):
  arrive[0] = int(arrive[0]) - 12
  
if 12 < int(ride[0]):
  ride[0] = int(ride[0]) - 12

if int(ride[0]) > int(arrive[0]):
    arrive[0] = int(arrive[0]) + 12

if int(ride[2]) > int(arrive[2]):
  arrive[2] = int(arrive[2]) + 60
  arrive[0] = int(arrive[0]) - 1

if int(ride[4]) > int(arrive[4]):
  arrive[4] = int(arrive[4]) + 60
  arrive[2] = int(arrive[2]) - 1

ridea = (int(arrive[0]) - int(ride[0])) * 3600
rideb = (int(arrive[2]) - int(ride[2])) * 60
ridec = int(arrive[4]) - int(ride[4])

print(ridea + rideb + ridec)
```

- 타인의 코드를 참고한 소스코드

``` Python
rh1, rm1, rs1 = map(int, input().split(':'))
ah2, am2, as2 = map(int, input().split(':'))
t1 = rh1*3600 + rm1*60 + rs1
t2 = ah2*3600 + am2*60 + as2

if t1 > t2:
    print(t2-t1+3600*24)
else:
    print(t2-t1)
```
