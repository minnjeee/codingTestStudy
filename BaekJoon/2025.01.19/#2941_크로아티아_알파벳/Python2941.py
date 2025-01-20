""" 1번째 풀이
inputStr = input()

croatias = ["c=","c-","dz=","d-","lj","nj","s=","z="]

result = 0
num = 0
newInputStr = ""
for croatia in croatias:
    if croatia in inputStr :
        newInputStr = inputStr.replace(croatia, " ")
        num = (len(inputStr.replace(" ","")) - len(newInputStr.replace(" ","")))/len(croatia)
        result = result + num
        inputStr = newInputStr

result = int(result + len(inputStr.replace(" ","")))
print(result)
"""

# 2번째 풀이
inputStr = input()

croatias = ["c=","c-","dz=","d-","lj","nj","s=","z="]

for croatia in croatias:
    inputStr = inputStr.replace(croatia, "x")

print(len(inputStr))