inputStrList = input().split(' ')
N = inputStrList[0]
B = int(inputStrList[1])

nInt = 0
N_len = len(N)-1
result = 0
for n in N :
    if n >= 'A' and n <= 'Z' :
        nInt = ord(n) - 55
    else :
        nInt = int(n)
    print(nInt)
    result += (B ** N_len) * nInt
    N_len -= 1

print(result)