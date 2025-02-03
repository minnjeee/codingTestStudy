N = int(input())
numList = map(int, input().split(' '))

result = 0
for num in numList :
    plus_yn = True
    if (num == 1) : continue
    elif (num == 2) : result += 1
    else :
        for i in range(2,num) :
            if (num % i == 0) :
                plus_yn = False
                break
        if plus_yn : result += 1

print(result)