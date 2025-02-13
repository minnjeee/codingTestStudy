inputs = []
for i in range(3):
    inputs.append(int(input()))

if (sum(inputs) == 180) :
    if inputs[0] == inputs[1] and inputs[1] == inputs[2] : print("Equilateral")
    elif inputs[0] == inputs[1] or inputs[1] == inputs[2] or inputs[0] == inputs[2]: print("Isosceles")
    else: print("Scalene")
else :
    print("Error")