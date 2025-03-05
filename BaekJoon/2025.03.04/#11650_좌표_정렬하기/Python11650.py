import sys
input = sys.stdin.readline
print = sys.stdout.write

N = int(input())

input_list = [[0]*2 for _ in range(N)]

for i in range(N):
    input_list[i] = list(map(int, input().split(' ')))

input_list.sort(key=lambda x: (x[0], x[1]))

result = [0] * N
for i in range(N):
    result[i] = " ".join(list(map(str, input_list[i])))
print("\n".join(result)) 


# 문자열 덧셈을 통해 한번에 출력했더니 시간 초과 발생
# => 
# result = ""
# for [x, y] in input_list:
#     result += str(x) + " " + str(y) + "\n"
# print(result)

# => join메서드로 문자열을 결합하여 한 번에 출력하여 통과!