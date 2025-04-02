import sys
input = sys.stdin.readline

def gcd(a, b):
    while b != 0:
        temp = b
        b = a % b
        a = temp
    return a

def lcm(a, b):
    return (a / gcd(a,b)) * b
    
n = int(input().rstrip())
for i in range(n):
    a, b = map(int, input().rstrip().split(' '))
    print(str(int(lcm(a,b))))