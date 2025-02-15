numbers = map(int, input().split(' '))

numbers = sorted(numbers)

a = numbers[0] + numbers[1]
if numbers[2] >= a :
    print(a + a - 1)
else :
    print(a + numbers[2])