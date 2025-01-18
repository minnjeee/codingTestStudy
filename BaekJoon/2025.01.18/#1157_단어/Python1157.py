inputStr = input()

intList = [0] * 26;

for str in inputStr :
    if str >= 'A' and str <= 'Z':
        intList[ord(str) - ord('A')] = intList[ord(str) - ord('A')] + 1
    elif str >= 'a' and str <= 'z':
        intList[ord(str) - ord('a')] = intList[ord(str) - ord('a')] + 1
        
maxInt = 0
result = '?'
for i in range(len(intList)):
    if intList[i] > maxInt:
        maxInt = intList[i]
        result = chr(i + ord('A'))
    elif intList[i] == maxInt :
        result = '?'
        
print(result)