'''
# 처음 풀이
# 시간 초과 발생
num = int(input())

a, b = 1, 1  # 분자, 분모
isToDown = True

for i in range(num):
    if i == 0 : continue
    elif i == 1:
        b+=1
        continue
    if isToDown:
        if b==1 :
            a+=1
            isToDown = False
            continue
        b-=1
        a+=1
    else:
        if a==1:
            b+=1
            isToDown = True
            continue
        b+=1
        a-=1
print(f"{a}/{b}")
'''

# 두번째 풀이
# for문으로 매번 +1을 하니 시간 초과가 나온 것 같아서
# 몇 번째 줄인지, 해당 줄에서 몇번째인지에 따라 분수 계산으로 변경
num = int(input())

# num = line(line + 1)/2
# line : 몇번째 줄인지
# n : 해당 줄에서 몇 번째 분수인지
line = 1
while True :
    if (line * (line+1))/2 >= num :
        break
    line+=1
if line > 2 :
    n = int(num - ((line-1) * line)/2)
elif line == 1: n = 1
elif line == 2: n = num - 1

# 홀수 줄이면 위로, 짝수 줄이면 밑으로
a, b = 1, 1 # 분자,분모
if(line % 2 == 0) : # 짝수
    a = n
    b = line - n + 1
else :
    a = line - n + 1
    b = n

print(f"{a}/{b}")