num = int(input())

colorArea = [[0 for i in range(100)] for j in range(100)]

for i in range(num) :
    inputOne = input().split(' ')
    x = int(inputOne[0])
    y = int(inputOne[1])

    for j in range(x, x+10) :
        for k in range(y, y+10) :
            colorArea[j][k] = 1;

result = 0
for i in range(100) :
    for j in range(100) :
        if colorArea[i][j] == 1 : result += 1

print(result)