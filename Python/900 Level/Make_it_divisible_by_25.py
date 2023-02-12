def check_for(x, i, s):
    while i >= -len(x):
        if x[i] in s:
            return i
        i -= 1
    return -1


def makeDivisible(x):
    i = -1
    zero = True
    five = True
    r = len(x)
    while i >= -len(x):
        if x[i] == "0" and zero:
            zero = False
            m = check_for(x, i-1, "05")
            if m == -1:
                i -= 1
                continue
            r = min((i*-1)-1+(i-m)-1, r)

        elif x[i] == "5" and five:
            five = False
            m = check_for(x, i-1, "27")
            if m == -1:
                i -= 1
                continue
            r = min((i*-1)-1+(i-m)-1, r)

        i -= 1
    print(r)


n = int(input())
while n > 0:
    x = input()
    makeDivisible(x)
    n -= 1
