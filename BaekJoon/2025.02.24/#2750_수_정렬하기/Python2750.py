N = int(input())

numbers = []
for i in range(N):
    numbers.append(int(input()))

numbers = sorted(numbers)

for num in numbers :
    print(num)