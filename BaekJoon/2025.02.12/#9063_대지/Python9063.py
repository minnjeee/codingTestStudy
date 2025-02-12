n = int(input())

xList = []
yList = []
for i in range(n) :
    x, y = map(int, input().split(' '))
    xList.append(x)
    yList.append(y)

print((max(xList) - min(xList)) * (max(yList) - min(yList)))