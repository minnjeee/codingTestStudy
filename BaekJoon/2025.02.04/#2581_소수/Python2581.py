M = int(input())
N = int(input())

minNum, sumNums = 0, 0
for i in range(M, N+1) :
    if i == 1 : continue
    plusYn = True
    for j in range(2, i) :
        if (i % j == 0) :
            plusYn = False
            break
    if plusYn :
        sumNums += i
        if minNum == 0 : minNum = i

if sumNums == 0 : print(-1)
else : print(f"{sumNums}\n{minNum}")