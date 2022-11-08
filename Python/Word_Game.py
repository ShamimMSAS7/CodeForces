n = int(input())
result = []
for i in range(n):
    x = int(input())
    first = input().split()
    second = input().split()
    third = input().split()
    dct = {}
    fscore = sscore = tscore = 3*x
    for i in first:
        dct[i] = 1
    for i in second:
        if i in dct:
            dct[i] += 5
            fscore -= 2
            sscore -= 2
        else:
            dct[i] = 5
    for i in third:
        if i in dct:
            if dct[i] == 1:
                fscore -= 2
                tscore -= 2
            elif dct[i] == 5:
                sscore -= 2
                tscore -= 2
            else:
                fscore -= 1
                tscore -= 3
                sscore -= 1

    result.append([fscore, sscore, tscore])


for i in result:
    print(i[0], i[1], i[2])
