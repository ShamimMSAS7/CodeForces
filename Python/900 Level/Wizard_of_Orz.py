def printNumber(x):
    r = "989"
    if x <= 3:
        print(r[:x])
    else:
        print(r, end="")
        m = 3
        while m < x:
            print((m-3) % 10, end="")
            m += 1
        print()


n = int(input())
while n > 0:
    x = int(input())
    printNumber(x)
    n -= 1
