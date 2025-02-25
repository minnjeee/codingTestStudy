numbers = []
for i in range(5):
    numbers.append(int(input()))

# 정렬
numbers = sorted(numbers)

print(int(sum(numbers)/5)) # 평균
print(numbers[2]) # 중앙값