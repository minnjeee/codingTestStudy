import sys
input = sys.stdin.readline
print = sys.stdout.write

N = int(input())
inputs = list(map(int, input().split(' ')))
idx_dict = {data: idx for idx, data in enumerate(sorted(set(inputs)))}

print(' '.join([str(idx_dict[input]) for input in inputs]))