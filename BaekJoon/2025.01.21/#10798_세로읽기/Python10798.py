inputList = []
repeatNum = 0

for i in range(5):
    inputOne = input()
    inputList.append(inputOne)
    if len(inputOne) > repeatNum :
        repeatNum = len(inputOne)

for j in range(repeatNum) :
    for i in range(5) :
        if (len(inputList[i]) > j) :
            print(inputList[i][j], end='')