x = int(input())
result = []
for i in range(x):
    strng = input()
    answer = 0
    count = 0
    one = False
    for ch in strng:
        if ch == '1' and one:
            answer += count
            count = 0
        elif ch == '1' and not (one):
            one = True
        elif ch == '0' and one:
            count += 1
    result.append(answer)

for i in result:
    print(i)
