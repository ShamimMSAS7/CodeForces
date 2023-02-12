x = int(input())
result = []
for i in range(x):
    n = int(input())
    lst = [2*3, 2*5, 2*7]
    lst.append(n-sum(lst))
    if lst[3] <= 0:
        result.append("NO")
    elif lst[3] in lst[:3]:
        temp = lst[3]
        result.append("YES")
        result.append([2*3, 2*5, 3*5, temp-1])
    else:
        result.append("YES")
        result.append(lst)

for i in result:
    if i == 'YES' or i == 'NO':
        print(i)
    else:
        print(i[0], i[1], i[2], i[3])
