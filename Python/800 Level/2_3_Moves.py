x = int(input())
result = []
for i in range(x):
    num = int(input())
    if num % 3 == 0:
        result.append(num//3)
    elif num == 1:
        result.append(2)
    else:
        result.append(num//3+1)

for i in result:
    print(i)
