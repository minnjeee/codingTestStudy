import sys
input = sys.stdin.readline

N = int(input())

input_dict = {}
for i in range(N):
    age_str, name = input().rstrip().split(' ')
    age = int(age_str)
    if age not in input_dict.keys():
        input_dict[age] = [name]
    else :
        org_list = input_dict[age]
        org_list.append(name)
        input_dict[age] = org_list

result = []
for i in range(1, 201):
    if i in input_dict.keys():
        for name in input_dict[i]:
            result.append(f"{i} {name}")
    
print("\n".join(result))