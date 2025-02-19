N, M = map(int, input().split(' '))
numbers = list(map(int, input().split(' ')))

result = 0
for i in range(N-2) :
    for j in range(i+1,N-1):
        for k in range(j+1,N):
            sumNum = numbers[i] + numbers[j] + numbers[k]
            if (sumNum <= M) and (sumNum > result) :
                result = sumNum

print(result)