a1, a0 = map(int, input().split(' '))
c = int(input())
n0 = int(input())

# f(n) = a1 * n + a2
# g(n) = c * n
if a1 < c :
    if a1 * n0 + a0 <= c * n0 : print(1)
    else : print(0)
elif a1 == c :
    if a0 <= 0 : print(1)
    else : print(0)
else : print(0)
