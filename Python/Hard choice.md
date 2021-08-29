# Hard choice

## problem

- In long flights, airlines offer hot meals. Usually the flight attendants push carts containing the meals down along the aisles of the plane. 
  - When a cart reaches your row, you are asked right away: “Chicken, beef, or pasta?” You know your choices, but you have only a few seconds to choose and you don’t know how your choice will look like because your neighbor hasn’t opened his wrap yet. . .
    - The flight attendant in this flight decided to change the procedure. 
    - First she will ask all passengers what choice of meal they would prefer, and then she will check if the number of meals available in this flight for each choice are enough.

- As an example, consider that the available number of meals for chicken, beef and pasta are respectively (80, 20, 40), while the number of passenger’s choices for chicken, beef and pasta are respectively (45, 23, 48). 
  - In this case, eleven people will surely not receive their selection for a meal, since three passengers who wanted beef and eight passengers who wanted pasta cannot be pleased.

- Given the quantity of meals available for each choice and the number of meals requested for each choice, could you please help the flight attendant to determine how many passengers will surely not receive their selection for a meal?

## 입력

- The first line contains three integers Ca, Ba and Pa (0 ≤ Ca, Ba, Pa ≤ 100), representing respectively the number of meals available for chicken, beef and pasta. 
  - The second line contains three integers Cr, Br and Pr (0 ≤ Cr, Br, Pr ≤ 100), indicating respectively the number of meals requested for chicken, beef and pasta.

## 풀이

``` Python
ans = 0
a, b, c = map(int, input().split())
d, e, f = map(int, input().split())

if a - d < 0:
  n1 = d - a
  ans += n1
else:
  n1 = a - d
if b - e < 0:
  n2 = e - b
  ans += n2
else:
  n2 = b - e
if c - f < 0:
  n3 = f - c
  ans += n3
else:
  n3 = c - f
print(ans)

```
