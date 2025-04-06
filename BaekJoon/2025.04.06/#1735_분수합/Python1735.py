def gcd(a, b):
    while b!=0:
        temp = b
        b = a % b
        a = temp
    return a

n= list(map(int, input().split(' ')))
m = list(map(int, input().split(' ')))

a = n[0]*m[1] + n[1]*m[0] # 기약분수 되기 전 분자
b = n[1]*m[1] # 기약분수 되기 전 분모

# a,b의 최대공약수(gcd) 로 분자 분모 나누기
result = list()
result.append(str(int(a/gcd(a,b))))
result.append(str(int(b/gcd(a,b))))
print(" ".join(result))