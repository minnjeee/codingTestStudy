while True :
    inputs = map(int, input().split(' '))
    sorted_inputs = sorted(inputs, reverse=True)

    if sorted_inputs[0] == 0 :
        break
    if sorted_inputs[0] >= sorted_inputs[1] + sorted_inputs[2] :
        print('Invalid')
    else :
        if sorted_inputs[0] == sorted_inputs[1] == sorted_inputs[2] :
            print('Equilateral')
        elif sorted_inputs[0] == sorted_inputs[1] or sorted_inputs[1] == sorted_inputs[2] or sorted_inputs[2] == sorted_inputs[0] :
            print('Isosceles')
        else :
            print('Scalene')