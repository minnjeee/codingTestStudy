import sys
input = sys.stdin.readline

n, m = map(int, input().rstrip().split(' '))
n_set = set(input().rstrip().split(' '))
m_set = set(input().rstrip().split(' '))

num = len(n_set & m_set)
result = n + m - 2*num
print(result)