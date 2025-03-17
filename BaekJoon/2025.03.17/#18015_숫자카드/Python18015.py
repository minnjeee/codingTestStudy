import sys
input = sys.stdin.readline

input() # N
N_set = set(input().rstrip().split(' '))

input() # M
M_list = input().rstrip().split(' ')

result = []
for item in M_list:
    if item in N_set: result.append('1')
    else: result.append('0')
print(' '.join(result))

# **오답 노트**
# sys.stdin.readline으로 입력받을 경우, 끝의 개행 문자까지 함께 입력받아짐!
# 따라서 split(' ')이 진행되면 마지막 정수는 '8\n' 과 같이 입력받아질 수 있음!
# => rstrip()을 통해 개행 문자 처리를 진행한 후 이용하자