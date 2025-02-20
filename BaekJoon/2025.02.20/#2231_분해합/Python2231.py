N = int(input())

result = 0

for i in range(N):
    constructor = i
    compareNum = i
    copy_i = i

    while True:
        compareNum += copy_i % 10
        if copy_i // 10 == 0 : break
        copy_i = copy_i // 10

    if (compareNum == N) :
        result = constructor
        break
    
print(result)