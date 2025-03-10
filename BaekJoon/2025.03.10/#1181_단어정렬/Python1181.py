import sys
input = sys.stdin.readline

# 입력
N = int(input())
input_list = []
for i in range(N):
    input_one = input().rstrip()
    # 중복 제거
    if input_one in input_list: continue
    input_list.append(input_one)

# 정렬
input_list.sort(key=lambda x: (len(x), x))

# 출력
result = '\n'.join(input_list)
print(result)