x, y = [int(i) for i in input().split()]
count_row = 0
cols = []
for i in range(x):
    inp = input()
    flag = False
    for indx, j in enumerate(inp):
        if j == 'S':
            flag = True
            if indx not in cols:
                cols.append(indx)
    if not (flag):
        count_row += 1
count_col = y-len(cols)
print(count_row*y+count_col*x-count_row*count_col)
