while True :
    num = int(input())
    
    if num == -1 : break

    resultSum = 0
    resultArr = []
    for i in range(1, num) :
        if num % i == 0 :
            resultArr.append(i)
            resultSum += i

    if resultSum == num :
        print(f"{num} = ", end='')
        for resultNum in resultArr :
            if (resultNum != resultArr[len(resultArr)-1]) :
                print(f"{resultNum} + ", end='')
            else :
                print(f"{resultNum}")
    else :
        print(f"{num} is NOT perfect.")