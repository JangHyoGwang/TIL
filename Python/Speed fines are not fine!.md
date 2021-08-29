# Speed fines are not fine!

## problem

- Many communities now have “radar” signs that tell drivers what their speed is, in the hope that they will slow down.
  - You will output a message for a “radar” sign. The message will display information to a driver based on his/her speed according to the following table:   
  
 
- |km/h over the limit|Fine.|        
  |:---:|:---:|
  |1 to 20|$100|
  |21 to 30|$270|
  |31 or above|$500|


## input

- The input will be two integers. The first line of input will be speed limit. The second line of input will be the recorded speed of the car.

## output

``` Python
limit_speed = int(input())
driver = int(input())

res = limit_speed - driver

if driver <= limit_speed:
  print('Congratulations, you are within the speed limit!')
elif res >= -20:
  print('You are speeding and your fine is $100.')
elif res >= -30:
  print('You are speeding and your fine is $270.')
else:
  print('You are speeding and your fine is $500.')

```
  
