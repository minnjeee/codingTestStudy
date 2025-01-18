word = input()

wordReverse = ''.join(reversed(word))

# wordReverse = ""
# for w in word:
#     wordReverse = w + wordReverse

# wordList = list(word)
# wordList.reverse()
# wordReverse = ''.join(wordList)

if word == wordReverse:
    print("1")
else:
    print("0")