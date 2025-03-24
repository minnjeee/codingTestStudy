import sys
input = sys.stdin.readline

input() # N
n_list = map(int, input().rstrip().split(' '))
n_dict = dict()
for n in n_list :
    if n in n_dict.keys() :
        n_dict[n] = n_dict[n] + 1
    else :
        n_dict[n] = 1

input() # M
m_list = map(int, input().rstrip().split(' '))
result = []
for m in m_list :
    if m in n_dict.keys() :
        result.append(str(n_dict[m]))
    else :
        result.append('0')
print(" ".join(result))