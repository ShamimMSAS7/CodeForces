n = int(input())
result = []
for i in range(n):
    x = int(input())
    if x % 2 == 1:
        x += 1
    time = round(5 * x//2)
    if time < 15:
        time = 15
    result.append(time)

for i in result:
    print(i)
