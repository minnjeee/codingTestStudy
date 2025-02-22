N, M = map(int, input().split(' '))
arr = []
for i in range(N):
    arr.append(input())

result = 64
for startRow in range(N-8+1) :
    for startCol in range(M-8+1) :
        resultB = 0
        currentRow = startRow
        currentCol = startCol
        for i in range(startRow, startRow+8):
            for j in range(startCol, startCol+8):
                if (currentRow % 2 != 0 and currentCol % 2 != 0 and arr[i][j] != 'B') \
                    or (currentRow % 2 != 0 and currentCol % 2 == 0 and arr[i][j] != 'W') \
                    or (currentRow % 2 == 0 and currentCol % 2 != 0 and arr[i][j] != 'W') \
                    or (currentRow % 2 == 0 and currentCol % 2 == 0 and arr[i][j] != 'B') :
                    resultB += 1

                currentCol += 1
            currentRow += 1
        resultMin = min(resultB, 64-resultB)
        if (resultMin < result): result = resultMin
print(result)
        
