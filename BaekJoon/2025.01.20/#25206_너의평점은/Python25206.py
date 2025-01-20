inputArr = []
for i in range(20) :
    inputArr.append(input())

gradeArr = ["A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"]

sum1 = 0
sum2 = 0
index = 0
for inputStr in inputArr :
    inputs = inputStr.split(" ")

    if inputs[2] == 'P' :
        continue
    
    if inputs[2] != 'F' :
        sum1 += float(inputs[1]) * (4.5 - 0.5 * float(gradeArr.index(inputs[2])))
    
    sum2 += float(inputs[1])
    
result = sum1 / sum2
print(round(result, 6))
        