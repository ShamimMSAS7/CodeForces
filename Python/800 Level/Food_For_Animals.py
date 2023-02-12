x = int(input())
result = []
for i in range(x):
    a, b, c, x, y = [int(j) for j in input().split()]
    if a+c >= x and b+min(c, a+c-x) >= y:
        result.append("YES")
    else:
        result.append("NO")
for i in result:
    print(i)
