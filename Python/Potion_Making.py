x = int(input())
result = []
for i in range(x):
    essence = int(input())
    n = 1
    while essence % n != 0 or 100 % (essence//n) != 0:
        n += 1
    result.append(100//(essence//n))
for i in result:
    print(i)
