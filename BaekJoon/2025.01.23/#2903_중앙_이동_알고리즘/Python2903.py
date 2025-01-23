num = int(input())

nemo_len_n = 1
dot_n = 4

for i in range(num) :
    dot_n += 5
    if i >= 1 :
        dot_n += (nemo_len_n-1)*2 * 4
        dot_n += (nemo_len_n-1) * (nemo_len_n-1) * 3
    nemo_len_n *= 2

print(dot_n)