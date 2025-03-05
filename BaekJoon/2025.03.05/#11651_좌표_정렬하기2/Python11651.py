import sys
input = sys.stdin.readline
print = sys.stdout.write

N = int(input())

input_list = [[0]*2 for _ in range(N)]

for i in range(N):
    input_list[i] = list(map(int, input().split(' ')))

input_list.sort(key=lambda x: (x[1], x[0]))

result = [0] * N
for i in range(N):
    result[i] = " ".join(list(map(str, input_list[i])))
print("\n".join(result)) 