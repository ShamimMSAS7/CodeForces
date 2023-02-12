x = int(input())
result = []
for i in range(x):
    key = int(input())
    doors = [int(j) for j in input().split()]
    open = [False, False, False]
    open[key-1] = True
    for j in range(2):
        if doors[key-1] == 0:
            break
        else:
            key = doors[key-1]
            open[key-1] = True
    if False in open:
        result.append("NO")
    else:
        result.append("YES")

for i in result:
    print(i)
