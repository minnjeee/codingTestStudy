import math

A, B, V = map(int, input().split(' '))

n = math.ceil((V-B)/(A-B))

print(n)