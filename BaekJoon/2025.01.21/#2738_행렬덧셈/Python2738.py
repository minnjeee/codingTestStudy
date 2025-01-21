inputNM = input().split(' ')
N = int(inputNM[0])
M = int(inputNM[1])

A = [[0 for j in range(M)] for i in range(N)]
B = [[0 for j in range(M)] for i in range(N)]
for i in range(N):
    inputA = input().split(' ')
    for j in range(M):
        A[i][j] = int(inputA[j])

for i in range(N):
    inputB = input().split(' ')
    for j in range(M):
        B[i][j] = int(inputB[j])

for i in range(N):
    for j in range(M):
        print(A[i][j] + B[i][j], end=' ')
    print()