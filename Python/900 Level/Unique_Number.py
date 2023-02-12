x = int(input())
dict = {}
for i in range(10):
    dict[i] = i
for i in range(10, 46):
    sum = 9
    digits = "9"
    for j in range(8, 0, -1):
        if sum+j < i:
            sum += j
            digits = str(j)+digits
        elif sum+j == i:
            dict[i] = int(str(j)+digits)
            break

result = []
for i in range(x):
    n = int(input())
    if n > 45:
        result.append(-1)
    else:
        result.append(dict[n])

for i in result:
    print(i)
