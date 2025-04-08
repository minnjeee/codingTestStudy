import sys
input = sys.stdin.readline

def gcd(a, b):
    while b!=0 :
        a, b = b, a % b
    return a

n = int(input().rstrip())
trees = [0] * n
diffs = [0] * (n-1)
for i in range(n):
    trees[i] = int(input().rstrip())
    if i!=0: diffs[i-1] = trees[i] - trees[i-1]

diffGCD = diffs[0]
for diff in diffs:
    diffGCD = gcd(diffGCD, diff)

result = ((trees[n] - trees[0])/diffGCD + 1) - n

print(result)