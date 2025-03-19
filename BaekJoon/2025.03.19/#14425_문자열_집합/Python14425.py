import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))

n_list = []
for i in range(N):
    n_list.append(input())

n_set = set(n_list)

m_list = []
for i in range(M):
    m_list.append(input())

result = 0
for m_item in m_list:
    if m_item in n_set: result += 1

print(result)