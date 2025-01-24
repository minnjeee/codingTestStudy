num = int(input())

minNum, maxNum = 2, 1
idx = 0
result = 1
while True:
    if (num == 1) : 
        print(result)
        break
    minNum += 6 * idx
    maxNum += 6 * (idx+1)
    result += 1
    if (minNum <= num) and (num <= maxNum) :
        print(result)
        break
    idx += 1