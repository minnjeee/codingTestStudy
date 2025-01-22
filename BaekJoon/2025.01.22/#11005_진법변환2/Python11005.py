inputStrList = input().split(" ")
N10 = int(inputStrList[0])
B = int(inputStrList[1])

result = ""

while True:
    temp = N10 // B # 몫 
    rest = N10 % B # 나머지
   
    if rest >= 10 and rest <= 35 :
        result = chr(rest + 55) + result
    else:
        result = str(rest) + result
    if temp == 0 : break
    N10 = temp
    
print(result)