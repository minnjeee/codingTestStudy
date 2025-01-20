inputNum = int(input())
words = []
for i in range(inputNum) :
    words.append(input())

result = 0
for word in words : # happy
    resultBool = True

    for i in range(2, len(word)):
        if (word[i-1] != word[i]):
            for j in range(i-1):
                if word[j] == word[i]:
                    resultBool = False
                    break
        if not resultBool : break
    if resultBool : result += 1

print(result)