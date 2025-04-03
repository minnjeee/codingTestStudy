def gcd(a, b):
    while b != 0:
        temp = b
        b = a % b
        a = temp
    return a


n, m = map(int, input().split(' '))

print(int((n/gcd(n,m))*m))
