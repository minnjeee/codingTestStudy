import sys
input = sys.stdin.readline

N, M = map(int, input().rstrip().split(' '))
n_set = set([input().rstrip() for _ in range(N)])
m_set = set([input().rstrip() for _ in range(M)])

tmp = []
# for m in m_set:
#     if m in n_set:
#         tmp.append(m)
tmp = n_set & m_set # 교집합을 구하는 연산자 (또는 n_set.intersection(m))
'''
참고 노트 :
- set1 & set2 또는 set1.intersection(set2) : set1과 set2의 교집합
- set1 | set2 또는 set1.union(set2) : set1과 set2의 합집합
- 나의 기존 코드는 for문을 이용하여 풀었지만, 더 간단한 집합 연산자가 있음!! 기억해두자!
'''

# result = list(str(len(tmp))) 
# result.extend(sorted(tmp))
# print('\n'.join(result))
'''
오답 노트 : 
- 숫자를 문자열로 변환하여 list()로 만드는 것에서 문제가 발생할 수 있음
- len(tmp) 가 12가 된다면 str(12) 는 "12"이고, list("12")는 ["1", "2"]가 되어버림!!!!
'''

print(len(tmp))
print('\n'.join(sorted(tmp)))