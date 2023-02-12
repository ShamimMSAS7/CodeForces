x = int(input())
result = []
for i in range(x):
    input()
    start = [int(k) for k in input().split()]
    end = [int(k) for k in input().split()]
    obstacle = [int(k) for k in input().split()]
    if start[0] == end[0] and start[0] == obstacle[0] and (min(start[1], end[1]) < obstacle[1] < max(start[1], end[1])):
        result.append(abs(start[0]-end[0])+abs(start[1]-end[1])+2)
    elif start[1] == end[1] and start[1] == obstacle[1] and (min(start[0], end[0]) < obstacle[0] < max(start[0], end[0])):
        result.append(abs(start[0]-end[0])+abs(start[1]-end[1])+2)
    else:
        result.append(abs(start[0]-end[0])+abs(start[1]-end[1]))

for i in result:
    print(i)
