basicArray = [1,1,2,2,2,8]

inputString = input()
inputArray = inputString.split(' ')

for i in range(6) :
    print(str(basicArray[i] - int(inputArray[i])), end=" ")