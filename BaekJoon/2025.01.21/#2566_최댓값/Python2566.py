max = 0
raw, col = 0, 0
for i in range(9):
    inputs =  input().split(' ')
    for j in range(9):
        if int(inputs[j]) > max :
            max = int(inputs[j])
            raw, col = i, j

print(max)
print(raw+1, col+1)