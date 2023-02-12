import math
n = int(input())
result = []
for i in range(n):
    x = int(input())
    strng = input().split()
    lst = [int(j) for j in strng]
    count = 0
    for j in range(len(lst)-1):
        mini = min(lst[j], lst[j+1])
        maxi = max(lst[j], lst[j+1])
        if maxi != mini:
            count += math.ceil(math.log2(maxi/mini))-1
    result.append(count)

for i in result:
    print(i)
