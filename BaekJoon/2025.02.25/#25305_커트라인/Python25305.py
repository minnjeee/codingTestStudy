N, k = map(int, input().split(' '))
x_list = list(map(int, input().split(' ')))

# 내림차순 정렬
# ex. N = 5, k = 2
for i in range(k): # 0 1
    for j in range(N-1, i, -1) :
        # 0 => N-1, N-2, ... 1
        # 1 => N-1, N-2, ... 2
        if x_list[j] > x_list[j-1]:
            temp = x_list[j]
            x_list[j] = x_list[j-1]
            x_list[j-1] = temp

print(x_list[k-1])