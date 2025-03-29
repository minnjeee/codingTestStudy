import sys
input = sys.stdin.readline

s = input().rstrip();

n = 0
result = set()
for i in range(1, len(s)+1): # i = 1,2,3,4,5 (몇글자씩)
    n=0
    for j in range(len(s), 0, -1): # j = 5,4,3,2,1 (반복)
        result.add(s[n:n+i])
        n += 1

print(len(result))