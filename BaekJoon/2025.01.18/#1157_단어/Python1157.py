# 1번째 방법
# inputStr = input()

# intList = [0] * 26

# for str in inputStr :
#     if str >= 'A' and str <= 'Z':
#         intList[ord(str) - ord('A')] = intList[ord(str) - ord('A')] + 1
#     elif str >= 'a' and str <= 'z':
#         intList[ord(str) - ord('a')] = intList[ord(str) - ord('a')] + 1
        
# maxInt = 0
# result = '?'
# for i in range(len(intList)):
#     if intList[i] > maxInt:
#         maxInt = intList[i]
#         result = chr(i + ord('A'))
#     elif intList[i] == maxInt :
#         result = '?'
        
# print(result)


# 2번째 방법
result_dict = {}
inputStr = input()

for str in inputStr :
    str = str.upper()
    if str not in result_dict.keys() :
        result_dict[str] = 0
    else :
        result_dict[str] += 1

max_value = max(result_dict.values())
max_value_key = [key for key, value in result_dict.items() if value == max_value]
result = '?'

if len(max_value_key) == 1 :
    result = max_value_key[0]

print(result)