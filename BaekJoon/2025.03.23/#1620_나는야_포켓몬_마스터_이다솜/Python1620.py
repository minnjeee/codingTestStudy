import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))

map1 = dict() # int : string
map2 = dict() # string : int
for i in range(N):
    name = input().rstrip()
    map1[str(i+1)] = name
    map2[name] = str(i+1)

result = []
for _ in range(M):
    key = input().rstrip()
    if key in map1.keys():
        result.append(map1.get(key))
    else :
        result.append(map2.get(key))
print("\n".join(result))