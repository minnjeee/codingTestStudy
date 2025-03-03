import sys
input = sys.stdin.readline

# 입력 받기 (문자열)
inputs = input().rstrip()

# 문자열 뒤집기
sorted_inputs = sorted(inputs, reverse=True)

# 뒤집은 문자열 하나씩 출력
for i in sorted_inputs :
    print(i, end='')
print()